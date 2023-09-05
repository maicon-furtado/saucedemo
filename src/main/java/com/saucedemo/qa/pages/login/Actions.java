package com.saucedemo.qa.pages.login;

import com.saucedemo.qa.World;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.saucedemo.qa.pages.login.Locators.*;
import static com.saucedemo.qa.utils.Wait.getWait;

public class Actions {
  Locators locators = new Locators();
  World world;

  public Actions(World world) {
    PageFactory.initElements(world.getDriver(), locators);
    this.world = world;
  }

  public void expectToBeInLoginPage() {
    getWait(world.getDriver()).until(ExpectedConditions.urlToBe("https://www.saucedemo.com/"));
  }

  public void expectToBeInHomePage() {
    getWait(world.getDriver()).until(ExpectedConditions.urlContains("/inventory.html"));
    getWait(world.getDriver()).until(ExpectedConditions.visibilityOf(locators.label_swag_lab));
    getWait(world.getDriver()).until(ExpectedConditions.visibilityOf(locators.label_products));
  }

  public void loginAsRegularUser() {
    locators.input_user.sendKeys(STANDARD_USER);
    locators.input_password.sendKeys(STANDARD_USER_PASSWORD);
    locators.button_login.click();
  }

}
