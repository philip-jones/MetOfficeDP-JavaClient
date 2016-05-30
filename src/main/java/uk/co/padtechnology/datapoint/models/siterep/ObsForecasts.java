
package uk.co.padtechnology.datapoint.models.siterep;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("org.jsonschema2pojo")
public class ObsForecasts {

    @SerializedName("SiteRep")
    @Expose
    private SiteRep SiteRep;

    /**
     * No args constructor for use in serialization
     *
     */
    public ObsForecasts() {
    }

    /**
     *
     * @param SiteRep
     */
    public ObsForecasts(SiteRep SiteRep) {
        this.SiteRep = SiteRep;
    }

    /**
     *
     * @return
     *     The SiteRep
     */
    public SiteRep getSiteRep() {
        return SiteRep;
    }

    /**
     *
     * @param SiteRep
     *     The SiteRep
     */
    public void setSiteRep(SiteRep SiteRep) {
        this.SiteRep = SiteRep;
    }

    public ObsForecasts withSiteRep(SiteRep SiteRep) {
        this.SiteRep = SiteRep;
        return this;
    }

    /**
     * Convenience method to return a List of Location objects embedded within the SiteRep object.
     * @return a List of Location objects
     */
    public List<Location> getLocations(){
        if (SiteRep == null) return Collections.emptyList();
        if (SiteRep.getDV() == null) return Collections.emptyList();
        return SiteRep.getDV().getLocation();
    }

    /**
     * Convenience method to return a Map<Integer, Location> being a map of location Ids to Locations.
     * Useful for quick lookup of a location in (e.g.) a database, before storing a data point.
     * @return  a Map<Integer, Location> being a map of location Ids to Locations.
     */
    public Map<Integer, Location> getLocationIdToLocationMap(){
        final List<Location> locations = getLocations();
        final Map<Integer, Location> idToLocation = new HashMap<>(locations.size());
        for (final Location location : locations){
            idToLocation.put(location.getI(), location);
        }
        return idToLocation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SiteRep).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObsForecasts) == false) {
            return false;
        }
        ObsForecasts rhs = ((ObsForecasts) other);
        return new EqualsBuilder().append(SiteRep, rhs.SiteRep).isEquals();
    }

}
