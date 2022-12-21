package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hello Charan");
     System.setProperty("wevdriver.chrome.driver", "C:\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement( By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
     
		
		
		
	}

}
