package com.saucedemo.qa.steps.pages.products;

import static com.saucedemo.qa.steps.utils.Wait.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.saucedemo.qa.steps.World;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Actions {
  Locators locators = new Locators();
  World world;

  public Actions(World world) {
    PageFactory.initElements(world.getDriver(), locators);
    this.world = world;
  }
  public void expectToBeInProductsCataloguePage() {
    getWait(world.getDriver()).until(ExpectedConditions.urlContains("/inventory.html"));
  }

  public void checkAllProductsAreCorrectlyDisplayed() {
    for (WebElement webelement : locators.list_label_item_names) {
      assertNotNull(webelement.getText());
    }
    for (WebElement webelement : locators.list_image_items) {
      assertNotNull(webelement.getText());
    }
    for (WebElement webelement : locators.list_price_items) {
      assertNotNull(webelement.getText());
    }
    assertEquals(6, locators.list_label_item_names.size());
    assertEquals(6, locators.list_image_items.size());
    assertEquals(6, locators.list_price_items.size());
  }
}
