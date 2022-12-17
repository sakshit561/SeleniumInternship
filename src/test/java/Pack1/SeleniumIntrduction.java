package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {
		public static void main(String[] args) {
			//Invoking browser
			//ChromeDriver ---> methods ---> get , close
			//ChormeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver1\\chromedriver.exe");
			
			WebDriver  driver = new ChromeDriver();
			//driver.get("https://www.instagram.com/");
			driver.navigate().to("https://www.instagram.com/");
		}
}