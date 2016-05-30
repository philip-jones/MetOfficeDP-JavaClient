package uk.co.padtechnology.datapoint.models.gsonConverters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import uk.co.padtechnology.datapoint.models.siterep.Period;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Phil Jones
 * Adapter to allow GSON to cope with the fact that a Period may be a singleton (not in an array)
 * or an array of Period objects.
 */
public class PeriodAdapter implements JsonDeserializer<List<Period>> {

    public List<Period> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
        final List<Period> vals = new ArrayList<>();
        if (json.isJsonArray()) {
            for (final JsonElement e : json.getAsJsonArray()) {
                vals.add((Period) ctx.deserialize(e, Period.class));
            }
        } else if (json.isJsonObject()) {
            vals.add((Period) ctx.deserialize(json, Period.class));
        } else {
            throw new RuntimeException("Unexpected JSON type: " + json.getClass());
        }
        return vals;
    }

}
