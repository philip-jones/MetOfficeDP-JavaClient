
package uk.co.padtechnology.datapoint.models.siterep;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;
import uk.co.padtechnology.datapoint.models.WeatherType;

@Generated("org.jsonschema2pojo")
public class Rep {

    @SerializedName("G")
    @Expose
    private Integer windGust;

    @SerializedName("T")
    @Expose
    private Float temperature;

    @SerializedName("V")
    @Expose
    private String visibility;

    @SerializedName("D")
    @Expose
    private String windDirection;

    @SerializedName("S")
    @Expose
    private Integer windSpeed;

    @SerializedName("W")
    @Expose
    private WeatherType weatherType;

    @SerializedName("P")
    @Expose
    private Integer pressure;

    @SerializedName("Pt")
    @Expose
    private String pressureTendancy;

    @SerializedName("Dp")
    @Expose
    private Float dewPoint;

    @SerializedName("H")
    @Expose
    private Float screenRelativeHumidity;

    @SerializedName("U")
    @Expose
    private Integer maxUvIndex;

    @SerializedName("Pp")
    @Expose
    private Integer precipitationProbability;


    /**
     * The value of a Rep object ($ in the JSON representation) denotes the
     * number of minutes after midnight UTC on the day represented by the
     * Period object in which the Rep object is found.
     */
    @SerializedName("$")
    @Expose
    private Float $;








    /**
     * No args constructor for use in serialization
     *
     */
    public Rep() {
    }

    /**
     *
     * @param temperature
     * @param $
     * @param dewPoint
     * @param screenRelativeHumidity
     */
    public Rep(Float screenRelativeHumidity, Float temperature, Float dewPoint, Float $, String windDirection, Integer windGust, Integer pressure, Integer windSpeed, String visibility, WeatherType weatherType, String pressureTendancy, Integer maxUvIndex, Integer precipitationProbability) {
        this.screenRelativeHumidity = screenRelativeHumidity;
        this.temperature = temperature;
        this.dewPoint = dewPoint;
        this.$ = $;
        this.windDirection = windDirection;
        this.windGust = windGust;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.visibility = visibility;
        this.weatherType = weatherType;
        this.pressureTendancy = pressureTendancy;
        this.maxUvIndex = maxUvIndex;
        this.precipitationProbability = precipitationProbability;
    }

    /**
     *
     * @return
     *     The screenRelativeHumidity
     */
    public Float getScreenRelativeHumidity() {
        return screenRelativeHumidity;
    }

    /**
     *
     * @param H
     *     The screenRelativeHumidity
     */
    public void setScreenRelativeHumidity(Float H) {
        this.screenRelativeHumidity = H;
    }

    public Rep withH(Float H) {
        this.screenRelativeHumidity = H;
        return this;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Rep withD(String d){
        this.windDirection = d;
        return this;
    }

    public String getPressureTendancy() {
        return pressureTendancy;
    }

    public void setPressureTendancy(String pressureTendancy) {
        this.pressureTendancy = pressureTendancy;
    }

    public Rep withPt(String pt) {
        this.pressureTendancy = pt;
        return this;
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
    }

    public Rep withWeatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
        return this;
    }

    public Integer getWindGust() {
        return windGust;
    }

    public void setWindGust(Integer windGust) {
        this.windGust = windGust;
    }

    public Rep withG(Integer g) {
        this.windGust = g;
        return this;
    }

    public Integer getMaxUvIndex() {
        return maxUvIndex;
    }

    public void setMaxUvIndex(Integer maxUvIndex) {
        this.maxUvIndex = maxUvIndex;
    }

    public Rep withMaxUvIndex(Integer maxUvIndex) {
        this.maxUvIndex = maxUvIndex;
        return this;
    }

    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public Rep withPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Rep withP(Integer p) {
        this.pressure = p;
        return this;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Rep withS(Integer s) {
        this.windSpeed = s;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Rep withV(String v) {
        this.visibility = v;
        return this;
    }

    /**
     *
     * @return
     *     The temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     *
     * @param T
     *     The temperature
     */
    public void setTemperature(Float T) {
        this.temperature = T;
    }

    public Rep withT(Float T) {
        this.temperature = T;
        return this;
    }

    /**
     *
     * @return
     *     The dewPoint
     */
    public Float getDewPoint() {
        return dewPoint;
    }

    /**
     *
     * @param Dp
     *     The dewPoint
     */
    public void setDewPoint(Float Dp) {
        this.dewPoint = Dp;
    }

    public Rep withDp(Float Dp) {
        this.dewPoint = Dp;
        return this;
    }

    /**
     * @return The number of minutes after midnight UTC on the day represented by the
     * Period object in which the Rep object is found.
     */
    public Float get$() {
        return $;
    }

    /**
     * Returns the DataTime represented by this Rep, based upon the time stamp of the Period this is within.
     * @param parentPeriodDateTime being midnight on the day of this Rep.
     * @return the DataTime represented by this Rep, based upon the time stamp of the Period this is within.
     */
    public DateTime getRepTimeStamp(final DateTime parentPeriodDateTime) {
        if ($ == null){
            return parentPeriodDateTime;
        }
        else {
            return parentPeriodDateTime.plusMinutes($.intValue());
        }
    }

    /**
     *
     * @param $
     *     The $
     */
    public void set$(Float $) {
        this.$ = $;
    }

    public Rep with$(Float $) {
        this.$ = $;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(screenRelativeHumidity).append(temperature).append(dewPoint).append($).append(windDirection).toHashCode();
    }

    @Override
    public boolean equals(Object that) {
        if (that == this) {
            return true;
        }
        if ((that instanceof Rep) == false) {
            return false;
        }
        Rep o = ((Rep) that);
        return new EqualsBuilder().append(screenRelativeHumidity, o.screenRelativeHumidity).append(temperature, o.temperature).append(dewPoint, o.dewPoint).append($, o.$).append(windDirection, o.windDirection).isEquals();
    }

}
