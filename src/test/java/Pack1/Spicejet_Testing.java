package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet_Testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		driver.manage().window().maximize();
		WebElement el = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		Select Dropdown = new Select(el);
		Dropdown.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement ee = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
		Select dd = new Select(ee); 
		dd.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value = 'Departure City']")).click();
		driver.findElement(By.xpath("//a[@value = 'DED']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='IXL'])[2]")).click();
		driver.findElement(By.xpath("//a[text()=28]")).click();
		driver.findElement(By.id("custom_date_picker_id_2")).click();
		driver.findElement(By.xpath("//a[text()=2]")).click();

		

	}

}
