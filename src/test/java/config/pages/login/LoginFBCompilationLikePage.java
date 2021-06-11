package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class LoginFBCompilationLikePage extends Base {

    //Catching elements
    private final By likeButton = By.id("like");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By backButton = MobileBy.AccessibilityId("Back");
    private final By profileName = MobileBy.AccessibilityId("Stefi");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By childRecipe = By.xpath("(//XCUIElementTypeCell[@name='tasty_recipe_cell'])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private final By discoverTab = MobileBy.AccessibilityId("Discover");

    //Actions

    public void tapDiscoverTab() {
        driver.findElement(discoverTab).click();
        System.out.println("Tapped Discover tab");
    }

    public void tapBackButton() {
        driver.findElement(backButton).click();
        System.out.println("Tapped Like button");
    }

    //Like button on Compilation
    public Boolean verifyLikeButtonIsPresent() {
        return driver.findElement(likeButton).isDisplayed();
    }

    public void tapLikeButton() {
        driver.findElement(likeButton).click();
        System.out.println("Tapped Like button");
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
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public Boolean verifyProfileName() {
        return driver.findElement(profileName).isDisplayed();
    }
}



