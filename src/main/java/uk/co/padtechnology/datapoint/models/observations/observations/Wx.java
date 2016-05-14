
package uk.co.padtechnology.datapoint.models.observations.observations;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Wx {

    @SerializedName("Param")
    @Expose
    private List<Param> Param = new ArrayList<Param>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Wx() {
    }

    /**
     *
     * @param Param
     */
    public Wx(List<Param> Param) {
        this.Param = Param;
    }

    /**
     *
     * @return
     *     The Param
     */
    public List<Param> getParam() {
        return Param;
    }

    /**
     *
     * @param Param
     *     The Param
     */
    public void setParam(List<Param> Param) {
        this.Param = Param;
    }

    public Wx withParam(List<Param> Param) {
        this.Param = Param;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Param).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wx) == false) {
            return false;
        }
        Wx rhs = ((Wx) other);
        return new EqualsBuilder().append(Param, rhs.Param).isEquals();
    }

}
