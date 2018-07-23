package selenium.org.myself;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myself.BaseOfDemoQa;
//import org.myself.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class DemoQARegis2 extends BaseOfDemoQa {
	static WebDriver driver; //public static void main(String[] args) throws IOException {
	    @BeforeClass
	    public static void  beforeclass(){
	     driver= getDriver("http://demo.automationtesting.in/Register.html");
	    
	    }
	    @AfterClass
	    public static void afterclass() { 
	   driver.quit();
	    	}
	    @Test
	    public void test() throws IOException, JAXBException{
	    JAXBContext context=JAXBContext.newInstance(Data.class);
	    Unmarshaller um = context.createUnmarshaller();
	    Data d=(Data)um.unmarshal(new File("C:\\Users\\admin\\eclipse-workspaceo\\org.myself\\excel\\data.xml"));
	    RegistrationPOM l= new RegistrationPOM(driver);
		sendvalue( l.getFirstname(),d.getFname());
		sendvalue( l.getLastname(),d.getLname());
		sendvalue( l.getAdress(),d.getAddress());
		sendvalue( l.getPhone(),d.getPhone());
		sendvalue( l.getEadress(),d.getEmail());
		String a=d.getGender();
		System.out.println(a);
		if (a .equals("female")){
		click(l.getFemale());}
		else {
		click(l.getMale());
		}
		String b=d.getHobbies();
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
		String c= d.getLanguages();
		click(l.getCoL());
		click(l.getLanguage());
		select(l.getSkills(),d.getSkills());
		select(l.getCountry(),d.getCountry());	
		click(l.getClickforcountry());
		click(l.getScountry());
		select(l.getYear(),d.getYEAR());
		select(l.getMonth(),d.getMONTH());
		select(l.getDay(),d.getDAY());
		System.out.println(d.getPassword());
		sendvalue( l.getPassword(),d.getPassword());
		System.out.println(d.getConfrimpassword());
		sendvalue( l.getCpassword(),d.getConfrimpassword());
		click(l.getSignup());
		}}

