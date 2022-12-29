package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshort {

	public static void main(String[] args) throws IOException {
		System.out.println("Hellow Shubham"); 
		WebDriverManager.chromedriver().setup();
		    WebDriver driver =  new ChromeDriver();
		    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Users\\dell\\OneDrive\\Pictures\\Screenshots\\screenshot web\\screenshot.png"));
	}

}