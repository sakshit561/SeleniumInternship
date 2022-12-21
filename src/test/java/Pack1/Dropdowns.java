package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String text = "Ind";
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //static dropdown --> for choosing the currency
		
		WebElement e1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    	Thread.sleep(2000);
        Select dropdown = new Select(e1);
    	Thread.sleep(2000);
       // dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("USD");
        
        //updated dropdown -->  for choosing the seats of adults
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1;i<=5;i++) {
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        //dynamic dropdown--> for departure and arrival 
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
      
        driver.findElement(By.xpath("//a[text()=28]")).click();
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        driver.findElement(By.xpath("//a[text()=30]")).click();
        driver.findElement(By.id("autosuggest")).sendKeys(text);
        driver.findElement(By.id("ui-id-85")).click();
        
	}

}
