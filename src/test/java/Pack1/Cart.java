package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w= new WebDriverWait(d, null );
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		d.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		d.findElement(By.cssSelector("img[alt='Cart']")).click();
		
	d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	 Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input")).sendKeys("abcde");
	Thread.sleep(2000);
	d.findElement(By.cssSelector("button[class='promoBtn']")).click();
    Thread.sleep(2000);
    d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
    Thread.sleep(2000);
   // d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
    d.findElement(By.cssSelector("select[style$='width: 200px;']")).click();
    WebElement el = d.findElement(By.cssSelector("select[style$='width: 200px;']"));
	
    
   Select s = new Select(el);
	s.selectByVisibleText("India");
	Thread.sleep(2000);
	d.findElement(By.cssSelector("input[class$='chkAgree']")).click();
	d.findElement(By.xpath("//button[contains(.,'Proceed')]")).click();
	//d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input"));
	}

}
