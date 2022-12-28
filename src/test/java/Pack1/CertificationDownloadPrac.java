package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationDownloadPrac {

public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver d = new ChromeDriver();
		//d.manage().window().maximize();
		//d.get("https://www.epired.badssl.com/");
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver d1 = new ChromeDriver(option);

		d1.get("https://www.karvy.com/");
	    System.out.print(d1.getTitle());
	}
}