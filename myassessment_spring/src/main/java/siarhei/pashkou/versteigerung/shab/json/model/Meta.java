
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
    "id",
    "creationDate",
    "updateDate",
    "rubric",
    "subRubric",
    "language",
    "registrationOffice",
    "publicationOriginator",
    "publicationNumber",
    "publicationState",
    "publicationDate",
    "expirationDate",
    "primaryTenantCode",
    "onBehalfOf",
    "invoiceAddressId",
    "legalRemedy",
    "cantons",
    "secondaryTenants",
    "repeatedPublications",
    "customsStampImages",
    "title",
    "dossierReference",
    "copyDeadline"
})
public class Meta {

    @JsonProperty("id")
    private String id;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonProperty("rubric")
    private String rubric;
    @JsonProperty("subRubric")
    private String subRubric;
    @JsonProperty("language")
    private String language;
    @JsonProperty("registrationOffice")
    private RegistrationOffice registrationOffice;
    @JsonProperty("publicationOriginator")
    private Object publicationOriginator;
    @JsonProperty("publicationNumber")
    private String publicationNumber;
    @JsonProperty("publicationState")
    private String publicationState;
    @JsonProperty("publicationDate")
    private String publicationDate;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("primaryTenantCode")
    private String primaryTenantCode;
    @JsonProperty("onBehalfOf")
    private Object onBehalfOf;
    @JsonProperty("invoiceAddressId")
    private Object invoiceAddressId;
    @JsonProperty("legalRemedy")
    private String legalRemedy;
    @JsonProperty("cantons")
    private List<String> cantons = null;
    @JsonProperty("secondaryTenants")
    private List<SecondaryTenant> secondaryTenants = null;
    @JsonProperty("repeatedPublications")
    private Object repeatedPublications;
    @JsonProperty("customsStampImages")
    private List<Object> customsStampImages = null;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("dossierReference")
    private Object dossierReference;
    @JsonProperty("copyDeadline")
    private Object copyDeadline;
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

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("updateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @JsonProperty("rubric")
    public String getRubric() {
        return rubric;
    }

    @JsonProperty("rubric")
    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    @JsonProperty("subRubric")
    public String getSubRubric() {
        return subRubric;
    }

    @JsonProperty("subRubric")
    public void setSubRubric(String subRubric) {
        this.subRubric = subRubric;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("registrationOffice")
    public RegistrationOffice getRegistrationOffice() {
        return registrationOffice;
    }

    @JsonProperty("registrationOffice")
    public void setRegistrationOffice(RegistrationOffice registrationOffice) {
        this.registrationOffice = registrationOffice;
    }

    @JsonProperty("publicationOriginator")
    public Object getPublicationOriginator() {
        return publicationOriginator;
    }

    @JsonProperty("publicationOriginator")
    public void setPublicationOriginator(Object publicationOriginator) {
        this.publicationOriginator = publicationOriginator;
    }

    @JsonProperty("publicationNumber")
    public String getPublicationNumber() {
        return publicationNumber;
    }

    @JsonProperty("publicationNumber")
    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    @JsonProperty("publicationState")
    public String getPublicationState() {
        return publicationState;
    }

    @JsonProperty("publicationState")
    public void setPublicationState(String publicationState) {
        this.publicationState = publicationState;
    }

    @JsonProperty("publicationDate")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("publicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("primaryTenantCode")
    public String getPrimaryTenantCode() {
        return primaryTenantCode;
    }

    @JsonProperty("primaryTenantCode")
    public void setPrimaryTenantCode(String primaryTenantCode) {
        this.primaryTenantCode = primaryTenantCode;
    }

    @JsonProperty("onBehalfOf")
    public Object getOnBehalfOf() {
        return onBehalfOf;
    }

    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Object onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    @JsonProperty("invoiceAddressId")
    public Object getInvoiceAddressId() {
        return invoiceAddressId;
    }

    @JsonProperty("invoiceAddressId")
    public void setInvoiceAddressId(Object invoiceAddressId) {
        this.invoiceAddressId = invoiceAddressId;
    }

    @JsonProperty("legalRemedy")
    public String getLegalRemedy() {
        return legalRemedy;
    }

    @JsonProperty("legalRemedy")
    public void setLegalRemedy(String legalRemedy) {
        this.legalRemedy = legalRemedy;
    }

    @JsonProperty("cantons")
    public List<String> getCantons() {
        return cantons;
    }

    @JsonProperty("cantons")
    public void setCantons(List<String> cantons) {
        this.cantons = cantons;
    }

    @JsonProperty("secondaryTenants")
    public List<SecondaryTenant> getSecondaryTenants() {
        return secondaryTenants;
    }

    @JsonProperty("secondaryTenants")
    public void setSecondaryTenants(List<SecondaryTenant> secondaryTenants) {
        this.secondaryTenants = secondaryTenants;
    }

    @JsonProperty("repeatedPublications")
    public Object getRepeatedPublications() {
        return repeatedPublications;
    }

    @JsonProperty("repeatedPublications")
    public void setRepeatedPublications(Object repeatedPublications) {
        this.repeatedPublications = repeatedPublications;
    }

    @JsonProperty("customsStampImages")
    public List<Object> getCustomsStampImages() {
        return customsStampImages;
    }

    @JsonProperty("customsStampImages")
    public void setCustomsStampImages(List<Object> customsStampImages) {
        this.customsStampImages = customsStampImages;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("dossierReference")
    public Object getDossierReference() {
        return dossierReference;
    }

    @JsonProperty("dossierReference")
    public void setDossierReference(Object dossierReference) {
        this.dossierReference = dossierReference;
    }

    @JsonProperty("copyDeadline")
    public Object getCopyDeadline() {
        return copyDeadline;
    }

    @JsonProperty("copyDeadline")
    public void setCopyDeadline(Object copyDeadline) {
        this.copyDeadline = copyDeadline;
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
