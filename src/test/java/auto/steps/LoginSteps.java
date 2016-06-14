package auto.steps;

import auto.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginPage loginPage;

	@Step
	public void go_to_page() {
		loginPage.open();
	}

	@Step
	public void enter_invalid_email_valid_pass(String email, String pass) {
		loginPage.enter_invalid_email_valid_pass(email, pass);
	}

	@Step
	public void click_submit() {
		loginPage.click_submit();
	}

	@Step
	public String getMsg() {
		return loginPage.getMsg();
	}

	@Step
	public void enter_valid_email_valid_pass(String email, String pass) {
		loginPage.enter_valid_email_valid_pass(email, pass);
	}

	@Step
	public String getTitle() {
		return loginPage.getTitle();
	}

}
