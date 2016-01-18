
package com.mycompany.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A collection of product Presentations
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "size",
    "presentations"
})
public class Presentations {

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("presentations")
    @Valid
    private List<Presentation> presentations = new ArrayList<Presentation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Presentations withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The presentations
     */
    @JsonProperty("presentations")
    public List<Presentation> getPresentations() {
        return presentations;
    }

    /**
     * 
     * @param presentations
     *     The presentations
     */
    @JsonProperty("presentations")
    public void setPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
    }

    public Presentations withPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Presentations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
