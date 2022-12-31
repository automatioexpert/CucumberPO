package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.actions.LoginPageActions;

public class DemoLoginStep {

	public static WebDriver driver;

	LoginPageActions la = new LoginPageActions();

	@Before
	public void setUp() {
		System.out.println("user_launches_the_app");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("user launches the app")
	public void user_launches_the_app() {

		driver.get("https://www.saucedemo.com/");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input[name='login-button']")).click();
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		// driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		System.out.println("I am logged inside the app home page!!");
	}
}
