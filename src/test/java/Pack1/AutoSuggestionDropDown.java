package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='India']")).click();
		List <WebElement> options = driver.findElements(By.xpath("//a[text()='India']"));
		for (WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India"))
			option.click();
			break;
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		int si = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.print(si);

	}

}
