package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.cssSelector("input#alertbtn")).click();
		d.switchTo().alert().accept();
	}
	

}
