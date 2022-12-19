package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_a_file {
	public static void main(String[] args) {
		System.out.println("Hello nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://demoqa.com/upload-download");
		
//		for open file manager on given page
//		WebElement el = cd.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
//		Actions ac = new Actions(cd);
//        ac.moveToElement(el).click().perform();
		
//		for send file directly by file path :
		cd.findElement(By.xpath("//*[@id=\"uploadFile\"]")).sendKeys("D:\\vikrant university.docx");
		
	}
}
