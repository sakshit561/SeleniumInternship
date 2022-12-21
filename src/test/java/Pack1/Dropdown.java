package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main (String args[]) throws InterruptedException{
		//System.out.println("hello yattu");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Stuti_Uppi\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wd.manage().window().maximize();
		//staticdropdown
		WebElement el = wd.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select option = new Select(el);
		
		//dropdown.selectByIndex(2);
		option.selectByVisibleText("USD");
		
		//update dropdown
		wd.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1 ; i<=5 ; i++) {
			
			wd.findElement(By.id("hrefIncAdt")).click();
			
		}
		wd.findElement(By.id("btnclosepaxoption")).click();
		
	
	
	
	  // Dynamic dropdown
    
    wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    wd.findElement(By.xpath("//a[@value='GWL']")).click();
    Thread.sleep(2000);
    
    wd.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    
//    for date 
    wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")).click();
    Thread.sleep(2000);
    wd.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
    Thread.sleep(2000);
    wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a")).click();
    
    
}


}
