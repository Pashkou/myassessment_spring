package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Content {
	 Debtor DebtorObject;
	 private String auctionObjects;
	 Auction AuctionObject;
	 private String informationAboutEdition;
	 private String registrationOffice;
	 private String remarks;


	 // Getter Methods 

	 public Debtor getDebtor() {
	  return DebtorObject;
	 }

	 public String getAuctionObjects() {
	  return auctionObjects;
	 }

	 public Auction getAuction() {
	  return AuctionObject;
	 }

	 public String getInformationAboutEdition() {
	  return informationAboutEdition;
	 }

	 public String getRegistrationOffice() {
	  return registrationOffice;
	 }

	 public String getRemarks() {
	  return remarks;
	 }

	 // Setter Methods 

	 public void setDebtor(Debtor debtorObject) {
	  this.DebtorObject = debtorObject;
	 }

	 public void setAuctionObjects(String auctionObjects) {
	  this.auctionObjects = auctionObjects;
	 }

	 public void setAuction(Auction auctionObject) {
	  this.AuctionObject = auctionObject;
	 }

	 public void setInformationAboutEdition(String informationAboutEdition) {
	  this.informationAboutEdition = informationAboutEdition;
	 }

	 public void setRegistrationOffice(String registrationOffice) {
	  this.registrationOffice = registrationOffice;
	 }

	 public void setRemarks(String remarks) {
	  this.remarks = remarks;
	 }
	}