package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Charan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         driver.findElements(By.tagName("a")).size();
         System.out.println( driver.findElements(By.tagName("a")).size());
     WebElement footerLink     = driver.findElement(By.id("gf-BIG"));
     System.out.println(footerLink.findElements(By.tagName("a")).size());
     WebElement firstSection=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
     System.out.println(firstSection.findElements(By.tagName("a")).size());
	  for (int i=0;i<firstSection.findElements(By.tagName("a")).size();i++) {
		   String clicknewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		   firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);

      }
	}

}
