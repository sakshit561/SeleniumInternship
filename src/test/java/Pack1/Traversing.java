package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {
	public static void main (String args[]){
		//System.out.println("hello yattu");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Stuti_Uppi\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(wd.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
		
	}

}
