package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v105.runtime.model.WebDriverValue;

import io.github.bonigarcia.wdm.WebDriverManager;




public class SeleniumIntrduction {

	
	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
//	 
//
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");
		driver.get("https://slack.com/intl/en-in");
		driver.manage().window().maximize();
//	
	   driver.findElement(By.xpath("/html/body/header/nav[1]/div/nav/div[3]/a[1]")).click();
	   driver.findElement(By.id("signup_email")).sendKeys("reshu1@gmail.com");
	   driver.close();

	}

}

