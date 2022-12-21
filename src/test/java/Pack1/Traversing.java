package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).click();
	    System.out.println( driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
	    System.out.println( driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}
}
//header/div/button[2]/following-sibling::button[1] 
//header/div/button[1]/following-sibling::button[1]---> Grandparent-->Parent-->Child-->Siblings
//header/div/button[1]/parent::div/button[2]---> Grandparent-->Parent-->Child-->Parent-->Child