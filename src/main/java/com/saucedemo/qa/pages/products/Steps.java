package com.saucedemo.qa.pages.products;

import com.google.inject.Inject;
import com.saucedemo.qa.World;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

  World world;
  Actions actions;

  @Inject
  public Steps(World world) {
    this.world = world;
    actions = new Actions(world);
  }

  @Given("I am in products catalogue page")
  public void i_am_in_products_catalogue_page() {
    actions.expectToBeInProductsCataloguePage();
  }

  @Then("I check all products are correctly displayed")
  public void i_check_all_products_are_correctly_displayed() {
    actions.checkAllProductsAreCorrectlyDisplayed();
  }

}
