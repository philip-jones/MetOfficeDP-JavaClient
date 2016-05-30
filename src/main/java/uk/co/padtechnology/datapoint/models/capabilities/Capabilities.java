
package uk.co.padtechnology.datapoint.models.capabilities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;
import uk.co.padtechnology.datapoint.models.gsonConverters.DateTimeConverter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Capabilities {

    @SerializedName("Resource")
    @Expose
    private uk.co.padtechnology.datapoint.models.capabilities.Resource Resource;

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
    public Capabilities(uk.co.padtechnology.datapoint.models.capabilities.Resource Resource) {
        this.Resource = Resource;
    }

    /**
     *
     * @return
     *     The Resource
     */
    public uk.co.padtechnology.datapoint.models.capabilities.Resource getResource() {
        return Resource;
    }

    /**
     *
     * @param Resource
     *     The Resource
     */
    public void setResource(uk.co.padtechnology.datapoint.models.capabilities.Resource Resource) {
        this.Resource = Resource;
    }

    public Capabilities withResource(uk.co.padtechnology.datapoint.models.capabilities.Resource Resource) {
        this.Resource = Resource;
        return this;
    }

    /**
     * Convenience method to return a List of timepoints after the specified
     * DateTime.  Useful for example to determine the list of available timestamps
     * after the latest database record.
     * @param after all returned timestamps are after this date.
     * @return a List of timepoints after the specified
     * DateTime.

     */
    public List<DateTime> getTimestampsAfter(DateTime after){
        if (Resource == null) return Collections.emptyList();
        TimeSteps timeSteps = Resource.getTimeSteps();
        if (timeSteps == null) return Collections.emptyList();
        List<DateTime> matching = new ArrayList<>();
        for (DateTime ts : timeSteps.getTS()){
            if (ts.isAfter(after)) matching.add(ts);
        }
        return matching;
    }

    /**
     * Conenience method to return the DateTime of the latest observation. (Which is the point
     * of this web service call?)
     * To allow calling code to determine whether to ask for new set of observations.
     * @return the DateTime of the latest observation.
     */
    public DateTime getLatestTimeStamp(){
        DateTime mostRecent = DateTimeConverter.START_EPOCH;
        if (Resource == null) return mostRecent;
        TimeSteps timeSteps = Resource.getTimeSteps();
        if (timeSteps == null) return mostRecent;
        for (DateTime ts : timeSteps.getTS()){
            if (ts.isAfter(mostRecent)) mostRecent = ts;
        }
        return mostRecent;
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
