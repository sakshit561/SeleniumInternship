package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingPracticeOnGreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Abhinav Agrawal");
		
		WebDriver driver =  new ChromeDriver();
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\SeleniumInternship\\ChromeDriver\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click();
		//*[@id="root"]/div/header/div/div[3]/a[4]/img
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
		//*[@id="root"]/div/header/div/div[3]/div[2]/div[2]/button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		//*[@id="root"]/div/div/div/div/div/input
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input")).sendKeys("56565");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		Thread.sleep(2000);
		//div[@class='wrapperTwo']//div//select
		
		WebElement el  = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
		Select dropdown = new Select(el);
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.tagName("button")).click();
			
	}

}
