package Pack1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitImplicit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//String [] items = {"Cucumber","Beetroot","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0;i<product.size();i++) {
			String name = product.get(i).getText().split("-")[0];
			String name1= name.trim();
			System.out.println(name1);
			//List itemList = Arrays.asList(items);
			/*Thread.sleep(2000);
			if(product.contains("Cucumber")) {
				driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button")).c
			 break;
			}*/
			
		}

	}

}
