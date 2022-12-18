package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_practice_2 {



	public static void main(String [] ar) {
		// TODO Auto-generated constructor stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");  
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("Reshu Pradhan");
		driver.findElement(By.id("email")).sendKeys("reshu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("mobile")).sendKeys("7803068856");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[2]/div[2]/p")).click();
		//driver.findElement(By.id("//*[@id=\"currentCity\"]")).sendKeys("Gwalior");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/div[1]/div[1]/button")).click();
		//driver.wait(20);
		driver.close();
	
	}

}