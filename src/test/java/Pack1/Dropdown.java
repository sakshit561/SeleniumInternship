package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		String text="ind";
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
	
		WebElement el = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(el);
		// static dropdown
		dropdown.selectByIndex(3);
		//we  can use any one of them 
		//dropdown.selectByVisibleText("USD");
		
		//updated dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<=5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		//driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Dynamic Dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();	
		driver.findElement(By.xpath("//a[text()=23]")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		
	}

}
