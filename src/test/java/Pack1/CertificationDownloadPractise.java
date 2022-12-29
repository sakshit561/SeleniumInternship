package Pack1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CertificationDownloadPractise {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

ChromeOptions option=new ChromeOptions();
option.setAcceptInsecureCerts(true);

WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();

driver.get("https://www.karvy.com/");
System.out.println(driver.getTitle());



}


}