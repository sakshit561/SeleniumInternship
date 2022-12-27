package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//object creating
		WebDriver driver =  new ChromeDriver();
		
		//Browser opening 
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)");
		
		//Browser maximize 
		driver.manage().window().maximize();
		


		
		// Web site opening
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locate user name and send user name
		driver.findElement(By.id("inputUsername")).sendKeys("Abhinav Agrawal");
		
		//Locate password and send password
		driver.findElement(By.name("inputPassword")).sendKeys("abhi1234");
		
		//Locate sign in button and clicking 
		driver.findElement(By.className("signInBtn")).click();
		
		
		Thread.sleep(2000);
		
		//erorr text printing
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
		
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("abhinavisone360@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		String actualresult = driver.findElement(By.tagName("p")).getText();
		String expectedresult = "You are successfully logged in.";
		Thread.sleep(2000);
		Assert.assertEquals(actualresult,expectedresult);
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}
	
}
