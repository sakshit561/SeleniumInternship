package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		String text="ind";
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::butoon[2]")).getText());
		//Ststic Dropdown
		WebElement el = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(el);
       dropdown.selectByIndex(3);
      
       
       //dropdown.selectByVisibleText("USD");
       //Ubdated Dropdown
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       for(int i = 1;i <= 5; i++) {
       driver.findElement(By.id("hrefIncAdt")).click();
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
       
       //Dynamic Dropdown
       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='GWL']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    driver.findElement(By.id("autosuggest")).sendKeys(text);
	    Thread.sleep(2000);
	    
	}
}
