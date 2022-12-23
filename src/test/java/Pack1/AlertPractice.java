package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.cssSelector("input#alertbtn")).click();
		Thread.sleep(4000);
		d.switchTo().alert().accept();
		
		
		d.findElement(By.cssSelector("input#confirmbtn")).click();
		d.switchTo().alert();
		
	}

}
