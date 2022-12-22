package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPracticeOnSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Abhinav Agrawal");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-workspace\\SeleniumInternship\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize(); //window maximizing
		
		//Currency Selection
		WebElement e1 = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
    	//System.out.println(e1);
		Thread.sleep(2000);
        Select dropdown = new Select(e1);
    	Thread.sleep(2000);
       
    	// dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("USD");

        //updated dropdown -->  for choosing the seats of adults
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement e2 = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
    	Thread.sleep(2000);
        Select dropdown1 = new Select(e2);
    	Thread.sleep(2000);
       // dropdown.selectByIndex(3);
        dropdown1.selectByVisibleText("4");
        //dynamic dropdown--> for departure and arrival 

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();

        driver.findElement(By.xpath("//a[text()=28]")).click();
        driver.findElement(By.id("custom_date_picker_id_2")).click();
        driver.findElement(By.xpath("//a[text()=31]")).click();
        	
        //click on the checkbox
        Thread.sleep(2000);
        
        //ControlGroupSearchView_AvailabilitySearchInputSearchView_Student
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
        
        //click on the Search Button
        Thread.sleep(2000);
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();

	}

}