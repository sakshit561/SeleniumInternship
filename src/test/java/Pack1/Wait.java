package Pack1;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Wait {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		Thread.sleep(2000);
		List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) {
			String name =product.get(i).getText().split("-")[0];
			String n = name.trim();
			System.out.println(n);
		   //System.out.println(product.size());
		
		       if(n.contains("Cucumber")) {
		    	   System.out.println("reshu");
			
			    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			 break;
			}
		}//close for loop
		
	    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
	    WebElement apply = driver.findElement(By.cssSelector("button.promoBtn"));
	    apply.click();
	    
	    driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("123");
	    apply.click();
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        driver.findElement(By.xpath("//select[@style='width: 200px;']")).sendKeys("india");
        driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    
	    
	}
	
}

