package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCountPerform {
	public static void main(String[] args) {
		System.out.println("Hello Manish Arya");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Count all Links
       
	   System.out.println(driver.findElements(By.tagName("a")).size());
       
	   WebElement footerLink=driver.findElement(By.id("gf-BIG"));
	   
	   System.out.println(footerLink.findElements(By.tagName("a")).size());
	   
	   //click all links from first Section on footer
	   
	   WebElement firstSection=driver.findElement(By.xpath("(//table/tbody/tr/td/ul)[1]"));
	   
	   System.out.println(firstSection.findElements(By.tagName("a")).size());
	   
	   // click all links for new tap 
	   
	   for(int i=0; i<firstSection.findElements(By.tagName("a")).size(); i++)
	   {
		   String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		   
		   firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
		   
		   
	   }
	   
	   //click all links from Second Section on footer
      WebElement SecondSection=driver.findElement(By.xpath("(//table/tbody/tr/td/ul)[2]"));
	   
	   System.out.println(SecondSection.findElements(By.tagName("a")).size());
	   
	   for(int i=0; i<SecondSection.findElements(By.tagName("a")).size(); i++) {
		   
          String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		   
		   SecondSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
		   
		   
	   }
	   
	   //click all links from Third Section on footer
	   
	   WebElement ThirdSection=driver.findElement(By.xpath("(//table/tbody/tr/td/ul)[3]"));
	   System.out.println(ThirdSection.findElements(By.tagName("a")).size());
	   
	   for(int i=0; i<ThirdSection.findElements(By.tagName("a")).size();i++) { 
		   
		   String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		   
		   ThirdSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
	                 
		
	   }
	   
        //click all links from fourth Section on footer
	   
	   WebElement fourSection=driver.findElement(By.xpath("(//table/tbody/tr/td/ul)[4]"));
	   System.out.println(fourSection.findElements(By.tagName("a")).size());
	   
	   for(int i=0; i<fourSection.findElements(By.tagName("a")).size();i++) { 
		   
		   String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		   
		   fourSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
	                 
		
	   }

  }
}
