
package uk.co.padtechnology.datapoint.models.observations;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Observations {

    @SerializedName("SiteRep")
    @Expose
    private SiteRep SiteRep;

    /**
     * No args constructor for use in serialization
     *
     */
    public Observations() {
    }

    /**
     *
     * @param SiteRep
     */
    public Observations(SiteRep SiteRep) {
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

    public Observations withSiteRep(SiteRep SiteRep) {
        this.SiteRep = SiteRep;
        return this;
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
        if ((other instanceof Observations) == false) {
            return false;
        }
        Observations rhs = ((Observations) other);
        return new EqualsBuilder().append(SiteRep, rhs.SiteRep).isEquals();
    }

}
