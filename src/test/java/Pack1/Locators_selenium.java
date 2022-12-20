package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_selenium {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("hello nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://rahulshettyacademy.com/locatorspractice/");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("baisu");
		cd.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		cd.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
		cd.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("nivesh");
		cd.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nivesh@gmail.com");
		cd.findElement(By.cssSelector("input[type=text]:nth-child(4)")).sendKeys("7879577398");
		Thread.sleep(2000);
		cd.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);
		cd.findElement(By.className("go-to-login-btn")).click();
		cd.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("7879577398");
		cd.findElement(By.cssSelector("input[type=password]")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		cd.findElement(By.id("chkboxTwo")).click();
		cd.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(2000);
//		String result = cd.findElement(By.tagName("p")).getText();
//		Assert.assertEquals(result, "You are successfully logged in.");
		cd.findElement(By.xpath("\\buttton[text()='logout-btn']")).click();
	
	
	
	}
}
