package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		System.setProperty("webdriver.crome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		cd.get("https://www.w3schools.com/html/");

	}

}
