package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String text = "ind";
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		WebElement el = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
        Select o = new Select(el);
        Thread.sleep(2000);
        o.selectByIndex(3);
     
        
       o.selectByVisibleText("AED");
        d.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1; i<=5; i++) {
        	d.findElement(By.id("hrefIncAdt")).click();
        	//d.findElement(By.id("btnclosepaxoption")).click();
        }
        //dynamic dropdowns
        //Thread.sleep(2000);
        d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
       // d.findElement(By.id("autosuggest")).sendKeys(text);
        Thread.sleep(2000);
      // d.findElement(By.className("ui-datepicker-trigger")).click();
       //Thread.sleep(2000);
       d.findElement(By.xpath("//a[text()=25]")).click();
       Thread.sleep(2000);
       d.findElement(By.id("ctl00_mainContent_view_date2")).click();
       d.findElement(By.xpath("(//a[text()=29])[2]")).click();
        }
	}


