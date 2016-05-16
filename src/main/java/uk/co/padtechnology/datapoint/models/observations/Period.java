
package uk.co.padtechnology.datapoint.models.observations;

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
public class Period {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private DateTime value;
    @SerializedName("Rep")
    @Expose
    private List<uk.co.padtechnology.datapoint.models.observations.Rep> Rep = new ArrayList<uk.co.padtechnology.datapoint.models.observations.Rep>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Period() {
    }

    /**
     *
     * @param value
     * @param type
     * @param Rep
     */
    public Period(String type, DateTime value, List<uk.co.padtechnology.datapoint.models.observations.Rep> Rep) {
        this.type = type;
        this.value = value;
        this.Rep = Rep;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Period withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The value
     */
    public DateTime getValue() {
        return value;
    }

    /**
     *
     * @param value
     *     The value
     */
    public void setValue(DateTime value) {
        this.value = value;
    }

    public Period withValue(DateTime value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @return
     *     The Rep
     */
    public List<uk.co.padtechnology.datapoint.models.observations.Rep> getRep() {
        return Rep;
    }

    /**
     *
     * @param Rep
     *     The Rep
     */
    public void setRep(List<uk.co.padtechnology.datapoint.models.observations.Rep> Rep) {
        this.Rep = Rep;
    }

    public Period withRep(List<uk.co.padtechnology.datapoint.models.observations.Rep> Rep) {
        this.Rep = Rep;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(value).append(Rep).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Period) == false) {
            return false;
        }
        Period rhs = ((Period) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).append(Rep, rhs.Rep).isEquals();
    }

}
