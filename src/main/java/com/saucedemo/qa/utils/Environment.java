package com.saucedemo.qa.utils;

public class Environment {
  private Environment() {
  }

  public static String getHubUrl() {
    String hubUrl = System.getenv("HUB_URL");
    if (hubUrl == null) {
      return "http://localhost:4444/wd/hub";
    }
    return hubUrl;
  }

  public static String getLandingPage() {
      return "https://www.saucedemo.com/";
  }
}
