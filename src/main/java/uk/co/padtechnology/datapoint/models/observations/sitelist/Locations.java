
package uk.co.padtechnology.datapoint.models.observations.sitelist;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Locations {

    @SerializedName("Location")
    @Expose
    private List<uk.co.padtechnology.datapoint.models.observations.sitelist.Location> Location = new ArrayList<uk.co.padtechnology.datapoint.models.observations.sitelist.Location>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Locations() {
    }

    /**
     *
     * @param Location
     */
    public Locations(List<uk.co.padtechnology.datapoint.models.observations.sitelist.Location> Location) {
        this.Location = Location;
    }

    /**
     *
     * @return
     *     The Location
     */
    public List<uk.co.padtechnology.datapoint.models.observations.sitelist.Location> getLocation() {
        return Location;
    }

    /**
     *
     * @param Location
     *     The Location
     */
    public void setLocation(List<uk.co.padtechnology.datapoint.models.observations.sitelist.Location> Location) {
        this.Location = Location;
    }

    public Locations withLocation(List<uk.co.padtechnology.datapoint.models.observations.sitelist.Location> Location) {
        this.Location = Location;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Location).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Locations) == false) {
            return false;
        }
        Locations rhs = ((Locations) other);
        return new EqualsBuilder().append(Location, rhs.Location).isEquals();
    }

}
