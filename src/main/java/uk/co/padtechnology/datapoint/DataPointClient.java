package uk.co.padtechnology.datapoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import uk.co.padtechnology.datapoint.models.gsonConverters.DateTimeConverter;
import uk.co.padtechnology.datapoint.models.gsonConverters.WeatherTypeConverter;
import uk.co.padtechnology.datapoint.models.observations.capabilities.Capabilities;
import uk.co.padtechnology.datapoint.models.observations.observations.Observations;
import uk.co.padtechnology.datapoint.models.WeatherType;
import uk.co.padtechnology.datapoint.models.observations.sitelist.SiteList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;

/**
 * @author Phil Jones
 */
public class DataPointClient {

    public static final String BASE_URL = "http://datapoint.metoffice.gov.uk/public/data/";

    private static final String URL_FORMER = BASE_URL + "%s?key=%s";

    public static final Map<String, String> NO_PARAMS = Collections.emptyMap();

    public static final Map<String, String> RES_HOURLY = Collections.singletonMap("res","hourly");

    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(DateTime.class, new DateTimeConverter())
            .registerTypeAdapter(WeatherType.class, new WeatherTypeConverter())
            .setPrettyPrinting()
            .create();





    public SiteList getObservationSiteList(final String apiKey) throws IOException{
        final String response = getJsonResponse("val/wxobs/all/json/sitelist", apiKey, NO_PARAMS);
        return GSON.fromJson(response, SiteList.class);
    }

    public Capabilities getObservationCapabilities(final String apiKey) throws IOException{
        final String response = getJsonResponse("val/wxobs/all/json/capabilities", apiKey, RES_HOURLY);
        return GSON.fromJson(response, Capabilities.class);
    }

    public Observations getObservations(final String apiKey) throws IOException {
        final String response = getJsonResponse("val/wxobs/all/json/all", apiKey, RES_HOURLY);
        return GSON.fromJson(response, Observations.class);
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
        System.out.println("url = " + url);
        return url.toString();
    }

    public static void main(String[] args) {
        System.out.println("Test usage of DataPoint Client.");
        if (args.length < 1) {
            System.err.println("Usage: java -jar DataPointClient.jar [API-KEY]");
            System.exit(1);
        }
        final String apiKey = args[0];

        final DataPointClient client = new DataPointClient();

        try {
            System.out.println(client.getObservationSiteList(apiKey));
            System.out.println("------------");
            System.out.println(client.getObservationCapabilities(apiKey));
            System.out.println("------------");
            System.out.println(client.getObservations(apiKey));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
