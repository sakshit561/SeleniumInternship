package Pack1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	public class AutosuggestionDropdown {
		public static void main(String[] args) throws InterruptedException {
			System.out.println("hello yash");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("hon");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[text()='Hong Kong']")).click();
//			List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
//			
//			for (WebElement option:options) {
//				if(option.getText().equalsIgnoreCase("Brazil")) {
//					option.click();
//					break;
//					
//				
//				}
				
			}
			
		}

	

