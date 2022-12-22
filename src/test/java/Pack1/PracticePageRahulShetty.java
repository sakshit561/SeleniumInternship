package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePageRahulShetty {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
      //header/div/button[1]/following-sibling::button[1]
		//Grandparent--parent-child--sibling
		
	  // header/div/button[1]/parent::div/button[2]	
	  // Grandparent--parent--child--parent--child
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
	}

}
