
package siarhei.pashkou.versteigerung.shab.json.model;

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
    "id",
    "displayName",
    "street",
    "streetNumber",
    "swissZipCode",
    "town",
    "containsPostOfficeBox",
    "postOfficeBox"
})
public class RegistrationOffice {

    @JsonProperty("id")
    private String id;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("street")
    private String street;
    @JsonProperty("streetNumber")
    private String streetNumber;
    @JsonProperty("swissZipCode")
    private String swissZipCode;
    @JsonProperty("town")
    private String town;
    @JsonProperty("containsPostOfficeBox")
    private Boolean containsPostOfficeBox;
    @JsonProperty("postOfficeBox")
    private Object postOfficeBox;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("streetNumber")
    public String getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("streetNumber")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @JsonProperty("swissZipCode")
    public String getSwissZipCode() {
        return swissZipCode;
    }

    @JsonProperty("swissZipCode")
    public void setSwissZipCode(String swissZipCode) {
        this.swissZipCode = swissZipCode;
    }

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    @JsonProperty("containsPostOfficeBox")
    public Boolean getContainsPostOfficeBox() {
        return containsPostOfficeBox;
    }

    @JsonProperty("containsPostOfficeBox")
    public void setContainsPostOfficeBox(Boolean containsPostOfficeBox) {
        this.containsPostOfficeBox = containsPostOfficeBox;
    }

    @JsonProperty("postOfficeBox")
    public Object getPostOfficeBox() {
        return postOfficeBox;
    }

    @JsonProperty("postOfficeBox")
    public void setPostOfficeBox(Object postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "RegistrationOffice [id=" + id + ", displayName=" + displayName + ", street=" + street + ", streetNumber=" + streetNumber + ", swissZipCode=" + swissZipCode + ", town=" + town + ", containsPostOfficeBox=" + containsPostOfficeBox + ", postOfficeBox=" + postOfficeBox + ", additionalProperties="
				+ additionalProperties + "]";
	}
    
    

}
