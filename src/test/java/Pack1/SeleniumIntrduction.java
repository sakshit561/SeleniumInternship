package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
			System.setProperty("Web.driver.chrome.driver","C:\\Users\\Stuti_Uppi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			//driver.navigate().to("https://www.w3schools.com/");
			Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[3]/div/div[1]/div/p/label")).click();
	//	driver.close();
			//driver.findElement(By.className("font14 fullWidth")).sendKeys("9171170164");
			//driver.findElement(By.className("capText font16")).click();
			//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[3]/a")).click();
			
			
			
			
			
		}

}
