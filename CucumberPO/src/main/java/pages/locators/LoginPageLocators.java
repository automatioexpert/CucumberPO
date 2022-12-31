package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

	@FindBy(how = How.CSS, using = "input#user-name")
	public WebElement username_textBox;

	@FindBy(how = How.CSS, using = "input#password")
	public WebElement password_textBox;

	@FindBy(how = How.XPATH, using = "//input[@name='login-button']")
	public WebElement loginBtn;

}
