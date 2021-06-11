package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginFBMyRecipesPage extends Base {

    //Catching elements
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By profileName = MobileBy.AccessibilityId("Stefi");


    //Actions

    //Going to My Recipes
    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    //Login with FB
    public Boolean verifyFbButtonIsPresentOnTasty() {
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

    public Boolean verifyProfileName() {
        return driver.findElement(profileName).isDisplayed();
    }
}
