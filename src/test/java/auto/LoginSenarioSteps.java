package auto;

import auto.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class LoginSenarioSteps {
	
	@Steps
	LoginSteps loginSteps;
	
	@Given("^User go to page http://phbc\\.ais\\.vn/$")
	public void user_go_to_page_http_phbc_ais_vn() throws Throwable {
	    loginSteps.go_to_page();
	}

	@Given("^Enter invalid email is \"([^\"]*)\" and valid password is \"([^\"]*)\"$")
	public void enter_invalid_email_is_and_valid_password_is(String email, String pass) throws Throwable {
	    loginSteps.enter_invalid_email_valid_pass(email,pass);
	}

	@When("^User click submit button$")
	public void user_click_submit_button() throws Throwable {
		loginSteps.click_submit();
	}

	@Then("^page show message \"([^\"]*)\"$")
	public void page_show_message(String exp) throws Throwable {
	    Assert.assertEquals(loginSteps.getMsg(), exp);
	}

	@Given("^Enter valid email is \"([^\"]*)\" and valid password is \"([^\"]*)\"$")
	public void enter_valid_email_is_and_valid_password_is(String email, String pass) throws Throwable {
	    loginSteps.enter_valid_email_valid_pass(email,pass);
	}

	@Then("^direct to home page title \"([^\"]*)\"$")
	public void direct_to_home_page_title(String expTitle) throws Throwable {
	  Assert.assertEquals(loginSteps.getTitle(), expTitle);
	  System.out.println(loginSteps.getTitle());
	}


}
