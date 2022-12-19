package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(2000);
		 System.out.println(driver.findElement(By.className("error")).getText());
		 driver.findElement(By.id("inputUsername")).clear();
		 driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("aarav");
			//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc123@gmail.com");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("6565678987");
			driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
	        //button[contain(@class,'submit']

}
}