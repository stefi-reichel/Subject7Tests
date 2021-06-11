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

public class LogOutPage extends Base {

    //Catching elements
    private final By settingsButton = MobileBy.id("settings");
    private final By doneButton = By.xpath("//XCUIElementTypeButton[@name='Done']");
    private final By signOutButtonOnSettings = MobileBy.AccessibilityId("Sign Out");
    private final By signOutButtonOnModal = By.xpath("//XCUIElementTypeButton[@name='Sign Out']");
    private final By notLoggedInMessage = MobileBy.AccessibilityId("Log in or create an account to save your favorite recipes");



    //Actions

    //Going to Settings and Scrolling down
    public void tapSettingsButton(){
        driver.findElement(settingsButton).click();
        System.out.println("Tapped Settings button");
    }

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


    //Tapping Sign Out button
    public void tapSignOutSettingsButton(){
        driver.findElement(signOutButtonOnSettings).click();
        System.out.println("Tapped Sign Out button on Settings");
    }

    public void tapSignOutModalButton(){
        driver.findElement(signOutButtonOnModal).click();
        System.out.println("Tapped Sign Out button on confirmation modal");
    }

    public void tapDoneButton(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='Done']")));
        driver.findElement(doneButton).click();
        System.out.println("Tapped Done button");
    }

    public Boolean verifyNotLoggedInMessageIsPresent() {
        return driver.findElement(notLoggedInMessage).isDisplayed();
    }
}
