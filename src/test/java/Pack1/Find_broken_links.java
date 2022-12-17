package Pack1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_broken_links {
	public static void main(String[] args) {
		System.out.println("hello nivesh");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
//		for adding wait
		cd.get("http://www.deadlinkcity.com/");
		List<WebElement> el = cd.findElements(By.tagName("a"));
		System.out.println("total links on page :" + el.size());
		int temp2 = 0;
		int temp = 0 ;
		for(WebElement el2 : el) {
			String s =el2.getAttribute("href");
			
			try {
				URL u =new URL(s);
				HttpURLConnection huc =(HttpURLConnection)u.openConnection();
				huc.connect();
				temp = huc.getResponseCode();
				if(temp >=400)
					System.out.println(s +"  =  Broken link");
				temp2++;
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Total no. of broken links : " + temp2);
		cd.close();
	
	}
}
