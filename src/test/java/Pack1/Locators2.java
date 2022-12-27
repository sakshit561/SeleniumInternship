package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chromedriver.exe");  
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.manage().window().maximize();
				
				String dynmicPass =getpassword(driver);
				System.out.println(dynmicPass);
				
				driver.findElement(By.id("inputUsername")).sendKeys("abc");
				driver.findElement(By.name("inputPassword")).sendKeys("123456");
				driver.findElement(By.className("signInBtn")).click();
				Thread.sleep(2000);
				
				//System.out.println(driver.findElement(By.className("error")).getText());
				
				driver.findElement(By.id("inputUsername")).clear();
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("abc");
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("7803068856");
				//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7803068856");  //placeholder
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
				
				
				 driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
				//driver.findElement(By.xpath("//input[@type='text'[2]")).sendKeys("abc");
			    driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
				
			    Thread.sleep(2000);
			    driver.findElement(By.className("inputPassword")).sendKeys(dynmicPass);
			    //driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
				driver.findElement(By.id("chkboxTwo")).click();
				driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
				
				System.out.println(driver.findElement(By.tagName("p")).getText());
				 
				//String actualresult = driver.findElement(By.tagName("p")).getText();  //print you are successful logged in
       	        //String expectedreshult ="You are successfully logged in.";
       	       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(@class,'logout-btn')]")).click();
				   
				//driver.close();
				
				
	}	
			public static String getpassword(WebDriver driver) throws InterruptedException  {
				driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
				driver.manage().window().minimize();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(2000);
				driver.findElement(By.className("reset-pwd-btn")).click();
				String password=driver.findElement(By.cssSelector("form p")).getText();
				System.out.println(password);
				String[] passwordText = password.split("'");
				String pass = passwordText[1].split("'")[0];
				return pass;
				
					
				
			}				

	}

	