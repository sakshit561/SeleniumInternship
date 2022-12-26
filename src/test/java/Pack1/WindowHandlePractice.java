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
		System.out.println("Hello Manish");
		WebDriver d = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		d.manage().window().maximize();
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
		d.findElement(By.id("username")).sendKeys(emailId);


	}

}
