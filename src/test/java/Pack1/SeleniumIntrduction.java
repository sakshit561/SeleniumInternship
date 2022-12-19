package Pack1;

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
	
			//invoking browser 
			//chromeDriver---> methods --->get,close
		//ChromeDriver driver = new ChromeDriver();
			System.setProperty("Web.driver.chrome.driver","C:\\Users\\Stuti_Uppi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//driver.get("https://www.w3schools.com/");
			driver.navigate().to("https://www.w3schools.com/");
			
		}
	
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
>>>>>>> 4fb459702e45b5f327328804dda5536a03899730

public class seleniumwebdrivercommands {
 public static void main (String[]args) {
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.nopcommerce.com/en/demo");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();
	 //System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
	 driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin");
	 
	 //driver.findElement("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button").click();
	 
	 //driver.quit();
	 
	 
	 //driver.close();
 }
}
