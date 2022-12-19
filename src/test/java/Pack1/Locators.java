package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abhinavisone360@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abhi");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type = 'text'][1]")).sendKeys("Abhinav");
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).sendKeys("abc@gmail.com");
		
		//driver.findElement(By.cssSelector("input[type ='text']:nth-child[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type = 'text'][3]")).sendKeys("7898234035");
		
		//parent child traverse  -  
		//driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		
		
		
	}

}
