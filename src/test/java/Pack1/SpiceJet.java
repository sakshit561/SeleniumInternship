package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com/default.aspx");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		driver.findElement(By.xpath("//a[text()=24]")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("//a[text()=27]")).click();
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]/option[5]")).click();
		
		WebElement el = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(el);
		// static dropdown
		//dropdown.selectByIndex(3);
		//we  can use any one of them 
		dropdown.selectByVisibleText("CAD");
	
	}

}
