package uk.co.padtechnology.datapoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import uk.co.padtechnology.datapoint.models.gsonConverters.DateTimeConverter;
import uk.co.padtechnology.datapoint.models.gsonConverters.PeriodAdapter;
import uk.co.padtechnology.datapoint.models.gsonConverters.RepAdapter;
import uk.co.padtechnology.datapoint.models.gsonConverters.WeatherTypeConverter;
import uk.co.padtechnology.datapoint.models.capabilities.Capabilities;
import uk.co.padtechnology.datapoint.models.siterep.ObsForecasts;
import uk.co.padtechnology.datapoint.models.WeatherType;
import uk.co.padtechnology.datapoint.models.sitelist.SiteList;
import uk.co.padtechnology.datapoint.models.siterep.Period;
import uk.co.padtechnology.datapoint.models.siterep.Rep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Phil Jones
 */
public class DataPointClient {

    public static final String BASE_URL = "http://datapoint.metoffice.gov.uk/public/data/";

    private static final String URL_FORMER = BASE_URL + "%s?key=%s";

    public static final Map<String, String> NO_PARAMS = Collections.emptyMap();

    public static final Map<String, String> RES_HOURLY = Collections.singletonMap("res","hourly");
    public static final Map<String, String> RES_3HOURLY = Collections.singletonMap("res","3hourly");

    public static final Gson GSON;

    static{
        final Type periodClassListType = new TypeToken<List<Period>>() {}.getType();
        final Type repClassListType = new TypeToken<List<Rep>>() {}.getType();
        GSON = new GsonBuilder()
                .registerTypeAdapter(DateTime.class, new DateTimeConverter())
                .registerTypeAdapter(WeatherType.class, new WeatherTypeConverter())
                .registerTypeAdapter(periodClassListType, new PeriodAdapter())
                .registerTypeAdapter(repClassListType, new RepAdapter())
                .setPrettyPrinting()
                .create();
    }

    private String apiKey;

    public DataPointClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public SiteList getObservationSiteList() throws IOException{
        final String response = getJsonResponse("val/wxobs/all/json/sitelist", apiKey, NO_PARAMS);
        return GSON.fromJson(response, SiteList.class);
    }

    public Capabilities getObservationCapabilities() throws IOException{
        final String response = getJsonResponse("val/wxobs/all/json/capabilities", apiKey, RES_HOURLY);
        return GSON.fromJson(response, Capabilities.class);
    }

    public ObsForecasts getObservations() throws IOException {
        final String response = getJsonResponse("val/wxobs/all/json/all", apiKey, RES_HOURLY);
        return GSON.fromJson(response, ObsForecasts.class);
    }

    public ObsForecasts getObservationsAtTimeStamp(final DateTime time) throws IOException {
        final String timeString = DateTimeConverter.DATAPOINT_HOUR_FORMAT.print(time);
        final Map<String, String> params = new HashMap<>(2);
        params.putAll(RES_HOURLY);
        params.put("time",timeString);
        final String response = getJsonResponse("val/wxobs/all/json/all", apiKey, params);
        return GSON.fromJson(response, ObsForecasts.class);
    }

    public SiteList getForecastSiteList() throws IOException{
        final String response = getJsonResponse("val/wxfcs/all/json/sitelist", apiKey, NO_PARAMS);
        return GSON.fromJson(response, SiteList.class);
    }

    public Capabilities getForecastCapabilities() throws IOException {
        final String response = getJsonResponse("val/wxfcs/all/json/capabilities", apiKey, RES_3HOURLY);
        return GSON.fromJson(response, Capabilities.class);
    }

    public ObsForecasts getForecasts() throws IOException {
        String response = getJsonResponse("val/wxfcs/all/json/all", apiKey, RES_3HOURLY);
        return GSON.fromJson(response, ObsForecasts.class);
    }


    private String getJsonResponse(final String request, final String apiKey, final Map<String, String> params) throws IOException {
        final CloseableHttpClient httpClient = HttpClients.createDefault();
        final HttpGet httpGet = new HttpGet(buildUrl(request, apiKey, params));
        final CloseableHttpResponse response = httpClient.execute(httpGet);
        BufferedReader buf = null;
        try {
            final HttpEntity entity = response.getEntity();
            // do something useful with the response body
            final StringBuilder json = new StringBuilder();
            buf = new BufferedReader(new InputStreamReader(entity.getContent()));
            String line;
            while((line = buf.readLine()) != null){
                json.append(line);
            }

            // and ensure it is fully consumed
            EntityUtils.consume(entity);
            return json.toString();
        } finally {
            response.close();
            if (buf != null){
                buf.close();
            }
        }
    }

    private String buildUrl(final String resource, final String apiKey, final Map<String, String> params){
        final StringBuilder url = new StringBuilder(String.format(URL_FORMER, resource, apiKey));
        for (final String paramKey : params.keySet()){
            url.append('&')
               .append(paramKey)
               .append('=')
               .append(params.get(paramKey));
        }
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Test usage of DataPoint Client.");
        if (args.length < 1) {
            System.err.println("Usage: java -jar DataPointClient.jar [API-KEY]");
            System.exit(1);
        }
        final String apiKey = args[0];

        final DataPointClient client = new DataPointClient(apiKey);

        try {
            System.out.println(client.getObservationSiteList());
            System.out.println("------------");
            final Capabilities obsCapabilities =  client.getObservationCapabilities();
            System.out.println(obsCapabilities);
            System.out.println("------------");
            final List<DateTime> timestamps = obsCapabilities.getResource().getTimeSteps().getTS();
            System.out.println("A total of " + timestamps.size() + " time points to retrieve.");
            for (DateTime timePoint : timestamps){
                System.out.println("Observations for " + timePoint);
                System.out.println(client.getObservationsAtTimeStamp(timePoint));
            }
            System.out.println("------------");
            ObsForecasts observations = client.getObservations();
            System.out.println(observations);
            for(DateTime time : observations.getSiteRep().getDV().getLocation().get(0).getPeriod().get(0).getTimeStampToReps().keySet()){
                System.out.println(time);
            }
            System.out.println("------------");
            System.out.println(client.getForecastSiteList());
            System.out.println("------------");
            System.out.println(client.getForecastCapabilities());
            System.out.println("------------");
            System.out.println(client.getForecasts());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
