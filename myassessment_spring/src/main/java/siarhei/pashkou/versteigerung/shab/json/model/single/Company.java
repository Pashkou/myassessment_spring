package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Company {
	 private String name;
	 private String uid;
	 private String uidOrganisationId;
	 private String uidOrganisationIdCategorie;
	 private String legalForm;
	 Address AddressObject;
	 private String canton;


	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public String getUid() {
	  return uid;
	 }

	 public String getUidOrganisationId() {
	  return uidOrganisationId;
	 }

	 public String getUidOrganisationIdCategorie() {
	  return uidOrganisationIdCategorie;
	 }

	 public String getLegalForm() {
	  return legalForm;
	 }

	 public Address getAddress() {
	  return AddressObject;
	 }

	 public String getCanton() {
	  return canton;
	 }

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setUid(String uid) {
	  this.uid = uid;
	 }

	 public void setUidOrganisationId(String uidOrganisationId) {
	  this.uidOrganisationId = uidOrganisationId;
	 }

	 public void setUidOrganisationIdCategorie(String uidOrganisationIdCategorie) {
	  this.uidOrganisationIdCategorie = uidOrganisationIdCategorie;
	 }

	 public void setLegalForm(String legalForm) {
	  this.legalForm = legalForm;
	 }

	 public void setAddress(Address addressObject) {
	  this.AddressObject = addressObject;
	 }

	 public void setCanton(String canton) {
	  this.canton = canton;
	 }
	}
