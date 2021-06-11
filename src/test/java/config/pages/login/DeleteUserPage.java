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

public class DeleteUserPage extends Base {

    //Catching elements
    private final By settingsButton = By.id("settings");
    private final By deleteUserButton = MobileBy.AccessibilityId("Delete User");
    private final By yesModalButton = MobileBy.AccessibilityId("Yes");
    private final By doneButton = By.xpath("//XCUIElementTypeButton[@name='Done']");
    private final By notLoggedInMessage = MobileBy.AccessibilityId("Log in or create an account to save your favorite recipes");


    //Actions

    //Go to settings
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


    //Verify and tap Delete button
    public Boolean verifyDeleteUserButtonIsPresent() {
        return driver.findElement(deleteUserButton).isDisplayed();
    }

    public void tapDeleteUserButton(){
        driver.findElement(deleteUserButton).click();
        System.out.println("Tapped Delete User button");
    }

    public void tapYesModalButton(){
        driver.findElement(yesModalButton).click();
        System.out.println("Tapped Yes Modal button");
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
