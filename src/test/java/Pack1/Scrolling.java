package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
  WebDriver driver =  new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  JavascriptExecutor js= (JavascriptExecutor)driver;
  js.executeScript("window.scrollBy(0,500)");
  Thread.sleep(3000);
  js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//   Sum of all Element
  List<WebElement>li=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
  int temp=0;
  for(int i=0;i<li.size();i++) {
  temp=temp+Integer.parseInt(li.get(i).getText());
 // int toInt = Integer.parseInt(value);
//   temp+=toInt;
  }
  System.out.print("Sum of all value in div= "+temp);
}

}
