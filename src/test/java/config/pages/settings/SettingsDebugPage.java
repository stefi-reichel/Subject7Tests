package config.pages.settings;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SettingsDebugPage extends Base {

    //Catching elements
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");

    private final By settingsButton = By.id("settings");

    private final By loadArticleButton = MobileBy.AccessibilityId("Load Article by ID");

    private final By loadRecipeButton = MobileBy.AccessibilityId("Load Recipe by ID");

    private final By articleIDField = By.xpath("//*[contains(@name,'Article ID')]");

    private final By recipeIDField = By.xpath("//*[contains(@name,'Canonical ID')]");

    private final By loadRecipe = By.id("Recipe");

    private final By okButton = MobileBy.AccessibilityId("OK");

    private final By experiments = MobileBy.AccessibilityId("ABeagle Experiments");

    private final By featureFlag = MobileBy.AccessibilityId("Feature Flags");

    private final By holidayElevationFlag = MobileBy.AccessibilityId("current_feature_page_tasty_7743");

    private final By enable = MobileBy.AccessibilityId("on");

    private final By backButton = MobileBy.AccessibilityId("Feature Flags");

    //Actions
    public void loadArticleID(String articleID) {
        driver.findElement(myRecipesTab).click();
        driver.findElement(settingsButton).click();
        driver.findElement(loadArticleButton).click();
        driver.findElement(articleIDField).sendKeys(articleID);
        driver.findElement(okButton).click();
    }

    public void loadRecipeIDFromSettings(String recipeID) {
        driver.findElement(loadRecipeButton).click();
        driver.findElement(recipeIDField).click();
        driver.findElement(recipeIDField).sendKeys(recipeID);
        driver.findElement(loadRecipe).click();
    }

    public void enableHolidayElevation() {
        driver.findElement(myRecipesTab).click();
        driver.findElement(settingsButton).click();
        driver.findElement(experiments).click();
        driver.findElement(featureFlag).click();
        driver.findElement(holidayElevationFlag).click();
        driver.findElement(enable).click();
        driver.findElement(backButton).click();
        driver.closeApp();
        driver.launchApp();
    }
}