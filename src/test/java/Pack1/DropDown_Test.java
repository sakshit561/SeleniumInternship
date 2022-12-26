package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	WebElement el =	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select Dd =  new Select(el);
	//Dd.selectByIndex(2);
	Dd.selectByVisibleText("USD");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	for(int i=1;i<=5;i++) {
	driver.findElement(By.id("hrefIncAdt")).click();
	
	 }
	driver.findElement(By.id("btnclosepaxoption")).click();
     Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	driver.findElement(By.xpath("//a[@value= 'GWL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[1]/a")).click();
	driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()=29]")).click();
	driver.findElement(By.id("autosuggest")).sendKeys("India");
	driver.findElement(By.id("ui-id-126")).click();
	
	}

}
