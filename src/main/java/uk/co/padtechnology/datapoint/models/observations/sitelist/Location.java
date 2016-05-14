
package uk.co.padtechnology.datapoint.models.observations.sitelist;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Location {

    @SerializedName("elevation")
    @Expose
    private Float elevation;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("unitaryAuthArea")
    @Expose
    private String unitaryAuthArea;
    @SerializedName("obsSource")
    @Expose
    private String obsSource;
    @SerializedName("nationalPark")
    @Expose
    private String nationalPark;

    /**
     * No args constructor for use in serialization
     *
     */
    public Location() {
    }

    /**
     *
     * @param region
     * @param id
     * @param name
     * @param elevation
     * @param obsSource
     * @param longitude
     * @param latitude
     * @param nationalPark
     * @param unitaryAuthArea
     */
    public Location(Float elevation, int id, Float latitude, Float longitude, String name, String region, String unitaryAuthArea, String obsSource, String nationalPark) {
        this.elevation = elevation;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.region = region;
        this.unitaryAuthArea = unitaryAuthArea;
        this.obsSource = obsSource;
        this.nationalPark = nationalPark;
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
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Location withId(int id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     *     The latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Location withLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     *
     * @return
     *     The longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Location withLongitude(Float longitude) {
        this.longitude = longitude;
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
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public Location withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     *
     * @return
     *     The unitaryAuthArea
     */
    public String getUnitaryAuthArea() {
        return unitaryAuthArea;
    }

    /**
     *
     * @param unitaryAuthArea
     *     The unitaryAuthArea
     */
    public void setUnitaryAuthArea(String unitaryAuthArea) {
        this.unitaryAuthArea = unitaryAuthArea;
    }

    public Location withUnitaryAuthArea(String unitaryAuthArea) {
        this.unitaryAuthArea = unitaryAuthArea;
        return this;
    }

    /**
     *
     * @return
     *     The obsSource
     */
    public String getObsSource() {
        return obsSource;
    }

    /**
     *
     * @param obsSource
     *     The obsSource
     */
    public void setObsSource(String obsSource) {
        this.obsSource = obsSource;
    }

    public Location withObsSource(String obsSource) {
        this.obsSource = obsSource;
        return this;
    }

    /**
     *
     * @return
     *     The nationalPark
     */
    public String getNationalPark() {
        return nationalPark;
    }

    /**
     *
     * @param nationalPark
     *     The nationalPark
     */
    public void setNationalPark(String nationalPark) {
        this.nationalPark = nationalPark;
    }

    public Location withNationalPark(String nationalPark) {
        this.nationalPark = nationalPark;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(elevation).append(id).append(latitude).append(longitude).append(name).append(region).append(unitaryAuthArea).append(obsSource).append(nationalPark).toHashCode();
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
        return new EqualsBuilder().append(elevation, rhs.elevation).append(id, rhs.id).append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(name, rhs.name).append(region, rhs.region).append(unitaryAuthArea, rhs.unitaryAuthArea).append(obsSource, rhs.obsSource).append(nationalPark, rhs.nationalPark).isEquals();
    }

}
