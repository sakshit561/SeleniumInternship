package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerlink = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerlink.findElements(By.tagName("a")).size());
        
        WebElement firstsection =driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(firstsection.findElements(By.tagName("a")).size());
        for(int i=0;i<firstsection.findElements(By.tagName("a")).size();i++) {
        	String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	firstsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
        }
        WebElement secondsection =driver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
        System.out.println(  secondsection.findElements(By.tagName("a")).size());
        for(int i=0;i< secondsection.findElements(By.tagName("a")).size();i++) {
        	String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	 secondsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
        }
        WebElement thirdsection =driver.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
        System.out.println( thirdsection.findElements(By.tagName("a")).size());
        for(int i=0;i< thirdsection.findElements(By.tagName("a")).size();i++) {
        	String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	 thirdsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
        }
        WebElement fourthsection =driver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
        System.out.println(fourthsection.findElements(By.tagName("a")).size());
        for(int i=0;i<fourthsection.findElements(By.tagName("a")).size();i++) {
        	String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	fourthsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
        }
        
        }
	}


