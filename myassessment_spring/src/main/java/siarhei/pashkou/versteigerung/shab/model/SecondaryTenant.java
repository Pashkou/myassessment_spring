
package siarhei.pashkou.versteigerung.shab.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tenantCode",
    "publicationDate"
})
public class SecondaryTenant {

    @JsonProperty("tenantCode")
    private String tenantCode;
    @JsonProperty("publicationDate")
    private String publicationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tenantCode")
    public String getTenantCode() {
        return tenantCode;
    }

    @JsonProperty("tenantCode")
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    @JsonProperty("publicationDate")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("publicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
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
