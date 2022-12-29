package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		
		System.out.println("Reshu");
		WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://www.google.com/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	 	//FileUtils.copyFile(screenshotFile , new File("C:\\Users\\reshu\\eclipse-workspace\\Screenshot.png"));
	    FileUtils.copyFile(screenshotFile, new File("C:\\Users\\reshu\\eclipse-workspace\\Screenshot.png"));   
	}

}
