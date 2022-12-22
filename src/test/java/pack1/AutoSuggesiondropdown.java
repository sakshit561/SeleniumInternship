package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesiondropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hellow shubham");
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (4)2\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//a[normalize-space()='India'])[1]")).click();

		
		
//		List<WenElement> option=d.fin
		
		d.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//System.out.println(d.findElement(By.cssSelector("input[type=checkbox']")).getSize());
		int s=d.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(s);
		int t=d.findElements(By.cssSelector("input[type='radio']")).size();
		System.out.println(t);
		
		
		
		
	}

}
