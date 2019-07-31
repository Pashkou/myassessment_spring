package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Address {
	 private String street;
	 private String houseNumber;
	 private String swissZipCode;
	 private String town;


	 // Getter Methods 

	 public String getStreet() {
	  return street;
	 }

	 public String getHouseNumber() {
	  return houseNumber;
	 }

	 public String getSwissZipCode() {
	  return swissZipCode;
	 }

	 public String getTown() {
	  return town;
	 }

	 // Setter Methods 

	 public void setStreet(String street) {
	  this.street = street;
	 }

	 public void setHouseNumber(String houseNumber) {
	  this.houseNumber = houseNumber;
	 }

	 public void setSwissZipCode(String swissZipCode) {
	  this.swissZipCode = swissZipCode;
	 }

	 public void setTown(String town) {
	  this.town = town;
	 }
	}