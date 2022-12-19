package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (4).exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("inputPassword")).sendKeys("abc");
			driver.findElement(By.className("signInBtn")).click();
	        Thread.sleep(2000);
			System.out.println(driver.findElement(By.className("error")).getText());
			driver.findElement(By.id("inputUsername")).clear();
			driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abc");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("6565678987");
			driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
	        //button[contain(@class,'submit']

			
	}

}
