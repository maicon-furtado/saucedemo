package com.saucedemo.qa.utils;

import java.time.Duration;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Wait {

  private Wait() {
  }

  public static org.openqa.selenium.support.ui.Wait<RemoteWebDriver>
        getWait(RemoteWebDriver driver) {
    return new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofSeconds(2));
  }
}
