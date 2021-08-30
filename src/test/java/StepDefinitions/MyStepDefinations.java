package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyStepDefinations {

    @Given("^User is on internet banking landing page$")
    public void user_is_on_internet_banking_landing_page() {
        System.out.println("navigated to landing url");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)  {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("validated home page");

    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) {
        System.out.println(strArg1);

    }
}
