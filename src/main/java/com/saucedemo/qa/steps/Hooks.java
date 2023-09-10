package com.saucedemo.qa.steps;

import static com.saucedemo.qa.steps.utils.Environment.getHubUrl;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hooks {

  private World world;

  @Inject
  public Hooks(World world) {
    this.world = world;
  }

  @Before
  public void setup(Scenario scenario) throws MalformedURLException {
    ChromeOptions chromeOptions = new ChromeOptions();
    world.setDriver(new RemoteWebDriver(new URL(getHubUrl()),  chromeOptions));
    world.setScenario(scenario);
  }

  @After
  public void tearDown() {
    world.getDriver().quit();
  }

  @AfterStep
  public void takeScreenshot(){
    final byte [] screenshot = ((TakesScreenshot) world.getDriver()).getScreenshotAs(OutputType.BYTES);
            world.getScenario().attach(screenshot, "image/png", world.getScenario().getName());
  }
}
