package Pack1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationsDownloadPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver d =  new ChromeDriver(option);
		d.manage().window().maximize();
		
		d.get("https://www.w3schools.com/");
		System.out.println(d.getTitle());

	}

}
