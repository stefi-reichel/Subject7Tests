package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginFBSettingsPage extends Base {

    //Catching elements
    private final By settingsButton = By.id("settings");
    private final By logInButtonOnSettings = MobileBy.AccessibilityId("Log In");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By profileName = MobileBy.AccessibilityId("Stefi");
    private final By signOutButtonOnSettings = MobileBy.AccessibilityId("Sign Out");
    private final By doneButton = By.xpath("//XCUIElementTypeButton[@name='Done']");


    //Actions

    //Going to Settings
    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public void tapSettingsButton(){
        driver.findElement(settingsButton).click();
        System.out.println("Tapped Settings button");
    }


    //Scrolling down Settings
    public void scroll1() {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(193, 539)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(193, -350)).release().perform();
    }

    public void scroll2() {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(193, 539)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(193, -700)).release().perform();
    }

    public void scroll3() {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(193, 539)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(193, -1000)).release().perform();
    }

    public void scroll4() {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(193, 539)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(193, -1200)).release().perform();
    }


    //Login with FB
    public Boolean verifyLogInButtonIsPresent() {
        return driver.findElement(logInButtonOnSettings).isDisplayed();
    }

    public void tapLogInButton(){
        driver.findElement(logInButtonOnSettings).click();
        System.out.println("Tapped Login button on Settings");
    }

    public Boolean verifyFbButtonIsPresentOnTasty() {
        return driver.findElement(fbButton).isDisplayed();
    }

    public void tapFBButtonOnTasty() {
        driver.findElement(fbButton).click();
        System.out.println("Tapped FB button");
    }

    public void tapContinueButtonOnModalOnTasty() {
        driver.findElement(continueToFBModalButton).click();
        System.out.println("Tapped Continue button");
    }

    public void tapContinueOnFB() {
        driver.findElement(continueButtonOnFB).click();
        System.out.println("Tapped Continue button on FB Web Site");
    }

    public void tapDoneButton(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='Done']")));
        driver.findElement(doneButton).click();
        System.out.println("Tapped Done button");
    }

    public Boolean verifyProfileName() {
        return driver.findElement(profileName).isDisplayed();
    }

    public Boolean verifySignOutButtonIsPresent() {
        return driver.findElement(signOutButtonOnSettings).isDisplayed();
    }
}
