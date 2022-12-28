package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Manish");
		System.setProperty("webdriver.chrome","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String text="india";
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//static dropdown
		WebElement el =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown =new Select(el);
		
		//dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("USD");
		
		
		//updated Dropdown
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1; i<=4; i++)
		{
			
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		 
		//dynamic dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		driver.findElement(By.xpath("(//a[text()=5])[1]")).click();
		
		driver.findElement(By.className("ctl00$mainContent$view_date2")).click();
		
		//driver.findElement(By.id("autosuggest")).sendKeys(text);
	//	driver.findElement(By.id("ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all"));
		

		
		
		
	}

}
