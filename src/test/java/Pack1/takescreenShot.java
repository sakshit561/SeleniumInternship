package Pack1;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takescreenShot {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello Nivesh");
		WebDriverManager.chromedriver().setup();
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().deleteAllCookies();
		cd.get("https://www.google.com/");
		File scr=((TakesScreenshot)cd).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scr,new File("C:\\Users\\nives\\eclipse-workspace\\SeleniumInternship\\sreenshot.png"));
		FileUtils.copyFile(scr,new File("C:\\Users\\nives\\eclipse-workspace\\SeleniumInternship\\sreenshot.png"));

	}

}
