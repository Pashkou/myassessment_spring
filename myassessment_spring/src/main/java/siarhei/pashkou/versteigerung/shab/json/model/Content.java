
package siarhei.pashkou.versteigerung.shab.json.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "links",
    "attachments",
    "content",
    "commented"
})
public class Content {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonProperty("attachments")
    private List<Object> attachments = null;
    @JsonProperty("content")
    private Object content;
    @JsonProperty("commented")
    private Boolean commented;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("links")
    public List<Object> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    @JsonProperty("attachments")
    public List<Object> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("content")
    public Object getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Object content) {
        this.content = content;
    }

    @JsonProperty("commented")
    public Boolean getCommented() {
        return commented;
    }

    @JsonProperty("commented")
    public void setCommented(Boolean commented) {
        this.commented = commented;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
