
package uk.co.padtechnology.datapoint.models.observations.capabilities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Capabilities {

    @SerializedName("Resource")
    @Expose
    private uk.co.padtechnology.datapoint.models.observations.capabilities.Resource Resource;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Capabilities() {
    }

    /**
     * 
     * @param Resource
     */
    public Capabilities(uk.co.padtechnology.datapoint.models.observations.capabilities.Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * 
     * @return
     *     The Resource
     */
    public uk.co.padtechnology.datapoint.models.observations.capabilities.Resource getResource() {
        return Resource;
    }

    /**
     * 
     * @param Resource
     *     The Resource
     */
    public void setResource(uk.co.padtechnology.datapoint.models.observations.capabilities.Resource Resource) {
        this.Resource = Resource;
    }

    public Capabilities withResource(uk.co.padtechnology.datapoint.models.observations.capabilities.Resource Resource) {
        this.Resource = Resource;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Resource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Capabilities) == false) {
            return false;
        }
        Capabilities rhs = ((Capabilities) other);
        return new EqualsBuilder().append(Resource, rhs.Resource).isEquals();
    }

}
