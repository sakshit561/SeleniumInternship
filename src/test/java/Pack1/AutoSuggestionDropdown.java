package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='India']")).click();
		driver.findElement(By.xpath("//a[text()='India']")).click();
		//List<WebElement> options = driver.findElements(By.cssSelector("li[class= 'ui-menu-item'"));
		//for(WebElement option:options) {
			//if(option.getText().equalsIgnoreCase("India")) {
				//option.click();
				//break;
			//}
		//}
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
	    int s=driver.findElements(By.cssSelector("input[type='checkbox']")).size();	
	    System.out.println(s);
	    int r = driver.findElements(By.cssSelector("input[type='radio']")).size();
	    System.out.println(r);
	    //implicit -->globally and it keep listen to dom.
	    //explicit -->in this case you can wait for specific element.
	}  
}
