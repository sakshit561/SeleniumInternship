package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Traverse {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello sagar");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

		WebDriver d = new ChromeDriver(option);
		d.manage().window().maximize();
		d.get("https://www.spicejet.com/");
	
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("css-76zvg2 r-cqee49 r-ubezar r-1kfrs79")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//*[@id=\\\"main-container\\\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[6]/div/div")).click();
      d.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
      for(int i = 0 ; i <5 ; i++) {
    	  d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
			if(i>2) {
				d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			}
		}
      
    
	
	
		

	}

}
