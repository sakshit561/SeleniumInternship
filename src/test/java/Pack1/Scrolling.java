package Pack1;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
//		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    JavascriptExecutor js=(JavascriptExecutor) d;
//		js.executeScript("window.scrollBy(0,700)");
//		//js.executeScript("window.scrollTop=5000)");
//		js.executeScript("document.querySelector(.tableFixHead).scrollTop=5000");
	
		d.get("https://www.domain.com/");
		js.executeScript("scrollBy(0,2700)");
		
		
	}

}