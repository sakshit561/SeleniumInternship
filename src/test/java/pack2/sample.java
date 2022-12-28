package pack2;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.id("first-name")).sendKeys("Sagar");
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vermasagar640@gmail.com");
		d.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Verma");
		d.findElement(By.name("mobile")).sendKeys("8602874116");
		d.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Gwalior");
		WebElement el = d.findElement(By.xpath("//*[@id=\"country\"]"));
		Select s = new Select(el);
		s.selectByIndex(92);
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("hii sagar verma");
		d.findElement(By.xpath("//*[@id=\"enroll-form\"]/button")).click();
		
			}
	   
	}

