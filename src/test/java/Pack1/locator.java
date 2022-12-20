package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator {
	
	 public static void main (String[]args) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 String dynamicpass = getPassword(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		 driver.findElement(By.name("inputPassword")).sendKeys("abc");
		 //clickisusedforclrthetextfrominputfield
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.className("error")).getText());	
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("abc");
		 //driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("abc@gmail.com");
		 //driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("abc@gmaill.com");
		 driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("abc@gmaill.com");
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("123456789");
		 //driver.findElement(By.xpath("//button[text()='Reset login')]"));
		 //driver.findElement(By.className("reset-pwd-btn")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[class=go-to-login-btn]")).click();
		 driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		 driver.findElement(By.name("inputPassword")).sendKeys(dynamicpass);
		 Thread.sleep(2000);
		 driver.findElement(By.id("chkboxTwo")).click();
		  Thread.sleep(2000);
		 driver.findElement(By.className("signInBtn")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.tagName("p")).getText());
		// String expectedresult = "you are successfully logged in.";
		// Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		 driver.findElement(By.xpath("//button[text()='Log Out']")).click(); 

}
	 public static String getPassword(WebDriver driver) throws InterruptedException {
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Forgot Your Password?")).click();
		 driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')")).click();
		 String password = driver.findElement(By.cssSelector("form p")).getText();
		 System.out.println(password);
		 String[] passwordText = password.split(" ' ");
		 String passwordarr = passwordText[1].split(" ' ")[0];
		 return passwordarr;
		 
		 
		 
		 
		 
		 
		
}

}