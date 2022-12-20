package pack2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		d.findElement(By.id("first-name")).sendKeys("Sagar Verma");
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vermasagar640@gmail.com");
		
			}

}