package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_webdriver_commonds {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.navigate().to("https://www.nopcommerce.com/en/demo");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//*[@id=\"ph-topic\"]/div[2]/div/div[1]/div[2]/div/div/a[1]/span")).click();

	}
}
