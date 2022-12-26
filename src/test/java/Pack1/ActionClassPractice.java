package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Charan");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(10));
		driver.get("https://www.amazon.in/s?k=amazon+sign&i=electronics&adgrpid=59527504272&ext_vrnc=hi&gclid=CjwKCAiAhqCdBhB0EiwAH8M_Gn0ZHalGCffZWlO4V1FfydbYhnAD-ALjfX3pyJ6EcYd5_XaM-Uu58BoCfLIQAvD_BwE&hvadid=596980891918&hvdev=c&hvlocphy=9301385&hvnetw=g&hvqmt=b&hvrand=5000874219511651896&hvtargid=kwd-365111317397&hydadcr=19941_2255885&tag=googinhydr1-21&ref=pd_sl_43b97jzn5c_b");
		 WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		 Actions a =new Actions(driver);
		 a.moveToElement(move).perform();
		 a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox")))
		 .click().keyDown(Keys.SHIFT).sendKeys("fan").keyDown(Keys.ENTER).build().perform();
		 a.moveToElement(move).contextClick().perform();
	
	}

}
