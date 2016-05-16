
package uk.co.padtechnology.datapoint.models.capabilities;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

@Generated("org.jsonschema2pojo")
public class TimeSteps {

    @SerializedName("TS")
    @Expose
    private List<DateTime> TS = new ArrayList<DateTime>();

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeSteps() {
    }

    /**
     *
     * @param TS
     */
    public TimeSteps(List<DateTime> TS) {
        this.TS = TS;
    }

    /**
     *
     * @return
     *     The TS
     */
    public List<DateTime> getTS() {
        return TS;
    }

    /**
     *
     * @param TS
     *     The TS
     */
    public void setTS(List<DateTime> TS) {
        this.TS = TS;
    }

    public TimeSteps withTS(List<DateTime> TS) {
        this.TS = TS;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TS).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeSteps) == false) {
            return false;
        }
        TimeSteps rhs = ((TimeSteps) other);
        return new EqualsBuilder().append(TS, rhs.TS).isEquals();
    }

}
