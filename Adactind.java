package selenium.org.myself;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name ="Adactind")
public class Adactind {
	private String username;
	private String password;
	private String location;
	private String hotels;
	private String roomtype;
	private String roomno;
	private String adultroom;
	private String childroom;
	private String fn;
	private String ln;
	private String address;
	private String cardno;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHotels() {
		return hotels;
	}
	public void setHotels(String hotels) {
		this.hotels = hotels;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getAdultroom() {
		return adultroom;
	}
	public void setAdultroom(String adultroom) {
		this.adultroom = adultroom;
	}
	public String getChildroom() {
		return childroom;
	}
	public void setChildroom(String childroom) {
		this.childroom = childroom;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCexp() {
		return cexp;
	}
	public void setCexp(String cexp) {
		this.cexp = cexp;
	}
	public String getCyear() {
		return cyear;
	}
	public void setCyear(String cyear) {
		this.cyear = cyear;
	}
	public String getCcvv() {
		return ccvv;
	}
	public void setCcvv(String ccvv) {
		this.ccvv = ccvv;
	}
	private String ctype;
	private String cexp;
	private String cyear;
	private String ccvv;
	
	
}
