package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAutoSuggestion {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Charan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='India']")).click();
		/*List<WebElement>options=driver.findElements(By.cssSelector("class=\"ui-corner-all\""));
		
		for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("india")) {
			option.click();
			break;*/
			
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Dimension s=driver.findElement(By.cssSelector("input[type='checkbox']")).getSize();
		System.out.println(s);
		}
		
		
		
	}


