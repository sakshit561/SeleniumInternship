package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {
	WebDriver driver;
	@BeforeMethod
public void setup() {
	System.out.println("Hello Charan");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.google.com/");
}
	@Test
	public void  googletitle() {
		String title =driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void googleLogo() {
		boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(b);
	}
	@Test
	public void gmailText() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
				System.out.println(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	//beforemethod
	//test
	//aftermethod

	}


