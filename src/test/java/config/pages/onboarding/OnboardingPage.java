package config.pages.onboarding;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class OnboardingPage extends Base {

    //Catching elements
    private final By getStartedButton = MobileBy.AccessibilityId("Get started");

    private final By meatButton = MobileBy.AccessibilityId("Nope, show me all recipes");

    private final By vegButton = MobileBy.AccessibilityId("Yes, hide recipes with meat");

    private final By allowButton = MobileBy.AccessibilityId("Allow");

    //for asserts
    public boolean getStartedButtonIsPresent(){ return driver.findElement(getStartedButton).isDisplayed(); }

    public boolean meatButtonIsPresent(){ return driver.findElement(meatButton).isDisplayed(); }

    public boolean vegButtonIsPresent(){ return driver.findElement(vegButton).isDisplayed(); }

    public boolean allowButtonIsPresent(){ return driver.findElement(allowButton).isDisplayed(); }

    //Actions
    public void tapGetStarted() {
        waitForGetStartedButton();
        driver.findElement(getStartedButton).click();
        System.out.println("Tapped Get Started Button");
    }

    public void tapMeatButton() {
        waitForMeatButton();
        driver.findElement(meatButton).click();
        System.out.println("Tapped Meat Button");
    }

    public void tapVegButton() {
        waitForVegButton();
        driver.findElement(vegButton).click();
        System.out.println("Tapped Veggie Button");
    }

    public void tapAllowNotiButton() {
        driver.findElement(allowButton).click();
        System.out.println("Tapped Allow Button");
    }

    public void onboarding(){
        waitForGetStartedButton();
        driver.findElement(getStartedButton).click();
        System.out.println("Tapped Get Started Button");
        waitForMeatButton();
        driver.findElement(meatButton).click();
        System.out.println("Tapped Meat Button");
        driver.findElement(allowButton).click();
        System.out.println("Tapped Allow Button");
    }

    //Waiters
    WebDriverWait wait = new WebDriverWait(driver,40);

    public void waitForGetStartedButton() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(getStartedButton)));
    }

    public void waitForMeatButton() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(meatButton)));
    }

    public void waitForVegButton() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(vegButton)));
    }
}