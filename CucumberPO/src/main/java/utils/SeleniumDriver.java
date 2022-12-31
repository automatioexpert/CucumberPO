package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	// init webdriver

	private static WebDriver driver;
	private static WebDriverWait wait;
	//private final static Duration TIME_OUT = 10;
	private final static int PAGE_LOAD_TIME_OUT = 50;

	private SeleniumDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {

		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}

		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}

}
