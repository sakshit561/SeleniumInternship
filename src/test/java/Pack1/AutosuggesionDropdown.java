package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggesionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(4000);
		d.findElement(By.xpath("Ukraine")).click();
//		List<WebElement> options=d.findElements(By.cssSelector("li[class='ui-menu-item']"));
//		for (WebElement option:options){ 
//			 if(option.getText().equalsIgnoreCase("India")) {
//				 
//				 option.click();
//				 break;
//			 }
//		}
		d.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		System.out.println(d.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		int s=d.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(s);
		

	}

}
