 package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators_Selenium_2 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String dynamicPassword=Password_Detector(driver);
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
	driver.findElement(By.id("inputUsername")).sendKeys("manish180499@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys(dynamicPassword);
	Thread.sleep(2000);
	driver.findElement(By.id("chkboxTwo")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
    String acutalresult = driver.findElement(By.tagName("p")).getText();
    String expectedresult = driver.findElement(By.tagName("p")).getText();
    Assert.assertEquals(acutalresult,expectedresult);
    String name ="manish180499@gmail.com,";
    String acutal_result = driver.findElement(By.tagName("h2")).getText();
    String expected_result = "Hello "+name;
    Assert.assertEquals(acutal_result,expected_result);
    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	Thread.sleep(2000);
    //driver.close();	
  } 
    public static String Password_Detector(WebDriver driver) throws InterruptedException {
	
    	driver.manage().window().maximize();
      	driver.get("https://rahulshettyacademy.com/locatorspractice/");
      	driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.className("reset-pwd-btn")).click();
      	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
      	String Password=driver.findElement(By.cssSelector("form p")).getText();
      	String Str_Password = Password.split("'")[1];
      	return Str_Password;
  	
  	
  	
  	
  	
   }
}
