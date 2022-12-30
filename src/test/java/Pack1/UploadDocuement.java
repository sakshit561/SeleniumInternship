package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/upload-download");
		d.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\mdim3\\OneDrive\\Desktop\\Resume\\VickyResume.pdf");

	}

}
