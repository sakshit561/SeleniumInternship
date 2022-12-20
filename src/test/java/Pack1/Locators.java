package Pack1;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {



	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");  
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("abc");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.className("error")).getText());
		
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("7803068856");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7803068856");  //placeholder
		
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click(); 
		//driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
		//driver.findElement(By.xpath("//input[@type='text'[2]")).sendKeys("abc");
		//driver.findElement(By.id("inputUsername")).sendKeys("abc");
		//driver.findElement(By.name("inputPassword")).sendKeys("123456");
		//driver.close();
		
	}

}
