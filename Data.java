package selenium.org.myself;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Data")
public class Data {
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String phone;
	private String gender;
	private String hobbies;
	private String Languages;
	private String skills;
	private String country;
	private String selectCountry;
	private String YEAR;
	private String MONTH;
	private String DAY;
	private String password;
	private String confrimpassword;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies1) {
		hobbies = hobbies1;
	}
	public String getLanguages() {
		return Languages;
	}
	public void setLanguages(String languages) {
		Languages = languages;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSelectCountry() {
		return selectCountry;
	}
	public void setSelectCountry(String selectCountry) {
		this.selectCountry = selectCountry;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getMONTH() {
		return MONTH;
	}
	public void setMONTH(String mONTH) {
		MONTH = mONTH;
	}
	public String getDAY() {
		return DAY;
	}
	public void setDAY(String dAY) {
		DAY = dAY;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password1) {
		password = password1;
	}
	public String getConfrimpassword() {
		return confrimpassword;
	}
	public void setConfrimpassword(String confrimpassword) {
		this.confrimpassword = confrimpassword;
	}
	
}
