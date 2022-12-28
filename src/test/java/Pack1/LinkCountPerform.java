package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCountPerform {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// count size of all links 
		System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footerLink= driver.findElement(By.id("gf-BIG"));
       System.out.println(footerLink.findElements(By.tagName("a")).size());
       
      // click all link from first Section on footer
       WebElement firstSection=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       System.out.println(firstSection.findElements(By.tagName("a")).size());
	  for (int i=0;i<firstSection.findElements(By.tagName("a")).size();i++) {
		   String clicknewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		   firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
		  
	  }
	
	}

}