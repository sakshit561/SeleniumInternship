package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestiondropdown {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		   WebDriver driver =  new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   driver.findElement(By.id("autosuggest")).sendKeys("ind");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[text()='India']")).click();
//           List<WebElement>options=(List<WebElement>) driver.findElement(By.cssSelector("class=\"ui-corner-all\""));
//		   for (WebElement option:options) {
//					   if(option.getText().equalsIgnoreCase("India")) {
//						   option.click();
//						   break;
//					   }
//					   
//					   
//				   }
		   
//		   CheckBox
		   driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
//		   System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		   System.out.println( driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
	       int s=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	       System.out.println(s);
	       int r=driver.findElements(By.cssSelector("input[type='radio']")).size();
	       System.out.println(r);
	}
	
	
}
