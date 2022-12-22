package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello yashodhan");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		WebElement el= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select dropdown=new Select(el);
		//dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("AED");
		
		//updated dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i=1; i<=5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}
		//dynamic dropdowns
        //Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
       // d.findElement(By.id("autosuggest")).sendKeys(text);
        Thread.sleep(2000);
      // d.findElement(By.className("ui-datepicker-trigger")).click();
       //Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()=25]")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
       driver.findElement(By.xpath("(//a[text()=29])[2]")).click();
        }
	}