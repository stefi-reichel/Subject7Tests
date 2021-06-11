package config.pages.login;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginFBOnboardingPage extends Base {

    //--------------------------------------------
    //PATH WITHOUT ADDING CREDENTIALS
    //--------------------------------------------
    //Catching elements
    private final By signInButton = MobileBy.AccessibilityId("Already have an account? Sign in");
    private final By fbButton = MobileBy.AccessibilityId("Sign in with Facebook");
    private final By continueToFBModalButton = MobileBy.AccessibilityId("Continue");
    private final By continueButtonOnFB = MobileBy.AccessibilityId("Continue");
    private final By meatButton = MobileBy.AccessibilityId("meat_eater");
    private final By allowButton = MobileBy.AccessibilityId("Allow");
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");
    private final By profileName = MobileBy.AccessibilityId("Stefi");


    //Actions

    //Sign in button on Onboarding
    public Boolean verifySignInButtonIsPresentOnTasty() {
        return driver.findElement(signInButton).isDisplayed();
    }

    public void tapSignInButtonOnTasty() {
        driver.findElement(signInButton).click();
        System.out.println("Tapped Sign In button");
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

    public Boolean verifyMeatButtonIsPresent() {
        return driver.findElement(meatButton).isDisplayed();
    }

    public void tapMeatButton() {
        driver.findElement(meatButton).click();
        System.out.println("Tapped Meat Button");
    }


    //Tapping Allow button
    public void tapAllowButton() {
        driver.findElement(allowButton).click();
        System.out.println("Tapped Allow Button");
    }

    public void tapMyRecipesTab() {
        driver.findElement(myRecipesTab).click();
        System.out.println("Tapped My Recipes tab");
    }

    public Boolean verifyProfileName() {
        return driver.findElement(profileName).isDisplayed();
    }


    //--------------------------------------------
    //PATH ADDING CREDENTIALS
    //--------------------------------------------
    //Catching elements
    private final By userField = By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeTextField");
    private final By passField = By.xpath("//XCUIElementTypeOther[@name='main']/XCUIElementTypeSecureTextField");
    private final By logInButtonOnFB = By.xpath("//XCUIElementTypeButton[@name='Log In']");

    //Actions
    public void tapUserFieldOnFB() {
        driver.findElement(userField).click();
        System.out.println("Tapped User field on FB Web Site");
    }

    public void sendUserDataOnFB(String userData) {
        driver.findElement(userField).sendKeys(userData);
        System.out.println("Sent user data");
    }

    public void tapPassFieldOnFB() {
        driver.findElement(passField).click();
        System.out.println("Tapped Password field on FB Web Site");
    }

    public void sendPassDataOnFB(String passData) {
        driver.findElement(passField).sendKeys(passData);
        System.out.println("Sent pass data");
    }

    public void tapLoginButtonOnFB() {
        driver.findElement(logInButtonOnFB).click();
        System.out.println("Tapped Login button on FB Web Site");
    }
}