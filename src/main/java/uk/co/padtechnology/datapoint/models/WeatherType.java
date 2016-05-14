package uk.co.padtechnology.datapoint.models;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Phil Jones
 */
public enum WeatherType {

    NOT_AVAILABLE("NA"),
    CLEAR_NIGHT("0"),
    SUNNY_DAY("1"),
    PARTLY_CLOUDY_NIGHT ("2"),
    PARTLY_CLOUDY_DAY ("3"),
    NOT_USED ("4"),
    MIST ("5"),
    FOG ("6"),
    CLOUDY ("7"),
    OVERCAST ("8"),
    LIGHT_RAIN_SHOWER_NIGHT ("9"),
    LIGHT_RAIN_SHOWER_DAY ("10"),
    DRIZZLE ("11"),
    LIGHT_RAIN ("12"),
    HEAVY_RAIN_SHOWER_NIGHT ("13"),
    HEAVY_RAIN_SHOWER_DAY ("14"),
    HEAVY_RAIN ("15"),
    SLEET_SHOWER_NIGHT ("16"),
    SLEET_SHOWER_DAY ("17"),
    SLEET ("18"),
    HAIL_SHOWER_NIGHT ("19"),
    HAIL_SHOWER_DAY ("20"),
    HAIL ("21"),
    LIGHT_SNOW_SHOWER_NIGHT ("22"),
    LIGHT_SNOW_SHOWER_DAY ("23"),
    LIGHT_SNOW ("24"),
    HEAVY_SNOW_SHOWER_NIGHT ("25"),
    HEAVY_SNOW_SHOWER_DAY ("26"),
    HEAVY_SNOW ("27"),
    THUNDER_SHOWER_NIGHT ("28"),
    THUNDER_SHOWER_DAY ("29"),
    THUNDER ("30"),

    ;

    private static final Map<String, WeatherType> CODE_TO_WEATHER_TYPE;

    static{
        final Map<String, WeatherType> codeToWeather = new HashMap<String, WeatherType>();
        for (WeatherType type : WeatherType.values()){
            codeToWeather.put(type.getCode(), type);
        }
        CODE_TO_WEATHER_TYPE = Collections.unmodifiableMap(codeToWeather);
    }

    private String code;

    private WeatherType(final String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static WeatherType getWeatherTypeByCode(final String code){
        if (code == null) return null;

        if (CODE_TO_WEATHER_TYPE.containsKey(code)){
            return CODE_TO_WEATHER_TYPE.get(code);
        }
        else {
            // Arguably better that an Exception is thrown if MetOffice add a new code, rather than silently failing?
            throw new IllegalArgumentException("Code " + code + " is not a recognised MetOffice DataPoint weather code.");
        }
    }
}
