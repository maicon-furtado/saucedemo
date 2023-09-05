package com.saucedemo.qa;

import static com.saucedemo.qa.utils.Environment.getHubUrl;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
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
    chromeOptions.setCapability(CapabilityType.VERSION, "83.0.4103.61");
    world.setDriver(new RemoteWebDriver(new URL(getHubUrl()),  chromeOptions));
    world.setScenario(scenario);
  }

  @After
  public void tearDown() {
    world.getScenario().attach(world.getDriver().getScreenshotAs(OutputType.BYTES),
        "image/png", "Final Screenshot");
    world.getDriver().quit();
  }
}
