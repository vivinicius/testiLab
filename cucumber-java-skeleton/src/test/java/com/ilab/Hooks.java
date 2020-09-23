package com.ilab;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.ilab.driver.DriverFactory.startDriver;
import static com.ilab.driver.DriverFactory.webdriver;

public class Hooks {

    @Before
    public void startSession(){
        startDriver();
        webdriver.get("https://www.google.com");
    }

    @AfterStep
    public void printStep(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "");
    }
}
