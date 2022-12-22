package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Traversing {
	public static void main(String[] args) {
		System.out.println("hello yashodhan");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//header/div/button[1]/following-sibling::button[1]
		//Grandparent--Parent--Child--Siblings
		
		///header/div/button[1]/parent::div/button[2]/
		//GrandParent--Parent--child--Parent--Child
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
		
	}

}
