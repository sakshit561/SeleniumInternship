package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locaters1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String dynamicpass = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println( driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("1234567891");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class=go-to-login-btn]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys(dynamicpass);
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxTwo")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);
        //driver.close();
        System.out.println( driver.findElement(By.tagName("p")).getText());
        //String expectedresult = "You are successfully logged in.";
	   
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        driver.findElement(By.xpath("//button[text() ='Log Out']")).click();
	}
        public static  String getPassword (WebDriver driver) throws InterruptedException {
        	driver.manage().window().maximize();
        	
        	driver.get("https://rahulshettyacademy.com/locatorspractice/");
        	driver.findElement(By.linkText("Forgot your password?")).click();
        	Thread.sleep(2000);
        	 driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
             String password = driver.findElement(By.cssSelector("form p")).getText();
             System.out.println(password);
             String[] passwordText = password.split("'");
             String passwordarr = passwordText[1].split("'")[0];
             return passwordarr;
        
        }
	}


