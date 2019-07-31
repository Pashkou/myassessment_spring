package siarhei.pashkou.versteigerung.shab.json.model.single;

public class Auction {
	 private String date;
	 private String time;
	 private String location;


	 // Getter Methods 

	 public String getDate() {
	  return date;
	 }

	 public String getTime() {
	  return time;
	 }

	 public String getLocation() {
	  return location;
	 }

	 // Setter Methods 

	 public void setDate(String date) {
	  this.date = date;
	 }

	 public void setTime(String time) {
	  this.time = time;
	 }

	 public void setLocation(String location) {
	  this.location = location;
	 }
	}