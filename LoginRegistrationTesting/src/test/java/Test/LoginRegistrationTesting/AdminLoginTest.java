package Test.LoginRegistrationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/admin-login";

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Phase5\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-admin-login/html/body/form/div/div/div[2]/div[1]/div[1]/div/input")).sendKeys("admin_2@gmail.com");
		webdriver.findElement(By.xpath("/html/body/app-root/div/app-admin-login/html/body/form/div/div/div[2]/div[1]/div[2]/div/input")).sendKeys("admin_02");
		webdriver.findElement(By.id("login")).click();

		System.out.println("search tested successfully");
	}

}