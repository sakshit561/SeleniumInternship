package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		WebDriverManager.chromedriver().setup();
		WebDriver  driver =new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("session_key")).sendKeys("7879577398");
		driver.findElement(By.id("session_password")).sendKeys("abcdefgh");
	


		
		
		
		
		
		
		
		
		
	}
}
