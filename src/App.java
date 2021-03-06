import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/ubuntu/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		System.out.println("Welcome to demo for selenium chrome webdriver");

		driver.get("http://13.127.2.212:8085/addressbook/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Vivarsh");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Devops");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@edureka.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/02/2020");
		driver.findElement(By.className("v-button-primary")).click();
		// Thread.sleep(5000);
		// driver.quit();
	}
}
