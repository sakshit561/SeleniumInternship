package Pack1;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;


public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Downloads\\chromedriver.exe");
				WebDriver cd = new ChromeDriver();
				cd.manage().window().maximize();
				cd.get("https://demoqa.com/");
				Thread.sleep(1000);
				cd.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
//				cd.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")).click();
				Thread.sleep(2000);
				cd.findElement(By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2)")).click();
			}
		}

