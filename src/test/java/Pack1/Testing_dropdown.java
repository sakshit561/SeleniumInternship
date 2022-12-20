package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ACCOUNT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Customer Login")).click();
		driver.findElement(By.cssSelector("input[placeholder = Email]")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demouser");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		driver.get("https://phptravels.net/");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[1]/div/div/div/span")).click();
        driver.findElement(By.cssSelector("input[class=select2-search__field]")).sendKeys("indore");
        driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[2]")).click();
        driver.findElement(By.id("ages1")).click();
        driver.findElement(By.cssSelector("option[value = '4']")).click();
	}
	
	
	}
	
 
