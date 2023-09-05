package com.saucedemo.qa.pages.login;

import com.google.inject.Inject;
import com.saucedemo.qa.World;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.saucedemo.qa.utils.Environment.getLandingPage;

public class Steps {

  World world;
  Actions actions;

  @Inject
  public Steps(World world) {
    this.world = world;
    actions = new Actions(world);
  }

  @Given("I am in login page")
  public void i_am_in_login_page() {
      world.getDriver().get(getLandingPage());
      actions.expectToBeInLoginPage();
    //  world.getScenario().attach(world.getDriver().getScreenshotAs(OutputType.BYTES), "image/png", "First Page");
    }

  @When("I login as standard user")
  public void i_login_as_standard_user() {
    actions.loginAsRegularUser();
  }

  @Then("I expect to login successfully as standard user")
  public void i_expect_to_login_successfully_as_standard_user() {
    actions.expectToBeInHomePage();
  }

}
