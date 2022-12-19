package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc123@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("abc@123gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
        
		//driver.findElement(By.className("go-to-login-btn")).click();
		//driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.className("signInBtn")).click();
		
		
	}
	}


