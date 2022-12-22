package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fhelp%2Fpolicies%2Fdefault%2Febays-rules-policies%3Fid%3D4205");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mahor");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("raj@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Layer_1\"]")).click();
		
	}

}
