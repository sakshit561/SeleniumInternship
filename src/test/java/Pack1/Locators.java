package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("Yashodhan Agarwal");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("yashodhan189@gmail.com");
		//driver.findElement(By.cssSelector("input[type='text']: nth-child(2)")).sendKeys("7049555837");
		//driver.findElement(By.xpath("//input[@type= 'text'][3]")).sendKeys("7049555837");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("7049555837");
		//driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		//button[contains(@class,'submit')]
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//driver.close();
		}
	}

