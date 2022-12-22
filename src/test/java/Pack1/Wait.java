package Pack1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,null);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	//    driver.findElement(By.xpath("//button[contains(text(),'proceed to checkout')]"   )).click();
//driver.findElement(By.xpath("//input[@class='promocode']")).sendKeys("abc");
driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();	
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
driver.findElement(By.xpath("//input[@class='promocode']")).sendKeys("abc");
driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
	
	}

}
