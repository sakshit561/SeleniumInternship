package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[6]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[6]/div[3]/button")).click();
         driver.findElement(By.cssSelector("img[alt = 'Cart']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("ABCDE");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='promoBtn']"))).click();
         driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        WebElement el = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
         Select ee = new Select(el);
         ee.selectByVisibleText("Afghanistan");
         driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Proceed']")));
         driver.findElement(By.xpath("//button[text()='Proceed']")).click();
         
	}

}
