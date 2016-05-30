package uk.co.padtechnology.datapoint.models.gsonConverters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import uk.co.padtechnology.datapoint.models.siterep.Rep;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Phil Jones
 * Adapter to allow GSON to cope with the fact that a Period may be a singleton (not in an array)
 * or an array of Period objects.
 */
public class RepAdapter implements JsonDeserializer<List<Rep>> {

    public List<Rep> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
        final List<Rep> vals = new ArrayList<>();
        if (json.isJsonArray()) {
            for (final JsonElement e : json.getAsJsonArray()) {
                vals.add((Rep) ctx.deserialize(e, Rep.class));
            }
        } else if (json.isJsonObject()) {
            vals.add((Rep) ctx.deserialize(json, Rep.class));
        } else {
            throw new RuntimeException("Unexpected JSON type: " + json.getClass());
        }
        return vals;
    }

}
