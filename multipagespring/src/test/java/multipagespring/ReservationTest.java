package multipagespring;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ReservationTest {

/*public void loginReservation()
{
	System.setProperty("webdriver.chrome.driver", "D:\\EGOV\\CI_CD\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// launch website
	driver.navigate().to("http://localhost:8080/multipagespring/");
	String actualTitle = driver.getTitle();
	String expeditedTitle = "Jenkin";
	if (expeditedTitle.equals(actualTitle)) {
		System.out.println("Verification Successful - the correct title is display on the web");
	} else {
		System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	}	
	Assert.assertEquals(expeditedTitle,actualTitle);
	driver.close();
	
}*/
@Test
public void testAdd()
{
 Assert.assertEquals(1,0);	
}
  
 

}
