package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		String text="ind";
		 // static dropdown
		   
	    WebElement el = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown =new Select(el);
	    //dropdown.selectByIndex(2);
	    dropdown.selectByVisibleText("USD");
	    // Updated dropdown
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=1;i<=5;i++) {
		    driver.findElement(By.id("hrefIncAdt")).click();
		    }
        driver.findElement(By.id("btnclosepaxoption")).click();
	    
	    // Dynamic dropdown
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='GWL']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    driver.findElement(By.id("autosuggest")).sendKeys(text);
	    Thread.sleep(2000);
		

	}

}
