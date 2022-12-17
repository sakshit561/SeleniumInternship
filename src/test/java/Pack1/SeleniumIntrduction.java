package Pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		//winvoking Browser
		//ChromeDriver - Method (get , close)

		//ChromeDriver driver = new ChromeDriver();

		//or we can create this way also
		WebDriver driver =  new ChromeDriver();

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver.get("https://www.w3schools.com/");
	}

}
