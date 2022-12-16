package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://in.linkedin.com/?src=go-pa&trk=sem-ga_campid.14650114791_asid.127961666580_crid.545833659352_kw.linkedin_d.c_tid.kwd-285981853_n.g_mt.p_geo.9301385&mcid=6844056167778418688&cid=&gclid=EAIaIQobChMI6Z2Q2O_9-wIVwdCWCh2RjA59EAAYASAAEgK5UfD_BwE&gclsrc=aw.ds");
		cd.findElement(By.name("session_key")).sendKeys("7879577398");
		cd.findElement(By.name("session_password")).sendKeys("Niveshsharma@123");
		cd.findElement(By.className("sign-in-form__submit-button")).click();
	}

}
