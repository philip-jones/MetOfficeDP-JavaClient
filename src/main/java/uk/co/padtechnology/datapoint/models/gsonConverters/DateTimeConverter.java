package uk.co.padtechnology.datapoint.models.gsonConverters;

import com.google.gson.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.lang.reflect.Type;

/**
 * @author Phil Jones
 */
public class DateTimeConverter implements JsonSerializer<DateTime>, JsonDeserializer<DateTime> {

    /*     2016-05-12T14:00:00Z    */

    public static final DateTimeFormatter DATAPOINT_TS_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(DateTimeZone.UTC);

    /*     2016-05-13Z */
    public static final DateTimeFormatter DATAPOINT_DATE_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd'Z'").withZone(DateTimeZone.UTC);

    @Override
    public JsonElement serialize(final DateTime dateTime, final Type srcType, final JsonSerializationContext context) {
        return new JsonPrimitive(DATAPOINT_TS_FORMAT.print(dateTime));
    }

    @Override
    public DateTime deserialize(final JsonElement json, final Type type, final JsonDeserializationContext context)
            throws JsonParseException {
        final String dateString = json.getAsString();
        if (dateString.indexOf('T') == -1){  // TimeStamp
            return DATAPOINT_DATE_FORMAT.parseDateTime(dateString);
        }
        else{                                // Date only
            return DATAPOINT_TS_FORMAT.parseDateTime(dateString);
        }
    }
}
