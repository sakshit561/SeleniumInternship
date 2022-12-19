package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
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
			driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();
	        //button[contain(@class,'submit']
	}
}

