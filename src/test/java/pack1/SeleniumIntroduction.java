package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

public static void main(String[] args) {

//invoking Browser
//ChromeDriver - Method (get , close)

//ChromeDriver driver = new ChromeDriver();

//or we can create this way also
//ChromeDriver driver =  new ChromeDriver();

System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (4)2\\chromedriver.exe");
WebDriver driver =  new ChromeDriver();

driver.get("https://www.w3schools.com/");
}

}