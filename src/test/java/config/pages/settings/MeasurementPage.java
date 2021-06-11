package config.pages.settings;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MeasurementPage extends Base {

    //Catching elements
    private final By measurementSystemUS = By.id("Measurement System, US only");

    private final By measurementSystemMetric = By.id("Measurement System, Metric + US");

    private final By USMeasurementInRecipe = MobileBy.AccessibilityId("2 ½ cups");

    private final By metricOption = MobileBy.AccessibilityId("Metric + US");

    private final By settingsBackButton = By.id("Settings");

    private final By MetricMeasurementInRecipe = MobileBy.AccessibilityId("600 mL (2 ½ cups)");

    private final By USOption = MobileBy.AccessibilityId("US only");

    //For asserts
    public boolean measurementSystemUSIsPresent(){ return driver.findElement(measurementSystemUS).isDisplayed(); }

    public boolean measurementSystemMetricIsPresent(){ return driver.findElement(measurementSystemMetric).isDisplayed(); }

    public boolean USMeasurementInRecipeIsPresent(){ return driver.findElement(USMeasurementInRecipe).isDisplayed(); }

    public boolean metricOptionIsPresent(){ return driver.findElement(metricOption).isDisplayed(); }

    public boolean MetricMeasurementInRecipeIsPresent(){ return driver.findElement(MetricMeasurementInRecipe).isDisplayed(); }

    //Actions
    public void tapMeasurementUSOption() {
        driver.findElement(measurementSystemUS).click();
        System.out.println("Tapped measurement option");
    }

    public void tapMetricOption() {
        driver.findElement(metricOption).click();
        System.out.println("Tapped metric option");
    }

    public void tapBackButton() {
        driver.findElement(settingsBackButton).click();
        System.out.println("Return to Settings");
    }

    public void tapMeasurementMetricOption() {
        driver.findElement(measurementSystemMetric).click();
        System.out.println("Tapped measurement option");
    }

    public void tapUSOption() {
        driver.findElement(USOption).click();
        System.out.println("Tapped US only option");
    }
}