
package uk.co.padtechnology.datapoint.models.observations;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SiteRep {

    @SerializedName("Wx")
    @Expose
    private Wx Wx;
    @SerializedName("DV")
    @Expose
    private DV DV;

    /**
     * No args constructor for use in serialization
     *
     */
    public SiteRep() {
    }

    /**
     *
     * @param Wx
     * @param DV
     */
    public SiteRep(Wx Wx, DV DV) {
        this.Wx = Wx;
        this.DV = DV;
    }

    /**
     *
     * @return
     *     The Wx
     */
    public Wx getWx() {
        return Wx;
    }

    /**
     *
     * @param Wx
     *     The Wx
     */
    public void setWx(Wx Wx) {
        this.Wx = Wx;
    }

    public SiteRep withWx(Wx Wx) {
        this.Wx = Wx;
        return this;
    }

    /**
     *
     * @return
     *     The DV
     */
    public DV getDV() {
        return DV;
    }

    /**
     *
     * @param DV
     *     The DV
     */
    public void setDV(DV DV) {
        this.DV = DV;
    }

    public SiteRep withDV(DV DV) {
        this.DV = DV;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Wx).append(DV).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiteRep) == false) {
            return false;
        }
        SiteRep rhs = ((SiteRep) other);
        return new EqualsBuilder().append(Wx, rhs.Wx).append(DV, rhs.DV).isEquals();
    }

}
