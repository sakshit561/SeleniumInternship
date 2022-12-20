package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		//object creating
		WebDriver driver =  new ChromeDriver();
		
		//Browser opening 
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)");
		
		//Browser maximize 
		driver.manage().window().maximize();
		
		 String dynamicPass = getPassword(driver);
		
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
		Thread.sleep(2000);
		//driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type = 'text'][1]")).sendKeys("Abhinav");
		driver.findElement(By.xpath("//input[@type = 'text'][2]")).sendKeys("abc@gmail.com");
		
		//driver.findElement(By.cssSelector("input[type ='text']:nth-child[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type = 'text'][3]")).sendKeys("7898234035");
		
		//parent child traverse  -  
		//driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("abhinavisone360@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys(dynamicPass);
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		String name = "abhinavisone360@gmail.com,";
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
		
		System.out.println(driver.findElement(By.cssSelector("h2")).getText());
		String actualresult1 = driver.findElement(By.cssSelector("h2")).getText();
		String expectedResult1 = "Hello " + name;
		Assert.assertEquals(actualresult1,expectedResult1);
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String password = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(password);
		String[] passwordText = password.split("'");
		String passwordArr =  passwordText[1].split("'")[0];
		return passwordArr;	
	}
}
