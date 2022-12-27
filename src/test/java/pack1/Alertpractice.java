package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver =  new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     //driver.findElement(By.id("input#openwindow")).click();
	     //driver.switchTo().activeElement();
	     driver.findElement(By.cssSelector("input#alertbtn")).click();
	     driver.switchTo().alert().accept();
	     Thread.sleep(20000);
	     driver.findElement(By.xpath("input#confirmbtn")).click();
	     driver.switchTo().alert().dismiss();

	     
	}

}
