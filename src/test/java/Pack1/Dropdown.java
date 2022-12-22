package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
	     System.out.println("Hello Charan");
	     System.setProperty("wevdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    // String =
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      WebElement el = driver.findElement((By.id("ctl00_mainContent_DropDownListCurrency")));
	     Thread.sleep(2000);
	     Select dropdown = new Select(el);
	     dropdown.selectByIndex(2);
	     //dropdown.selectByVisibleText("");
	    driver.findElement(By.id("divpaxinfo")).click();
	     for(int i=1;i<=5;i++) {
	    driver.findElement(By.id("hrefIncAdt")).click();
	   }
	   driver.findElement(By.id("btnclosepaxoption"));
	     //dropdwon
	    driver.findElement(By.id(""));
	}

}
