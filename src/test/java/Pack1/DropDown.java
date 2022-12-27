package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Abhinav Agrawal");
		
		WebDriver driver =  new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\SeleniumInternship\\ChromeDriver\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		//Static Dropdown
		WebElement el  = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(el);
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("USD");
		/*
		WebElement el1  = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Select dropdown1 = new Select(el1);
		dropdown1.selectByIndex(5);
		*/
		
		// Updated Dropdown
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Loop use for multiple clicking
		Thread.sleep(2000);
		for(int i = 1; i<=5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Dynamic DropDown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//AutoSuggestion box slection
		String text = "ind";
	
		driver.findElement(By.id("autosuggest")).sendKeys(text);
		
		
	}

}
