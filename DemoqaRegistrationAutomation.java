package selenium.org.myself;

import java.io.IOException;

import org.myself.Base;
import org.openqa.selenium.WebDriver;

public class DemoqaRegistrationAutomation extends Base {
	public static void main(String[] args) throws IOException {
		initializeDriver("http://demo.automationtesting.in/Register.html");
		WebDriver driver = getDriver();
		driver.manage().window().maximize();
		//File excelLocation = openExcel("C:\\Users\\Greens-12\\pradeepa\\DataDrivenFramework\\Excel\\DemoqaRegistrationDetails.xlsx");
		//initializeExcelData(excelLocation, "Sheet1");
		DemoqaRegistrationPage demoqaPage = new DemoqaRegistrationPage();
		sendText(demoqaPage.getFirstName(), "Abarnu");
		//sendText(demoqaPage.getLastName(), "dsgfh");
				
		
	}
}
