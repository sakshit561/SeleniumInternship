package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebdriverCommands {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();//by using this method no need to set the path of the driver
WebDriver driver=new ChromeDriver();
driver.get("https://www.nopcommerce.com/en/demo");
driver.manage().window().maximize();//by using this method we will maximize the window

/* find the element by copying the xpath of particular element
go to inspect-copy-copyxpath then paste in below method*/

driver.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();;
//driver.close();// to close the home window
//driver.quit();// to close all the window which is running
System.out.println(driver.getTitle());

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");

driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin");

driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();


}

}
