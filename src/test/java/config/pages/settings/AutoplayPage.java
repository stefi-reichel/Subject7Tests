package config.pages.settings;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AutoplayPage extends Base {

    // catching elements
    private final By autoplaySectionNever = MobileBy.AccessibilityId("Autoplay Videos, Never");

    private final By autoplayNever = MobileBy.AccessibilityId("Never");

    private final By autoplaySectionAlways = MobileBy.AccessibilityId("Autoplay Videos, Always");

    private final By autoplayAlways = MobileBy.AccessibilityId("Always");

    private final By autoplaySectionWiFi = MobileBy.AccessibilityId("Autoplay Videos, On Wi-Fi Only");

    private final By autoplayWiFi = MobileBy.AccessibilityId("On Wi-Fi Only");

    private final By autoplayVideosHeader = MobileBy.AccessibilityId("Autoplay Videos");

    private final By settingsBackButton = MobileBy.AccessibilityId("Settings");

    //For asserts
    public boolean autoplaySectionNeverIsPresent(){ return driver.findElement(autoplaySectionNever).isDisplayed(); }

    public boolean autoplaySectionAlwaysIsPresent(){ return driver.findElement(autoplaySectionAlways).isDisplayed(); }

    public boolean autoplayAlwaysOptionIsPresent(){ return driver.findElement(autoplayAlways).isDisplayed(); }

    public boolean autoplayVideosHeaderIsPresent(){ return driver.findElement(autoplayVideosHeader).isDisplayed(); }

    public boolean autoplayOptionWiFiIsPresent(){ return driver.findElement(autoplayWiFi).isDisplayed(); }

    public boolean autoplaySectionWiFiIsPresent(){ return driver.findElement(autoplaySectionWiFi).isDisplayed(); }

    //Actions
    public void tapAutoplaySectionNever() {
        driver.findElement(autoplaySectionNever).click();
        System.out.println("Tapped Autoplay section (never)");
    }

    public void tapAutoplayNeverOption() {
        driver.findElement(autoplayNever).click();
        System.out.println("Selected Never in Autoplay section");
    }

    public void tapAutoplaySectionAlways() {
        driver.findElement(autoplaySectionAlways).click();
        System.out.println("Tapped Autoplay section (Always)");
    }

    public void tapAutoplayAlwaysOption() {
        driver.findElement(autoplayAlways).click();
        System.out.println("Selected Always in Autoplay section");
    }

    public void tapAutoplaySectionWiFi() {
        driver.findElement(autoplaySectionWiFi).click();
        System.out.println("Tapped Autoplay section (Wi-Fi)");
    }

    public void tapAutoplayWiFiOption() {
        driver.findElement(autoplayWiFi).click();
        System.out.println("Selected On Wi-Fi Only in Autoplay section");
    }

    public void tapSettingsBackButton() {
        driver.findElement(settingsBackButton).click();
        System.out.println("Tapped back button");
    }
}