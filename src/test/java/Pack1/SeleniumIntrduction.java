package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
	
			//invoking browser 
			//chromeDriver---> methods --->get,close
		//ChromeDriver driver = new ChromeDriver();
			System.setProperty("Web.driver.chrome.driver","C:\\Users\\Stuti_Uppi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//driver.get("https://www.w3schools.com/");
			driver.navigate().to("https://www.w3schools.com/");
			
		}
	

}
