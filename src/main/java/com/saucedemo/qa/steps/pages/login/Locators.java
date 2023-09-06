package com.saucedemo.qa.steps.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Locators {
  @FindBy(how = How.ID, using = "user-name")
  public WebElement input_user;

  @FindBy(how = How.ID, using = "password")
  public WebElement input_password;

  @FindBy(how = How.ID, using = "login-button")
  public WebElement button_login;

  @FindBy(how = How.CLASS_NAME, using = "app_logo")
  public WebElement label_swag_lab;

  @FindBy(how = How.CLASS_NAME, using = "title")
  public WebElement label_products;

  public static final String STANDARD_USER = "standard_user";
  public static final String STANDARD_USER_PASSWORD = "secret_sauce";
}
