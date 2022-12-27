package Pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v105.runtime.model.WebDriverValue;

//import io.github.bonigarcia.wdm.WebDriverManager;




public class SeleniumIntrduction {

	


	public static void main(String[] args) {
<<<<<<< HEAD
		        //invoking browser
				//ChromeDriver--> methods --> get,close
				//ChromeDriver driver=new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.get("http://www.adani.com/");
=======
		// TODO Auto-generated method stub
       //WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver\\chrome driver.exe");
		driver.get("https://slack.com/intl/en-in");
		driver.manage().window().maximize();
	
	   driver.findElement(By.xpath("/html/body/header/nav[1]/div/nav/div[3]/a[1]")).click();
	   driver.findElement(By.id("signup_email")).sendKeys("reshu1@gmail.com");
	   driver.close();
>>>>>>> dcc9aad6d6dc9166a7a973c16b79305ee4bf3a52

			}

<<<<<<< HEAD
		}


	
=======
}

>>>>>>> dcc9aad6d6dc9166a7a973c16b79305ee4bf3a52
