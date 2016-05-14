
package uk.co.padtechnology.datapoint.models.observations.observations;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Param {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("units")
    @Expose
    private String units;
    @SerializedName("$")
    @Expose
    private String $;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Param() {
    }

    /**
     * 
     * @param $
     * @param name
     * @param units
     */
    public Param(String name, String units, String $) {
        this.name = name;
        this.units = units;
        this.$ = $;
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

    public Param withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The units
     */
    public String getUnits() {
        return units;
    }

    /**
     * 
     * @param units
     *     The units
     */
    public void setUnits(String units) {
        this.units = units;
    }

    public Param withUnits(String units) {
        this.units = units;
        return this;
    }

    /**
     * 
     * @return
     *     The $
     */
    public String get$() {
        return $;
    }

    /**
     * 
     * @param $
     *     The $
     */
    public void set$(String $) {
        this.$ = $;
    }

    public Param with$(String $) {
        this.$ = $;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(units).append($).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Param) == false) {
            return false;
        }
        Param rhs = ((Param) other);
        return new EqualsBuilder().append(name, rhs.name).append(units, rhs.units).append($, rhs.$).isEquals();
    }

}
