package Pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.junit.ArrayAsserts;

public class New_tab_or_new_window {
	public static void main(String[] args) {
		System.out.println("hello nivesh");
//		setting property for chrome driver :
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
//		launching google :
		cd.get("https://www.google.com/");
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
//		swich to new tab and open fb in it :
		cd.switchTo().newWindow(WindowType.TAB);
		cd.get("https://www.facebook.com/");
		System.out.println(cd.getTitle());
//		capture all window handles :
		Set<String> handles = cd.getWindowHandles();
		List<String> handles2 = new ArrayList<String>();
		handles2.addAll(handles);
//		closing fb tab :
		cd.close();
//		swich driver again on google handle 
		cd.switchTo().window(handles2.get(0));
		System.out.println(cd.getTitle());
		
	}
}
