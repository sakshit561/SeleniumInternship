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
		// TODO Auto-generated method stub
		System.out.println("Hello Charan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		 String  parentId =it.next();
		 String  childID =it.next();
		driver.switchTo().window(childID);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId =driver.findElement(By.cssSelector(".im-para.red"))
		.getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		driver.findElement(By.id("password")).sendKeys("Learning");
		//driver.findElement(By.name("//*[@id=\"login-form\"]/div[4]/div/label[1]/span[2]")).click();
		//driver.findElement(By.className("//*[@id=\"login-form\"]/div[5]/select")).click();
	}

}
