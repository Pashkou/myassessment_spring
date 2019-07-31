package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Debtor {
	private String selectType;
	Companies CompaniesObject;

	// Getter Methods

	public String getSelectType() {
		return selectType;
	}

	public Companies getCompanies() {
		return CompaniesObject;
	}

	// Setter Methods

	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}

	public void setCompanies(Companies companiesObject) {
		this.CompaniesObject = companiesObject;
	}
}