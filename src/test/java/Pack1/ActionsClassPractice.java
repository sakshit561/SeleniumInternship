package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		//a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("laptops").build().perform();
		//WebElement search =  driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("laptops").keyDown(Keys.ENTER).doubleClick().build().perform();
		//search.click();
		a.moveToElement(move).contextClick().perform();
		
		
		
	}

}
