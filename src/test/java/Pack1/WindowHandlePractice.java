package Pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w =  new WebDriverWait(d,Duration.ofSeconds(20));
		
		d.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		d.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window= d.getWindowHandles();
		
		
		Iterator <String>it = window.iterator();
		
		String parentId= it.next();
		String childID=it.next();
		d.switchTo().window(childID);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
		
		System.out.println(d.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId =d.findElement(By.cssSelector(".im-para.red"))
				.getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailId);
		d.switchTo().window(parentId);
		d.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		d.findElement(By.id("password")).sendKeys("learning");
		d.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
		//d.findElement(By.xpath("okayBtn")).click(); 
		d.findElement(By.id("terms")).click();
		d.findElement(By.id("signInBtn")).click();
	}

}
