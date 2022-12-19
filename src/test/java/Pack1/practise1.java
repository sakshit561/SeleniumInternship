package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise1 {
	public static void main(String []args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("chauhanstuti144@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("9171170164");
	
		
		
	}

}
