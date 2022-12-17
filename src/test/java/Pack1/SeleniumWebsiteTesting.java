package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebsiteTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://slack.com/intl/en-in/get-started#/createnew");
          driver.manage().window().maximize();
          //driver.findElement(By.xpath("//*[@id=\"creator_signup_email\"]")).sendKeys("belujain.01@gmailcom");
          driver.findElement(By.xpath("//*[@id=\"google_login_button\"]/span/span")).click();
          driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("belujain.01@gmail.com");
          driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
         
          
	}

}
