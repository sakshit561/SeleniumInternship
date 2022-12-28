package Pack1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String [] items= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(20));
		List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<product.size();i++) {
			String name=product.get(i).getText();
			
			
			 //List itemList = Arrays.asList(items);
			if(name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			break;
			}
			
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("abc");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		 //System.out.println(driver.findElement(By.tagName(" System.out.println(driver.findElement(By.tagName(\"p\")).getText());")).getText());
		 Thread.sleep(5000);
		System.out.println( driver.findElement(By.xpath("//span[text()='Invalid code ..!']")).getText());
	    String actualresult= driver.findElement(By.cssSelector("span.promoInfo")).getText();
	    
   Thread.sleep(2000);
		String expectedresult="Invalid code ..!";
    Assert.assertEquals(actualresult,expectedresult);  
	}
	
	}


