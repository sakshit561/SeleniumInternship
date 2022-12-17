package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =  new ChromeDriver();
			
			System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\ChromeDriver");
			
			driver.get("https://www.w3schools.com/");

	}

}
