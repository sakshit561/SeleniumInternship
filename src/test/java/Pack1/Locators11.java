package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//String dynamicpass=getPassword(driver);
				driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("raj15@gmail.com");
				driver.findElement(By.name("inputPassword")).sendKeys("cwd");
				driver.findElement(By.className("signInBtn")).click();
		        Thread.sleep(2000);
				System.out.println(driver.findElement(By.className("error")).getText());
				driver.findElement(By.id("inputUsername")).clear();
				driver.findElement(By.linkText("Forgot your password?")).click();
				driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("cwd");
				//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc123@gmail.com");
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("raj15@gmail.com");
				driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9876543210");
				Thread.sleep(3000);
				driver.findElement(By.className("reset-pwd-btn")).click();
				driver.findElement(By.className("go-to-login-btn")).click();
				driver.findElement(By.id("inputUsername")).clear();
				driver.findElement(By.id("inputUsername")).sendKeys("raj15@gmail.com");
				driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
				Thread.sleep(2000);
		        driver.findElement(By.id("chkboxTwo")).click();
		        driver.findElement(By.className("signInBtn")).click();
		        Thread.sleep(2000);
		        System.out.println(driver.findElement(By.tagName("p")).getText());
	       // String actualresult= driver.findElement(By.tagName("p")).getText();
	        //String expectedresult="You are successfully logged in.";
		        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			   driver.close();
	}

}
