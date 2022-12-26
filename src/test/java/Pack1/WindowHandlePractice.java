package Pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlePractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
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
		d.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
		d.findElement(By.cssSelector("label:nth-child(2) span:nth-child(1)")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Thread.sleep(5000);
		WebElement el = d.findElement(By.xpath("//select[@class='form-control']"));
		Select s = new Select(el);
		s.selectByIndex(2);
		//s.selectByVisibleText("Teacher");
		d.findElement(By.xpath("//input[@id='terms']")).click();
		d.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		
		
	}

}
