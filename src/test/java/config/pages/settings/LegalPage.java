package config.pages.settings;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.HashMap;

public class LegalPage extends Base {

    //Catching elements

    //CHANGE!!
    //private final By feedbackSectionTitle = By.id("FEEDBACK");
    private final By feedbackSectionTitle = By.id("Feedback");

    private final By emailSupport = By.id("Email Tasty support");

    //private final By legalSectionTitle = By.id("LEGAL");
    private final By legalSectionTitle = By.id("Legal");


    private final By userAgreement = By.id("BuzzFeed User Agreement");

    private final By privacyPolicy = By.id("BuzzFeed Privacy Policy");

    private final By legalTitle = By.id("LEGAL AT BUZZFEED");

    private final By adChoices = By.id("Ad Choices");

    private final By buzzfeedTitle = MobileBy.AccessibilityId("Homepage");

    private final By quantcastPrivacyPolicy = By.id("Quantcast Privacy Policy");

    private final By quantcastPrivacyPolicyTitle = By.id("Privacy Policy");

    private final By quantcastTracking = By.id("Quantcast Tracking");

    private final By nielsenRatings = By.id("Nielsen Ratings, Enabled");

    private final By aboutNielsen = By.id("ABOUT NIELSEN MEASUREMENT");

    private final By doneButton = By.id("Done");

    private final By downloadUserData = MobileBy.AccessibilityId("Download User Data");

    private final By myUserData = MobileBy.AccessibilityId("My User Data");

    private final By downloadButton = MobileBy.AccessibilityId("Download");

    private final By XButton = By.id("close");

    private final By closeShareSheet = MobileBy.AccessibilityId("Close");

    //For asserts
    public boolean feedbackSectionTitleIsPresent(){ return driver.findElement(feedbackSectionTitle).isDisplayed(); }

    public boolean emailSupportIsPresent(){ return driver.findElement(emailSupport).isDisplayed(); }

    public boolean legalSectionTitleIsPresent(){ return driver.findElement(legalSectionTitle).isDisplayed(); }

    public boolean userAgreementIsPresent(){ return driver.findElement(userAgreement).isDisplayed(); }

    public boolean privacyPolicyIsPresent(){ return driver.findElement(privacyPolicy).isDisplayed(); }

    public boolean legalTitleIsPresent(){ return driver.findElement(legalTitle).isDisplayed(); }

    public boolean adChoicesIsPresent(){ return driver.findElement(adChoices).isDisplayed(); }

    public boolean buzzfeedTitleIssPresent(){ return driver.findElement(buzzfeedTitle).isDisplayed(); }

    public boolean quantcastPrivacyPolicyIsPresent(){ return driver.findElement(quantcastPrivacyPolicy).isDisplayed(); }

    public boolean quantcastPrivacyPolicyTitleIsPresent(){ return driver.findElement(quantcastPrivacyPolicyTitle).isDisplayed(); }

    public boolean quantcastTrackingPolicyIsPresent(){ return driver.findElement(quantcastTracking).isDisplayed(); }

    public boolean nielsenRatingsIsPresent(){ return driver.findElement(nielsenRatings).isDisplayed(); }

    public boolean aboutNielsenIsPresent(){ return driver.findElement(aboutNielsen).isDisplayed(); }

    public boolean downloadUserDataIsPresent(){ return driver.findElement(downloadUserData).isDisplayed(); }

    public boolean myUserDataIsPresent(){ return driver.findElement(myUserData).isDisplayed(); }

    public boolean downloadButtonIsPresent(){ return driver.findElement(downloadButton).isDisplayed(); }

    //Actions
    public void tapUserAgreement() {
        driver.findElement(userAgreement).click();
        System.out.println("Tapped User Agreement button");
    }

    public void tapPrivacyPolicy() {
        driver.findElement(privacyPolicy).click();
        System.out.println("Tapped Privacy Policy");
    }

    public void tapAdChoices() {
        driver.findElement(adChoices).click();
        System.out.println("Tapped Ad Choices");
    }

    public void tapQuantcastPrivacyPolicy() {
        driver.findElement(quantcastPrivacyPolicy).click();
        System.out.println("Tapped Quantcast Privacy Policy");
    }

    public void tapNielsenRatings() {
        driver.findElement(nielsenRatings).click();
        System.out.println("Tapped Nielsen Ratings");
    }

    public void tapDoneButton() {
        driver.findElement(doneButton).click();
        System.out.println("Tapped Done button");
    }

    public void tapDownloadUserData() {
        driver.findElement(downloadUserData).click();
        System.out.println("Tapped Download User Data button");
    }

    public void tapDownloadButton() {
        driver.findElement(downloadButton).click();
        System.out.println("Tapped Download button");
    }

    public void closeShareSheet() {
        driver.findElement(closeShareSheet).click();
        System.out.println("Closed Share sheet");
    }

    public void tapXButton() {
        driver.findElement(XButton).click();
        System.out.println("Tapped X button");
    }

    //scrolls
    TouchAction action = new TouchAction(driver);
    Dimension size = driver.manage().window().getSize();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void scroll(){
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        driver.executeScript("mobile: scroll",scrollObject);
    }

    public void scroll1(){
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(startx, endy)).release().perform();
    }

    public void scrollToLegal(){
        scroll1();
        //scroll1(); ->CHANGE!!
    }
}