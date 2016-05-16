
package uk.co.padtechnology.datapoint.models.observations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class DV {

    @SerializedName("dataDate")
    @Expose
    private DateTime dataDate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("Location")
    @Expose
    private List<Location> Location = new ArrayList<Location>();

    /**
     * No args constructor for use in serialization
     *
     */
    public DV() {
    }

    /**
     *
     * @param dataDate
     * @param Location
     * @param type
     */
    public DV(DateTime dataDate, String type, List<Location> Location) {
        this.dataDate = dataDate;
        this.type = type;
        this.Location = Location;
    }

    /**
     *
     * @return
     *     The dataDate
     */
    public DateTime getDataDate() {
        return dataDate;
    }

    /**
     *
     * @param dataDate
     *     The dataDate
     */
    public void setDataDate(DateTime dataDate) {
        this.dataDate = dataDate;
    }

    public DV withDataDate(DateTime dataDate) {
        this.dataDate = dataDate;
        return this;
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

    public DV withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The Location
     */
    public List<Location> getLocation() {
        return Location;
    }

    /**
     *
     * @param Location
     *     The Location
     */
    public void setLocation(List<Location> Location) {
        this.Location = Location;
    }

    public DV withLocation(List<Location> Location) {
        this.Location = Location;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataDate).append(type).append(Location).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DV) == false) {
            return false;
        }
        DV rhs = ((DV) other);
        return new EqualsBuilder().append(dataDate, rhs.dataDate).append(type, rhs.type).append(Location, rhs.Location).isEquals();
    }

}
