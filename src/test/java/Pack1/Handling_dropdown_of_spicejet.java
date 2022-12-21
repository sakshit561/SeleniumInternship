package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown_of_spicejet {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
//		launching spicejet webpage : 
		cd.manage().window().maximize();
		cd.get("https://www.spicejet.com/");
		
//		click on from input and enter gwalior in it .
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[23]/div[1]/div[1]")).click();
		
//		click on (to) input and enter ajmer in it .	
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div")).click();
		
//		selecting date 31 
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[6]/div/div")).click();
		
//		click on list of passengers : and selecting 6 adults and 2 childs and then done button
		cd.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		for(int i = 0 ; i <5 ; i++) {
			Thread.sleep(1000);
			cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
			if(i>2) {
				cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			}
		}
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
//		Thread.sleep(1000);
//		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		
//		click on currency section and select USD 
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]")).click();
		
//		click on search flights button
		Thread.sleep(5000);
		cd.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
		Thread.sleep(2000);
		
//		expected output on console == {Unfortunately, there are no flights available.}
		String test = cd.findElement(By.xpath("//*[@id=\"list-results-section-0\"]/div[2]/div[1]")).getText();
		System.out.println(test);
	
	}
}
