package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amana\\Downloads\\chromedriver_win32\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("https://www.adani.com/");

	}

}
