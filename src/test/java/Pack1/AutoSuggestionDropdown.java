package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("autosuggest")).sendKeys("Uk");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='India']")).click();
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
	    System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isEnabled());
	    int s = driver.findElements(By.cssSelector("input[type='checkbox']")).size();	
	    System.out.println(s);
	    int r = driver.findElements(By.cssSelector("input[type = 'radio']")).size();
	    System.out.println(r);
		
	/*List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
	for(WebElement option:options) {
	if (option.getText().equalsIgnoreCase("india")) {
		
		option.click();
		break;
	   }
	 }*/
		
	}

}
