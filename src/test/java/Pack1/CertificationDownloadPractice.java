package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationDownloadPractice {
	
	public static void main(String a[]) {
		//WebDriver driver =new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		WebDriver d= new ChromeDriver(option);
		d.get("https://www.epired.badssl.com/");
		System.out.println(d.getTitle());
	}

}
