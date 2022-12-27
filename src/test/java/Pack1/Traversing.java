package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abhinav Agrawal");
		
		WebDriver driver =  new ChromeDriver();
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)");
		driver.manage().window().maximize();
		
		//header/div/button[1]/following-sibling::button[1]
		
		//Grandparent--parent--child--sibling
		//header/div/button[1]/parent::div/button[1]
		//Grandparent--parent--child--parent--child
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	}

}
