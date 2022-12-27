package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w =  new WebDriverWait(d,Duration.ofSeconds(20));
		
		d.get("https://www.jqueryui.com/droppable/");
		System.out.println(d.findElements(By.className("demo-frame")).size());
		//d.switchTo().frame(0);
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		d.findElement(By.id("draggable")).click();
		Actions a =new Actions(d);
		WebElement source = d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		d.switchTo().defaultContent();
	}

}
