package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_of_table {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Nivesh");
		WebDriverManager.chromedriver().setup();
//		making object of chromedriver
		WebDriver cd = new ChromeDriver();
//		launching demo website
		cd.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(3000);
		
//		getting all headings of table and print them .
		List<WebElement> s= cd.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		
//		print values of headings
		for(WebElement i : s) System.out.print(i.getText()+ "     |     ");	
		System.out.println();
//		printing value of all table data :
		for(int i = 2;i< 8;i++) {
			for(int j =1 ; j <= s.size() ; j++) {
		System.out.print( cd.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"     |     ");
			}
			System.out.println();
		}
	}
}
