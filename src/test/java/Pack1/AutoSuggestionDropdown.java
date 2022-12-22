package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		//String text="ind";
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='India']")).click();
		
//		List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
//		for (WebElement option:options) {
//			if (option.getText().equalsIgnoreCase("India")) {
//				option.click();
//				break;
//			}
//			}
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		int s=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(s);
		int r=driver.findElements(By.cssSelector("input[type='radio']")).size();
		System.out.println(r);
		}
	}
	


