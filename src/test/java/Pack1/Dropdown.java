package Pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     String text="ind";
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     WebElement el =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
     Select dropdown =new Select(el);
     
     dropdown.selectByIndex(2);
     driver.findElement(By.id("divpaxinfo")).click();
     Thread.sleep(2000);
     for(int i=1; i<=5;i++) {
    	 driver.findElement(By.id("hrefIncAdt")).click(); 
     }
     driver.findElement(By.id("btnclosepaxoption")).click();
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
     driver.findElement(By.xpath("(//a[@value='GOP'])")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
     driver.findElement(By.id("autosuggest")).sendKeys(text);
     Thread.sleep(2000);
	}

}
