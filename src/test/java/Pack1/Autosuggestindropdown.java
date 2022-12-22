package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestindropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver d = new ChromeDriver();

d.get("https://rahulshettyacademy.com/dropdownsPractise/");
d.findElement(By.id("autosuggest")).sendKeys("ind");	
//List<WebElement>options=d.findElement(By.cssSelector("li[class='ui-menu-item']"));
Thread.sleep(2000);	
d.findElement(By.xpath("//a[text()='India']")).click();
d.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
//System.out.println(d.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
//System.out.println(d.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).getSize());	
int s=d.findElements(By.cssSelector("input[type='checkbox']")).size();	
	System.out.println(s);
	int t=d.findElements(By.cssSelector("input[type='radio']")).size();
	System.out.println(t);
	}

}
