package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String dynamicpass=getPassword(driver);
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys(dynamicpass);
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxTwo")).click();
	    driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		}
	    
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String password=driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(password);
		String[] passwordText=password.split("'");
		String pass=passwordText[1].split("'")[0];
		return pass ;

	}

}
