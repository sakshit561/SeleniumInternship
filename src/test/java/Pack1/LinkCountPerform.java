package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// count size of all links 
		System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footerLink= driver.findElement(By.id("gf-BIG"));
       System.out.println(footerLink.findElements(By.tagName("a")).size());
       
     //  click all link from first Section on footer
       WebElement firstSection=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       System.out.println(firstSection.findElements(By.tagName("a")).size());
	  for (int i=0;i<firstSection.findElements(By.tagName("a")).size();i++) {
		   String clicknewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		   firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
		  
	  }
	  WebElement secondSection=driver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
	  System.out.println(secondSection.findElements(By.tagName("a")).size());
	  for(int j=0;j<secondSection.findElements(By.tagName("a")).size();j++) {
		  String click2= Keys.chord(Keys.CONTROL,Keys.ENTER);
		  secondSection.findElements(By.tagName("a")).get(j).sendKeys(click2);
	  }
	
	  WebElement thirdSection=driver.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
	  System.out.println(thirdSection.findElements(By.tagName("a")).size());
	  for(int k=0;k<thirdSection.findElements(By.tagName("a")).size();k++) {
		  String click3= Keys.chord(Keys.CONTROL,Keys.ENTER);
		  thirdSection.findElements(By.tagName("a")).get(k).sendKeys(click3);
	  }
	  WebElement fourthSection=driver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
	  System.out.println(fourthSection.findElements(By.tagName("a")).size());
	  for(int l=0;l<fourthSection.findElements(By.tagName("a")).size();l++) {
		  String click4= Keys.chord(Keys.CONTROL,Keys.ENTER);
		  fourthSection.findElements(By.tagName("a")).get(l).sendKeys(click4);
	  }
	}

}
