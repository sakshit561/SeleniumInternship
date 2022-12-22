package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello yashodhan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		WebElement e1 = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
    	Thread.sleep(2000);
        Select dropdown = new Select(e1);
    	Thread.sleep(2000);
       // dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("KWD");
        
        //updated dropdown -->  for choosing the seats of adults
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement e2 = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
    	Thread.sleep(2000);
        Select dropdown1 = new Select(e2);
    	Thread.sleep(2000);
       // dropdown.selectByIndex(2);
        dropdown1.selectByVisibleText("5");
        //dynamic dropdown--> for departure and arrival 
        
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
      
        driver.findElement(By.xpath("//a[text()=28]")).click();
        driver.findElement(By.id("custom_date_picker_id_2")).click();
        driver.findElement(By.xpath("//a[text()=30]")).click();
       // driver.findElement(By.id("autosuggest")).sendKeys("ind");
       // driver.findElement(By.id("ui-id-85")).click();
        
	}

}