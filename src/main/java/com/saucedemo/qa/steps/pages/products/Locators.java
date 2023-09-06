package com.saucedemo.qa.steps.pages.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Locators {

  @FindBy(how = How.XPATH, using = "//div[@class='inventory_item_name']")
  public List<WebElement> list_label_item_names;

  @FindBy(how = How.XPATH, using = "//img[@class='inventory_item_img']")
  public List<WebElement> list_image_items;

  @FindBy(how = How.XPATH, using = "//div[@class='inventory_item_price']")
  public List<WebElement> list_price_items;

}
