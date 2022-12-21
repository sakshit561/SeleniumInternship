package Pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tesing {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7476856766");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		
		

	}

}
