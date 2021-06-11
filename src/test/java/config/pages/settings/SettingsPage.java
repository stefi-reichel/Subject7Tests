package config.pages.settings;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.HashMap;

public class SettingsPage extends Base {

    //Catching elements

    //CHANGE!!
    //private final By myRecipesTab = MobileBy.AccessibilityId("MY RECIPES");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");

    private final By settingsButton = By.id("settings");

    private final By settingsHeader = By.id("Settings");

    //CHANGE!!
    //private final By settingsSectionTitle = By.id("SETTINGS");
    private final By settingsSectionTitle = By.id("Settings");


    private final By vegetarianOption = By.id("Vegetarian");

    private final By notificationsOption = By.id("Notifications");

    private final By oneTopOption = By.id("Get the One Top App");

    private final By cancelOneTop = By.id("Cancel");

    //for asserts
    public boolean settingsButtonIsPresent(){ return driver.findElement(settingsButton).isDisplayed(); }

    public boolean settingsHeaderIsPresent(){ return driver.findElement(settingsHeader).isDisplayed(); }

    public boolean settingsSectionTitleIsPresent(){ return driver.findElement(settingsSectionTitle).isDisplayed(); }

    public boolean vegetarianOptionIsPresent(){ return driver.findElement(vegetarianOption).isDisplayed(); }

    public boolean notificationsOptionIsPresent(){ return driver.findElement(notificationsOption).isDisplayed(); }

    public boolean oneTopOptionIsPresent(){ return driver.findElement(oneTopOption).isDisplayed(); }

    //actions
    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public void tapSettingsButton() {
        driver.findElement(settingsButton).click();
        System.out.println("Tapped Settings Button");
    }

    public void tapVegetarianOption() {
        driver.findElement(vegetarianOption).click();
        System.out.println("Tapped Vegetarian option");
    }

    public void tapNotificationOption() {
        driver.findElement(vegetarianOption).click();
        System.out.println("Tapped notification option");
    }

    public void tapOneTopOption() {
        driver.findElement(oneTopOption).click();
        System.out.println("Tapped One Top option");
    }

    public void tapCancelOneTopButton() {
        driver.findElement(cancelOneTop).click();
        System.out.println("Returned to settings from One Top");
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        driver.executeScript("mobile: scroll",scrollObject);
    }

    public void scrollToBottom(){
        scroll();
        scroll();
    }
}