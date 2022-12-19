package Pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		        //invoking browser
				//ChromeDriver--> methods --> get,close
				//ChromeDriver driver=new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.get("http://www.adani.com/");

			}

		}


	
