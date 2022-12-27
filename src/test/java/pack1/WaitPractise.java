package pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractise {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hellow shubham");
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (4)2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String [] items = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<product.size();i++) {
			String name = product.get(i).getText();
			
			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
				driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("shubham");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			
		}
	}
