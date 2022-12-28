package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationsDownloadPractice {
	public static void main(String[] args) {
		System.out.println("Hello Nivesh");
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		WebDriver cd = new ChromeDriver(op);
		cd.manage().window().maximize();
		cd.get("https://www.epired.badssl.com/");
		
		
	}
}
