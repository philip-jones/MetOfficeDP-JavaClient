
package uk.co.padtechnology.datapoint.models.capabilities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Resource {

    @SerializedName("res")
    @Expose
    private String res;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("TimeSteps")
    @Expose
    private uk.co.padtechnology.datapoint.models.capabilities.TimeSteps TimeSteps;

    /**
     * No args constructor for use in serialization
     *
     */
    public Resource() {
    }

    /**
     *
     * @param TimeSteps
     * @param res
     * @param type
     */
    public Resource(String res, String type, uk.co.padtechnology.datapoint.models.capabilities.TimeSteps TimeSteps) {
        this.res = res;
        this.type = type;
        this.TimeSteps = TimeSteps;
    }

    /**
     *
     * @return
     *     The res
     */
    public String getRes() {
        return res;
    }

    /**
     *
     * @param res
     *     The res
     */
    public void setRes(String res) {
        this.res = res;
    }

    public Resource withRes(String res) {
        this.res = res;
        return this;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The TimeSteps
     */
    public uk.co.padtechnology.datapoint.models.capabilities.TimeSteps getTimeSteps() {
        return TimeSteps;
    }

    /**
     *
     * @param TimeSteps
     *     The TimeSteps
     */
    public void setTimeSteps(uk.co.padtechnology.datapoint.models.capabilities.TimeSteps TimeSteps) {
        this.TimeSteps = TimeSteps;
    }

    public Resource withTimeSteps(uk.co.padtechnology.datapoint.models.capabilities.TimeSteps TimeSteps) {
        this.TimeSteps = TimeSteps;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(res).append(type).append(TimeSteps).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return new EqualsBuilder().append(res, rhs.res).append(type, rhs.type).append(TimeSteps, rhs.TimeSteps).isEquals();
    }

}
