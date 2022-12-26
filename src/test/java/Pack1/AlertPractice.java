package Pack1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Yashodhan Agrawal");
		
		WebDriver driver =  new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		
		//for clicking on alert box 
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		//for cancel
		//driver.switchTo().alert().dismiss();
		
		
		
	}

}