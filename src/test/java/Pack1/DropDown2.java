package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");  
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")));
		
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@class='r-18u37iz'])[16]")).click();
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n])[35]")).click();

	}

}
