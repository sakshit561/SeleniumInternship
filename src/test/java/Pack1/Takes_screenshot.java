package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takes_screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver cd = new ChromeDriver();
		cd.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.6");
		cd.manage().window().maximize();
		TakesScreenshot sc = ((TakesScreenshot)cd);
		File fl = sc.getScreenshotAs(OutputType.FILE);
		File flonj = new File("C:\\Users\\nives\\OneDrive\\Desktop\\program\\myss.png");
		FileUtils.copyFile(fl, flonj);
		
	}
}
