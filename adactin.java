package selenium.org.myself;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myself.Base3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class adactin extends Base3 {
	static WebDriver driver; 
	@BeforeClass
	    public static void  beforeclass(){
		driver = getDriver("http://adactin.com/HotelApp/");
	    }
	@AfterClass
    public static void afterclass() { 
     //driver.quit();
    	}
	@Test
	public void test() throws IOException, InterruptedException, JAXBException {
		JAXBContext context=JAXBContext.newInstance(Adactind.class);
		Adactind a1=new Adactind();
	    Unmarshaller um = context.createUnmarshaller();
	    Adactind d=(Adactind)um.unmarshal(new File("C:\\Users\\admin\\eclipse-workspaceo\\org.myself\\excel\\adactind.xml"));
		adactinpom a = new adactinpom(driver);
		System.out.println(d.getUsername());
		sendvalue(a.getUsername(),d.getUsername());
		sendvalue( a.getPassword(),d.getPassword());
		click(a.getLogin());
		 String j1=getData(1,"location");
		 System.out.println(j1);
		select(a.getLocation(),d.getLocation());
		select(a.getHotels(),d.getHotels());
		select(a.getRoomtype(),d.getRoomtype());
		select(a.getRoomno(),d.getRoomno());
		select(a.getAdultroom(),d.getAdultroom());
		select(a.getChildoom(),d.getChildroom());
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		sendvalue(a.getFn(),d.getFn());
		sendvalue(a.getLn(),d.getLn());
		sendvalue(a.getAddress(),d.getAddress());
		sendvalue(a.getCardno(),d.getCardno());
		select(a.getCtype(),d.getCtype());
		select(a.getCexp(),d.getCexp());
		select(a.getCyear(),d.getCyear());
		sendvalue(a.getCcvv(),d.getCcvv());
	    driver.findElement(By.id("book_now")).click();
	    Thread.sleep(7000);
	    System.out.println(a.getCcv().getAttribute("value"));
	    String h=a.getCcv().getAttribute("value");
	    a1.setOrderid(h);
	    Marshaller jaxbMarshaller = context.createMarshaller();
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    jaxbMarshaller.marshal(a1 ,new FileOutputStream("adactind.xml"));
	    
	    
	    
	  //  setdata(a.getCcv().getAttribute("value"));
}}
