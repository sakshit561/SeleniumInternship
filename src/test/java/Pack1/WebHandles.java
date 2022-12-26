package Pack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebHandles {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://rahulshettyacademy.com/loginpagePractise/");
		cd.findElement(By.className("blinkingText")).click();
		Set<String> s = cd.getWindowHandles();
		List<String> l = new ArrayList<String>();
		l.addAll(s);
		System.out.println(l.get(1));
		cd.switchTo().window(l.get(1));
		String text = cd.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]/strong")).getText();
		cd.switchTo().window(l.get(0));
		cd.findElement(By.xpath("//input[@type='text']")).sendKeys(text);
		cd.findElement(By.cssSelector("input[name=password]")).sendKeys("learning");
		cd.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		WebDriverWait w =new WebDriverWait(cd, Duration.ofSeconds(3));
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));		
		cd.findElement(By.id("okayBtn")).click();
		cd.findElement(By.id("terms")).click();
		cd.findElement(By.cssSelector("input[name=signin]")).click();
		
		
		
		
	}
}
