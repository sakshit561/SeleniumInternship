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

public class WaitPractiseusingExplicit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		//String [] items = {"Cucumber","Brocolli","Beetroot"};
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w =  new WebDriverWait(d,Duration.ofSeconds(20));
		//d.findElement(By.xpath("//h4[text()='Cucumber']")).click();
		List<WebElement>product=d.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<product.size();i++) {
			String name = product.get(i).getText().split("-")[0];
			 String n = name.trim();
			//List itemList =Arrays.asList(items);
			if (n.contains("Cucumber")) {
				System.out.println(n);
				d.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		d.findElement(By.cssSelector("img[alt='Cart']")).click();
		d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))).sendKeys("abcde");
		//d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abcde");
		d.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
//		String actualresult=d.findElement(By.className(".promoInfo")).getText();
//		System.out.println(actualresult);
//		String expectedresult="Invalid code ..!";
//		Assert.assertEquals(actualresult,expectedresult);
//		 System.out.println(d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/span")).getText());
		d.findElement(By.xpath("//button[text()='Place Order']")).click();	
		 
	}

}

