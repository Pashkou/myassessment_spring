package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Companies {
	 private String noUID;
	 Company CompanyObject;


	 // Getter Methods 

	 public String getNoUID() {
	  return noUID;
	 }

	 public Company getCompany() {
	  return CompanyObject;
	 }

	 // Setter Methods 

	 public void setNoUID(String noUID) {
	  this.noUID = noUID;
	 }

	 public void setCompany(Company companyObject) {
	  this.CompanyObject = companyObject;
	 }
	}
