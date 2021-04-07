package config.pages.onboarding;

import config.pages.BasePage;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnboardingPage extends BasePage {

    //Catching elements
    @iOSXCUITFindBy(accessibility = "Get started")
    private IOSElement getStartedButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@name,'Nope, show me all recipes')] ")
    private IOSElement meatButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@name,'Yes, hide recipes with meat')] ")
    private IOSElement vegButton;

    @iOSXCUITFindBy(accessibility = "Allow")
    private IOSElement allowButton;

    //for asserts
    public boolean getStartedButtonIsPresent(){
        return getStartedButton.isDisplayed();
    }

    public boolean meatButtonIsPresent(){
        return meatButton.isDisplayed();
    }

    public boolean vegButtonIsPresent(){
        return vegButton.isDisplayed();
    }

    public boolean allowButtonIsPresent(){
        return allowButton.isDisplayed();
    }

    //Actions
    public void tapGetStarted() {
        getStartedButton.click();
        System.out.println("Tapped Get Started Button");
    }

    public void tapMeatButton() {
        meatButton.click();
        System.out.println("Tapped Meat Button");
    }

    public void tapVegButton() {
        vegButton.click();
        System.out.println("Tapped Veggie Button");
    }

    public void tapAllowNotiButton() {
        allowButton.click();
        System.out.println("Tapped Allow Button");
    }

    public void onboarding(){
        waitForGetStartedButton();
        getStartedButton.click();
        System.out.println("Tapped Get Started Button");
        waitForMeatButton();
        meatButton.click();
        System.out.println("Tapped Meat Button");
        allowButton.click();
        System.out.println("Tapped Allow Button");
    }

    //Waiters
    WebDriverWait wait = new WebDriverWait(driver,50);

    public void waitForGetStartedButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[contains(@name,'Get started')]")));
    }

    public void waitForMeatButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[contains(@name,'Nope, show me all recipes')]")));
    }

    public void waitForVegButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[contains(@name,'Nope, show me all recipes')]")));
    }
}