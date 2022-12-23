package Pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWaitUsingInGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Abhinav Agrawal");
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\SeleniumInternship\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String [] items= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		//System.out.println(product.size());
		
		for(int i=0;i<product.size();i++) {
			String name = product.get(i).getText().split("-")[0];
			String n = name.trim();
			//System.out.println(name);
			
			 //List itemList = Arrays.asList(items);
			if(name.contains("Cucumber")) {
				System.out.println(n);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("input.promoCode")).sendKeys("abc");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
		
		//String name = "Invalid code ..!";
		
		//System.out.println(driver.findElement(By.cssSelector("h2")).getText());
		//String actualresult1 = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		//System.out.println(actualresult1);
		
		//String expectedResult1 = name;
		//Assert.assertEquals(actualresult1,expectedResult1);
		//System.out.println(actualresult1);
		
		Thread.sleep(2000);
		WebElement el  = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
		Select dropdown = new Select(el);
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.tagName("button")).click();


	}

}
