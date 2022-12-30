package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		System.out.println("Hello Nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String message=cd.findElement(By.tagName("p")).getText();
        System.out.println(message);
//	by sending username and password in url :
	
	}

}
