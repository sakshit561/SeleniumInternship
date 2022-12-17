package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		
//		for linkedin web
		cd.get("https://in.linkedin.com/?src=go-pa&trk=sem-ga_campid.14650114791_asid.127961666580_crid.545833659352_kw.linkedin_d.c_tid.kwd-285981853_n.g_mt.p_geo.9301385&mcid=6844056167778418688&cid=&gclid=EAIaIQobChMI6Z2Q2O_9-wIVwdCWCh2RjA59EAAYASAAEgK5UfD_BwE&gclsrc=aw.ds");
		cd.findElement(By.name("session_key")).sendKeys("7879577398");
		cd.findElement(By.name("session_password")).sendKeys("Niveshsharma@123");
		cd.findElement(By.className("sign-in-form__submit-button")).click();
	
//for searching anything on google
//		cd.navigate().to("https://www.google.com/");
//		cd.manage().window().maximize();
//		WebElement e =cd.findElement(By.className("gLFyf"));
//		e.sendKeys("narendra modi");
//		e.submit();
		
		
//		for dealing with insta :
//		cd.navigate().to("https://www.instagram.com/");
//		cd.manage().window().maximize();
//		WebElement e2 = cd.findElement(By.className("_aa4b _add6 _ac4d"));
//		e2.sendKeys("___.antic.___");
		
//	for amazon sign-in and search beuty products 
//		cd.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiKjqnhoP77AhV9gksFHd2PBisYABAAGgJzZg&ei=NHScY6SSKP2iz7sPz8uh4As&ohost=www.google.com&cid=CAESa-D2MvIadc4UrNBKN2Nj7IvQqUj9yvW9hjxjq77l0u--tmxiaFmwSDuFMb2P9Y7vzbEzB0hquGdfyc2qDdMZ7Be3VmWv0FI9_0bAezDm1dQ60MKCSMcikIJ0up88cYzfDKU791VLj5haTwaZ&sig=AOD64_3RLU21m3r8go5wG0GEhik_caAvpw&q&sqi=2&adurl&ved=2ahUKEwik_KHhoP77AhV90XMBHc9lCLwQ0Qx6BAgIEAE");
//	    cd.manage().window().maximize();
//		WebElement e3 = cd.findElement(By.className("nav-line-1-container"));
//	    e3.click();
//	    cd.findElement(By.id("ap_email")).sendKeys("7879577398");
//	    cd.findElement(By.id("continue")).click();
//	    cd.findElement(By.name("password")).sendKeys("bharatmata");
//	    cd.findElement(By.id("signInSubmit")).click();
//	    cd.findElement(By.id("twotabsearchtextbox")).sendKeys("beuty products");
//	    cd.findElement(By.id("nav-search-submit-button")).click();

	    
	    
	
	}

}
