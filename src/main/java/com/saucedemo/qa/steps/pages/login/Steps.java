package com.saucedemo.qa.steps.pages.login;

import com.google.inject.Inject;
import com.saucedemo.qa.steps.World;
import com.saucedemo.qa.steps.utils.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
      world.getDriver().get(Environment.getLandingPage());
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
