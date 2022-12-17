package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {
       public static void main(String[] args) {
			// Invoking browser 
			//download ChromeDriver----> methods-->get,close
			//ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");
		}
	}
	


