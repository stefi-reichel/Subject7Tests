package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginFBRecipeLikePage extends Base {

    //Catching elements
    private final By likeButton = By.id("like");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By gotItbutton = MobileBy.AccessibilityId("Got it");
    private final By discoverTab = MobileBy.AccessibilityId("Discover");
    private final By profileName = MobileBy.AccessibilityId("Stefi");


    //Actions

    //Like recipe
    public Boolean verifyLikeButtonIsPresent() {
        return driver.findElement(likeButton).isDisplayed();
    }

    public void tapLikeButton() {
        driver.findElement(likeButton).click();
        System.out.println("Tapped Like button");
    }


    //Login with fb
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

    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public void tapGotItButton() {
        driver.findElement(gotItbutton).click();
        System.out.println("Tapped Got It!");
    }

    public void tapDiscoverTab() {
        driver.findElement(discoverTab).click();
        System.out.println("Tapped Discover tab");
    }

    public Boolean verifyProfileName() {
        return driver.findElement(profileName).isDisplayed();
    }
}
