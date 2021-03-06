package Java.pageObjects;

import org.openqa.selenium.WebDriver;

import Java.reusableFunations.ActionTypeList;
import Java.reusableFunations.LocatorsList;
import Java.reusableFunations.Log;
import Java.reusableFunations.UseWebElement;

public class LoginPage {

	private WebDriver driver;
	private UseWebElement useWebElements;
	static Log log = new Log(LoginPage.class.getName());

	String textbox_username_id = "Email";
	String testbox_password_id = "Password";
	String click_login_xpath = "//input[@class='button-1 login-button']";
	String click_logout_xpath = "//a[contains(text(),'Logout')]";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.useWebElements = new UseWebElement(this.driver);
	}

	public void enterUserName(String UserNameValue) {
		this.useWebElements.useWebElement(LocatorsList.Id, textbox_username_id, ActionTypeList.clear, null,
				"UserID test-box cleared");
		this.useWebElements.useWebElement(LocatorsList.Id, textbox_username_id, ActionTypeList.sendKeys, UserNameValue,
				"UserID entered");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterPassword(String PasswordValue) {
		this.useWebElements.useWebElement(LocatorsList.Id, testbox_password_id, ActionTypeList.clear, null,
				"Password test-box cleared");
		this.useWebElements.useWebElement(LocatorsList.Id, testbox_password_id, ActionTypeList.sendKeys, PasswordValue,
				"Password entered");
	}

	public void clickLogin() {
		this.useWebElements.useWebElement(LocatorsList.XPath, click_login_xpath, ActionTypeList.click, null,
				"Click on Login button");
	}

	public void clickLogout() {
		this.useWebElements.useWebElement(LocatorsList.XPath, click_logout_xpath, ActionTypeList.click, null,
				"Click on Logout button");
	}

}
