package Test.LoginRegistrationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PatientRegistrationTest {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/signUp";

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Phase5\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.id("id")).sendKeys("1");
		webdriver.findElement(By.id("email")).sendKeys("Akash@gmail.com");
		webdriver.findElement(By.id("password")).sendKeys("akash123");
		WebElement radio1 = webdriver.findElement(By.id("patientRole"));
		radio1.click();
		webdriver.findElement(By.id("signup")).click();

		System.out.println("search tested successfully");
	}

}