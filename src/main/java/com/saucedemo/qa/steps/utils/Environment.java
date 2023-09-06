package com.saucedemo.qa.steps.utils;

public class Environment {
  private Environment() {
  }

  public static String getHubUrl() {
      return "http://localhost:4444/wd/hub";
  }

  public static String getLandingPage() {
      return "https://www.saucedemo.com/";
  }
}
