package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class LoginFBRecipeIMadeThisPage extends Base {

    //Catching elements
    private final By iMadeThisButton = By.id("i_made_this");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By neverMindButton = MobileBy.AccessibilityId("Never mind");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By discoverTab = MobileBy.AccessibilityId("Discover");
    private final By profileName = MobileBy.AccessibilityId("Stefi");
    private final By backButton = By.xpath("//*[contains(@name,'Back')]");


    //Actions

    //Scrolling a recipe
    public void scroll() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.01);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);

        do {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        } while (iMadeThisButton == null);
    }

    public void scroll1() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.30);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);

        do {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        } while (iMadeThisButton == null);
    }

    //I made this!
    public Boolean verifyIMadeThisIsPresent() {
        return driver.findElement(iMadeThisButton).isDisplayed();
    }

    public void tapIMadeThis(){
        driver.findElement(iMadeThisButton).click();
        System.out.println("Tapped I Made This! button");
    }


    //Login with FB
    public Boolean verifyFBButtonIsPresent() {
        return driver.findElement(fbButton).isDisplayed();
    }

    public void tapFBButtonOnTasty() {
        driver.findElement(fbButton).click();
        System.out.println("Tapped FB button on Tasty");
    }

    public void tapContinueButtonOnModalOnTasty() {
        driver.findElement(continueToFBModalButton).click();
        System.out.println("Tapped Continue button on Tasty");
    }

    public void tapContinueOnFB() {
        driver.findElement(continueButtonOnFB).click();
        System.out.println("Tapped Continue button on FB Web Site");
    }

    public void tapNeverMindButton() {
        driver.findElement(neverMindButton).click();
        System.out.println("Tapped Never Mind button on Modal");
    }

    public void tapMyRecipes() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public void tapDiscoverTab() {
        driver.findElement(discoverTab).click();
        System.out.println("Tapped Discover tab");
    }

    public Boolean verifyProfileNameIsPresent() {
        return driver.findElement(profileName).isDisplayed();
    }

    public void tapBackButton() {
        driver.findElement(backButton).click();
        System.out.println("Tapped Back button ");
    }
}
