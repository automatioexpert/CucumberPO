package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);

	}

	public void login(String username, String password) {
		loginPageLocators.username_textBox.sendKeys(username);
		loginPageLocators.password_textBox.sendKeys(password);
		loginPageLocators.loginBtn.click();
		System.out.println("Login is Passed!!");
	}

}
