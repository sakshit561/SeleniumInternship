package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
	//--------------staticDropDown----------
	    WebElement el= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown=new Select(el);
	    
	    //dropdown.selectByIndex(2);
	    dropdown.selectByVisibleText("USD");
	    
	//-----------UpdatedDropDown-------------
	    
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=1; i<5; i++) {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	     }
        
         for(int i=1; i<5; i++) {
        	 driver.findElement(By.id("hrefDecAdt")).click();
         }
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    
	    
	//-------------------DynamicDropdown-----------
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Gwalior (GWL)']")).click();
	    driver.findElement(By.xpath("(//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]")).click();
	    driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
	    driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	    driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
	    
	   }
		
		

	}


