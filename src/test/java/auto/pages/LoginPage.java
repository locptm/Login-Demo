package auto.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://phbc.ais.vn/")
public class LoginPage extends PageObject{


	@FindBy(id="Email")
	WebElement emailFeild;
	
	@FindBy(id="Password")
	WebElement passFeild;
	
	@FindBy(css="input.btn-login-new")
	WebElement clickBtn;
	
	@FindBy(css="div.validation-summary-errors > ul > li")
	WebElement Msg;

	public void enter_invalid_email_valid_pass(String email, String pass) {
		emailFeild.sendKeys(email);
		passFeild.sendKeys(pass);
	}

	public void click_submit() {
		clickBtn.click();
	}

	public String getMsg() {
		return Msg.getText();
	}

	public void enter_valid_email_valid_pass(String email, String pass) {
		emailFeild.sendKeys(email);
		passFeild.sendKeys(pass);
	}


	
}
