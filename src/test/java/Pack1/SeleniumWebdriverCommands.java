package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebdriverCommands {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys("vermasagar640@gmail.com");
	    driver.findElement(By.id("session_password")).sendKeys("onlycrime");
	    driver.findElement(By.className("sign-in-form__submit-button")).click();
	   // driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	    //driver.close();
	    
	    
	   
	    
	    
	    
		
		

	}

}
