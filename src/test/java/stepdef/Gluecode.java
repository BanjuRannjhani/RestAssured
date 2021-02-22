package stepdef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import Selenium.RestAssured.AppTest;

public class Gluecode {
	
	AppTest apptest = new AppTest();

	@When("^I call the api with POST https request \"([^\"]*)\" and validate status OK$")
	public void i_call_the_api_with_post_https_request(String condition) throws Exception {
		apptest.postmethod(condition);
	}

	
}
