package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitmethods {
	
public static void main(String[]args) throws InterruptedException {
		
		System.out.println("helllo stuti");
		 WebDriverManager.chromedriver().setup();
		 WebDriver wd = new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 wd.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 wd.findElement(By.cssSelector("img[alt='Cart']")).click();
		 wd.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		 wd.findElement(By.xpath("//input[@class='promoCode']")).click();
		 
                   
}
}
