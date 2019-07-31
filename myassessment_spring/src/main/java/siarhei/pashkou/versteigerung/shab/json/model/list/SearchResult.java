
package siarhei.pashkou.versteigerung.shab.json.model.list;

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
    "content",
    "total",
    "pageRequest"
})
public class SearchResult {

    @JsonProperty("content")
    private List<Content> content = null;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("pageRequest")
    private PageRequest pageRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("content")
    public List<Content> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Content> content) {
        this.content = content;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("pageRequest")
    public PageRequest getPageRequest() {
        return pageRequest;
    }

    @JsonProperty("pageRequest")
    public void setPageRequest(PageRequest pageRequest) {
        this.pageRequest = pageRequest;
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
