package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GhanShyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//System.setProperty("WebDriver.Chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe");
   WebDriverManager.chromedriver().setup();
   WebDriver driver =  new ChromeDriver();
   driver.get("https://www.nopcommerce.com/en/demo");
   driver.manage().window().maximize();
   driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();
   System.out.println(driver.getTitle());
   driver.findElement(By.xpath("//*[id=\"Email\"]")).sendKeys("admin@yourstore.com");
   driver.findElement(By.xpath("//*[id=\"Password\"]")).sendKeys("admin");
   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
