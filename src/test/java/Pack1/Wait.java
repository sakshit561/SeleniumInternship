package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Charan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  //driver.manage().window().implicityWait(5,TimeUnit.SECONDS)
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();

				
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abc");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(2000);
		WebElement el = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
		Select dropdown = new Select(el);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	}

}