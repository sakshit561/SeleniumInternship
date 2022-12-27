package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	public static void main(String[] args) {
		System.out.println("Hello Nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://jqueryui.com/droppable/");
		cd.switchTo().frame(0);
//		WebDriverWait w = new WebDriverWait(cd, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"draggable\"]")));
//		cd.findElement(By.xpath("//*[@id=\"draggable\"]")).click();
		WebElement source = cd.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = cd.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions ac = new Actions(cd);
		ac.dragAndDrop(source, target).perform();
		
		
	}
}
