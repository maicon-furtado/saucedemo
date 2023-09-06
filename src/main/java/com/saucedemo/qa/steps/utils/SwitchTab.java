package com.saucedemo.qa.steps.utils;

import static com.saucedemo.qa.steps.utils.Wait.getWait;

import java.util.ArrayList;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SwitchTab {
  private SwitchTab() {
  }

  public static void switchTab(RemoteWebDriver driver) {
    getWait(driver).until(ExpectedConditions.numberOfWindowsToBe(2));
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
  }

}
