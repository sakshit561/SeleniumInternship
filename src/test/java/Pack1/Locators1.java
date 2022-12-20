package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String dynamicpass = getPassword(driver);
		//getEmail(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("NIVEDITA SAXENA");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("input[type='text']: nth-child(2)")).sendKeys("894572657");
		//driver.findElement(By.xpath("//input[@type= 'text'][3]")).sendKeys("894572657");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("894572657");
		//driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		//button[contains(@class,'submit')]
		String name = "abc@gmail.com,";
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys(dynamicpass);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//driver.close();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		//String actualresult = driver.findElement(By.tagName("p")).getText();
	    //String expectedresult = "You are successfully logged in.";
	    //Assert.assertEquals(actualresult, expectedresult);
	   // Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	    String actualresult = driver.findElement(By.tagName("p")).getText();
		String expectedresult = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(actualresult,expectedresult);
		//driver.findElement(By.xpath("//button[text()='Log Out']")).click();		
		//driver.findElement(By.xpath("//*[text()='Log Out']")).click();		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("h2")).getText());
		String actualresult1 = driver.findElement(By.cssSelector("h2")).getText();
		String expectedresult1 = "Hello "+ name; 
		Assert.assertEquals(actualresult1,expectedresult1);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();	

		Thread.sleep(2000);
	
		driver.close();	
	}

		public static String getPassword(WebDriver driver) throws InterruptedException
		{
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("reset-pwd-btn")).click();
			String password = driver.findElement(By.cssSelector("form p")).getText();
		    System.out.println(password);
		    String[] passwordText = password.split("'");
		    String passwordArr = passwordText[1].split("'")[0];
		    return passwordArr;
		}
		
}


	


