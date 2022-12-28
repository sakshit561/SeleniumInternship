package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSelenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		driver.findElement(By.cssSelector("input[type=text]:nth-child(2)")).sendKeys("Manish Arya");
		driver.findElement(By.cssSelector("input[type=text]:nth-child(3)")).sendKeys("manish180499@gmail.com");
		driver.findElement(By.cssSelector("input[type=text]:nth-child(4)")).sendKeys("8871009273");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("8871009273");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		Thread.sleep(2000);
		driver.close();
		

		
		
		
		
    
		
		
	}

}
