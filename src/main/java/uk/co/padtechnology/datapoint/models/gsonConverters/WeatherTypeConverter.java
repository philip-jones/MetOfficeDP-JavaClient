package uk.co.padtechnology.datapoint.models.gsonConverters;

import com.google.gson.*;
import uk.co.padtechnology.datapoint.models.WeatherType;

import java.lang.reflect.Type;

/**
 * @author Phil Jones
 */
public class WeatherTypeConverter implements JsonSerializer<WeatherType>, JsonDeserializer<WeatherType> {

    @Override
    public JsonElement serialize(final WeatherType weatherType, final Type srcType, final JsonSerializationContext context) {
        return new JsonPrimitive(weatherType.getCode());
    }

    @Override
    public WeatherType deserialize(final JsonElement json, final Type type, final JsonDeserializationContext context)
            throws JsonParseException {
        final String weatherCode = json.getAsString();
        return WeatherType.getWeatherTypeByCode(weatherCode);
    }
}
