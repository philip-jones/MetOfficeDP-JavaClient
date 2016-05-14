
package uk.co.padtechnology.datapoint.models.observations.sitelist;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SiteList {

    @SerializedName("Locations")
    @Expose
    private uk.co.padtechnology.datapoint.models.observations.sitelist.Locations Locations;

    /**
     * No args constructor for use in serialization
     *
     */
    public SiteList() {
    }

    /**
     *
     * @param Locations
     */
    public SiteList(uk.co.padtechnology.datapoint.models.observations.sitelist.Locations Locations) {
        this.Locations = Locations;
    }

    /**
     *
     * @return
     *     The Locations
     */
    public uk.co.padtechnology.datapoint.models.observations.sitelist.Locations getLocations() {
        return Locations;
    }

    /**
     *
     * @param Locations
     *     The Locations
     */
    public void setLocations(uk.co.padtechnology.datapoint.models.observations.sitelist.Locations Locations) {
        this.Locations = Locations;
    }

    public SiteList withLocations(uk.co.padtechnology.datapoint.models.observations.sitelist.Locations Locations) {
        this.Locations = Locations;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Locations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiteList) == false) {
            return false;
        }
        SiteList rhs = ((SiteList) other);
        return new EqualsBuilder().append(Locations, rhs.Locations).isEquals();
    }

}
