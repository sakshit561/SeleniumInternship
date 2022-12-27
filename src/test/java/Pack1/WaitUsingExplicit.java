package Pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitUsingExplicit {
	 
		public static void main(String[] args) throws InterruptedException  {
		
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			//Thread.sleep(2000);
			String [] items= {"Cucumber","Brocolli","Beetroot"};
			List <WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
			//Thread.sleep(2000);
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(15));
			
			for(int i=0; i<product.size(); i++) {
				
				String name=product.get(i).getText();
				//	List al = Arrays.asList(items);
				
				if(name.contains("Cucumber")) {
				//	Thread.sleep(2000);

					
	    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					break;
					
				}
			}
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))).sendKeys("abcde");
			//d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abcde");
			driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
				 
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//span[text()='Invalid code ..!']")).getText());
			String actualresult=driver.findElement(By.cssSelector("span.promoInfo")).getText();
			Thread.sleep(2000);
			String expectedresult="Invalid code ..!";
			Assert.assertEquals(actualresult,expectedresult);
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[text()='Place Order']")).click();	
			Thread.sleep(2000);
			
			WebElement el = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
			Select s = new Select(el);
			s.selectByVisibleText("India");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
			
		}

	}