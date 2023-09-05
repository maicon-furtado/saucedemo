package com.saucedemo.qa;

import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.RemoteWebDriver;

@ScenarioScoped
public class World {

  private RemoteWebDriver driver;
  private Scenario scenario;

  public RemoteWebDriver getDriver() {
    return driver;
  }

  public void setDriver(RemoteWebDriver driver) {
    this.driver = driver;
  }

  public Scenario getScenario() {
    return scenario;
  }

  public void setScenario(Scenario scenario) {
    this.scenario = scenario;
  }
}