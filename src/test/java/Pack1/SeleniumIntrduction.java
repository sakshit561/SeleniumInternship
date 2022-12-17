package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebManagerCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver =  new ChromeDriver();
		 
		 
			
		 //System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)");
			
		 driver.get("https://slack.com/intl/en-in");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/header/div/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"creator_signup_email\"]")).sendKeys("abhinavisone360@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		 //driver.close();
			
	}

}
