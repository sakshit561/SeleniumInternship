package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestiondropdown {
	public static void main(String[]args) throws InterruptedException {
		
		System.out.println("helllo stuti");
		 WebDriverManager.chromedriver().setup();
		 WebDriver wd = new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 wd.findElement(By.id("autosuggest")).sendKeys("uk");
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//a[text()='Ukraine']")).click();
		 
//		 List<WebElement> options =wd.findElements(By.cssSelector("li[class='ui-menu-item']"));
//				 for(WebElement option:options) {
//					 
//					 if(option.getText().equalsIgnoreCase("India")) {
//						 option.click();
//						 break;
//	}
//				 }
		 
		 wd.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		// wd.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected();
		 
		//System.out.println(wd.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		 //wd.findElement(By.cssSelector("input[type='checkbox']")).getSize();	
		 int s = wd.findElements(By.cssSelector("input[type='checkbox']")).size();
		 System.out.println(s);
	}

}
