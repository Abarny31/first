package selenium.org.myself;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myself.BaseOfDemoQa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DemoQARegis extends BaseOfDemoQa {
	static WebDriver driver; //public static void main(String[] args) throws IOException {
	    @BeforeClass
	    public static void  beforeclass(){
	     driver= getDriver("http://demo.automationtesting.in/Register.html");
	    
	    }
	    @AfterClass
	    public static void afterclass() { 
	    driver.quit();}
	    @Test
	    public void test() throws IOException{
	    RegistrationPOM l= new RegistrationPOM(driver);
		String S= getData(1,"Fname");
		System.out.println(S);
		sendvalue( l.getFirstname(),getData(1,"Fname"));
		sendvalue( l.getLastname(),getData(1,"lname"));
		sendvalue( l.getAdress(),getData(1,"address"));
		sendvalue( l.getPhone(),getData(1,"phone"));
		sendvalue( l.getEadress(),getData(1,"email"));
		String a=getData(1,"gender");
		System.out.println(a);
		if (a .equals("female")){
		click(l.getFemale());}
		else {
		click(l.getMale());
		}
		String b=getData(1,"Hobbies");
		String[] b1 =b.split(",");
		System.out.println(b);
		if((b1[0].equals("Cricket"))||(b1[1].equals("Cricket"))||(b1[2].equals("Cricket"))){
		click(l.getCricket());
		}
		if((b1[0].equals("hockey"))||(b1[1].equals("hockey"))||(b1[2].equals("hockey"))) {
		click(l.getHockey());
		}
		else {
			click(l.getMovies());
		}
		String c= getData(1,"Languages");
		click(l.getCoL());
		click(l.getLanguage());
		select(l.getSkills(),getData(1,"skills"));
		select(l.getCountry(),getData(1,"country"));	
		click(l.getClickforcountry());
		click(l.getScountry());
		select(l.getYear(),getData(1,"DOB-YEAR"));
		select(l.getMonth(),getData(1,"DOB-MONTH"));
		select(l.getDay(),getData(1,"DOB-DAY"));
		sendvalue( l.getPassword(),getData(1,"Password"));
		sendvalue( l.getCpassword(),getData(1,"ConfrimPassword"));
		click(l.getSignup());
		}}

