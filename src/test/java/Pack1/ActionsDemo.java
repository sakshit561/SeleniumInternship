package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		Actions ac = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("button[id= 'developers-menu-toggle']"));
		ac.moveToElement(move).build().perform();
		WebElement move1= driver.findElement(By.xpath("//a[@title='support']"));
		ac.keyDown(Keys.ARROW_DOWN).click(move1).build().perform();

	}

}
