package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		String dynamicpass= getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(2000);
		 System.out.println(driver.findElement(By.className("error")).getText());
		 driver.findElement(By.id("inputUsername")).clear();
		 driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Abc");
			driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc123@gmail.com");
			//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("0123456789");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
			driver.findElement(By.className("reset-pwd-btn")).click();
			driver.findElement(By.className("go-to-login-btn")).click();
			driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys(dynamicpass);
			Thread.sleep(1000);
			driver.findElement(By.id("chkboxTwo")).click();
			driver.findElement(By.className("signInBtn")).click();
			driver.findElement(By.tagName("h2")).getText();
			Thread.sleep(3000);
            System.out.println(driver.findElement(By.tagName("h2")).getText());
			String name="abc123@gmail.com,";
     		String actualresult=driver.findElement(By.tagName("h2")).getText();
			String expectedresult="Hello "+name;
			Assert.assertEquals(actualresult,expectedresult);
			
			 driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	       }
			public static String getPassword(WebDriver driver) throws InterruptedException {
				
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("reset-pwd-btn")).click();
				String password=driver.findElement(By.cssSelector("form p")).getText();
				System.out.println(password);
				String[] passwordText=password.split("'");
				String pass=passwordText[1].split("'")[0];
				return pass;
			}
}