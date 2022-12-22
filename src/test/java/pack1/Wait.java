package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.out.println("Hellow shubham");
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (4)2\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
//		WebDriverWait w= new WebDriverWait(d, null );
		//driver.findElement(By.xpath("//input[@class='promocode']")).sendKeys("abc");

		d.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();

		d.findElement(By.cssSelector("img[alt='Cart']")).click();

		d.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abc");

		d.findElement(By.cssSelector("button[class='promoBtn']")).click();

		d.findElement(By.xpath("//button[text()='Place Order']")).click();

		Thread.sleep(2000);

		WebElement el=d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));

		Select dropdown = new Select(el);

		dropdown.selectByVisibleText("India");

		d.findElement(By.xpath("//input[@class='chkAgree']")).click();

		d.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}

}
