
package uk.co.padtechnology.datapoint.models.siterep;

import java.util.*;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;

@Generated("org.jsonschema2pojo")
public class Location {

    @SerializedName("i")
    @Expose
    private int i;
    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lon")
    @Expose
    private Float lon;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("continent")
    @Expose
    private String continent;
    @SerializedName("elevation")
    @Expose
    private Float elevation;
    @SerializedName("Period")
    @Expose
    private List<Period> Period = new ArrayList<Period>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Location() {
    }

    /**
     *
     * @param Period
     * @param lon
     * @param elevation
     * @param name
     * @param continent
     * @param lat
     * @param country
     * @param i
     */
    public Location(int i, Float lat, Float lon, String name, String country, String continent, Float elevation, List<Period> Period) {
        this.i = i;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.country = country;
        this.continent = continent;
        this.elevation = elevation;
        this.Period = Period;
    }

    /**
     *
     * @return
     *     The i
     */
    public int getI() {
        return i;
    }

    /**
     *
     * @param i
     *     The i
     */
    public void setI(int i) {
        this.i = i;
    }

    public Location withI(int i) {
        this.i = i;
        return this;
    }

    /**
     *
     * @return
     *     The lat
     */
    public Float getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     *     The lat
     */
    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Location withLat(Float lat) {
        this.lat = lat;
        return this;
    }

    /**
     *
     * @return
     *     The lon
     */
    public Float getLon() {
        return lon;
    }

    /**
     *
     * @param lon
     *     The lon
     */
    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Location withLon(Float lon) {
        this.lon = lon;
        return this;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Location withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Location withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @return
     *     The continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     *
     * @param continent
     *     The continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Location withContinent(String continent) {
        this.continent = continent;
        return this;
    }

    /**
     *
     * @return
     *     The elevation
     */
    public Float getElevation() {
        return elevation;
    }

    /**
     *
     * @param elevation
     *     The elevation
     */
    public void setElevation(Float elevation) {
        this.elevation = elevation;
    }

    public Location withElevation(Float elevation) {
        this.elevation = elevation;
        return this;
    }

    /**
     *
     * @return
     *     The Period
     */
    public List<Period> getPeriod() {
        return Period;
    }

    /**
     *
     * @param Period
     *     The Period
     */
    public void setPeriod(List<Period> Period) {
        this.Period = Period;
    }

    public Location withPeriod(List<Period> Period) {
        this.Period = Period;
        return this;
    }

    /**
     * Convenience method to place the Reps into a Map<DateTime, Rep>
     * for quick lookup of a Rep by DateTime.
     * @return a Map<DateTime, Rep> of Rep DateTimes to Reps.
     *
     * Assumes that in the List of Periods within this Location, there will be a unique
     * set of DateTime timepoints for all wrapped Reps.  Not sure what the semantics would
     * be if this was not the case...
     * @return a Map<DateTime, Rep> of Rep DateTimes to Reps.
     */
    public Map<DateTime, Rep> getTimeStampToReps(){
        if (this.Period == null) return Collections.emptyMap();
        final Map<DateTime, Rep> repMap = new HashMap<>();
        for (final Period period : this.Period){
            repMap.putAll(period.getTimeStampToReps());
        }
        return repMap;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(i).append(lat).append(lon).append(name).append(country).append(continent).append(elevation).append(Period).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(i, rhs.i).append(lat, rhs.lat).append(lon, rhs.lon).append(name, rhs.name).append(country, rhs.country).append(continent, rhs.continent).append(elevation, rhs.elevation).append(Period, rhs.Period).isEquals();
    }

}
