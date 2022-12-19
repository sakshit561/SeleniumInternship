package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Order_on_ecommerce {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.myntra.com/");
		WebElement el =cd.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"));
		
		el.sendKeys("shoes men");
	
		cd.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[4]/a/div[1]/div/div/div/picture/img")).click();
//		Actions ac = new Actions(cd);
		Thread.sleep(2000);
		
		
		WebDriver cd2 = new ChromeDriver();
		cd2.manage().window().maximize();
		cd2.get("https://www.myntra.com/sports-shoes/adidas/adidas-men-black-solid-adi-zoom-running-shoes/16995898/buy");
		Thread.sleep(2000);
		cd2.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[3]/div[1]/button/p")).click();
		Thread.sleep(1000);
		cd2.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
		
		
		
//		not finished : not working 	properly ;
	}
}
