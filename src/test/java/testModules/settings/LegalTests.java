package testModules.settings;

import config.InitTest;
import config.pages.myRecipes.ActivityPage;
import config.pages.onboarding.OnboardingPage;
import config.pages.settings.LegalPage;
import config.pages.settings.SettingsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*continues from MeasurementsTests*/

public class LegalTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

/*    //only for testing purposes
    @BeforeClass
    public void onboardingProcess() {
        OnboardingPage onboarding = new OnboardingPage();
        SettingsPage settings = new SettingsPage();
        ActivityPage activity = new ActivityPage();
        onboarding.onboarding();
        settings.tapMyRecipesTab();
        activity.loginNewUser();
        settings.tapSettingsButton();
        System.out.println("------------------------------------------------------");
    }*/

    @Test (priority = 1)
    public void testFeedback(){
        LegalPage legal = new LegalPage();
        legal.scroll();
        legal.scrollToLegal();
        Assert.assertTrue(legal.feedbackSectionTitleIsPresent());
        print("Verified Feedback section title is present in Settings");
        Assert.assertTrue(legal.emailSupportIsPresent());
        print("Verified Email tasty support is present in Settings");
        print("------------------------------------------------------");
    }

    @Test(priority = 2)
    public void testLegalTitle(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.legalSectionTitleIsPresent());
        print("Verified Legal section title is present in Settings");
        print("------------------------------------------------------");
    }

    @Test(priority = 3)
    public void testUserAgreement(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.userAgreementIsPresent());
        print("Verified User agreement is present in Settings");
        legal.tapUserAgreement();
        Assert.assertTrue(legal.legalTitleIsPresent());
        print("Verified Legal at Buzzfeed title is present");
        legal.tapDoneButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 4)
    public void testPricacyPolicy(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.privacyPolicyIsPresent());
        print("Verified Privacy Policy is present in Settings");
        legal.tapPrivacyPolicy();
        Assert.assertTrue(legal.legalTitleIsPresent());
        print("Verified Legal at Buzzfeed title is present");
        legal.tapDoneButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 5)
    public void testAdChoices(){
        LegalPage legal = new LegalPage();
        legal.scroll1();
        Assert.assertTrue(legal.adChoicesIsPresent());
        print("Verified Ad Choices is present in Settings");
        legal.tapAdChoices();
        Assert.assertTrue(legal.buzzfeedTitleIssPresent());
        print("Verified buzzfeed title is present in ad choices");
        legal.tapDoneButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 6)
    public void testQuantcastPrivacyPolicy(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.quantcastPrivacyPolicyIsPresent());
        print("Verified Quantcast Privacy Policy is present in Settings");
        legal.tapQuantcastPrivacyPolicy();
        Assert.assertTrue(legal.quantcastPrivacyPolicyTitleIsPresent());
        print("Verified Privacy Policy title is present in Quantcast");
        legal.tapDoneButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 7)
    public void testQuantcastTracking(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.quantcastTrackingPolicyIsPresent());
        print("Verified Quantcast Privacy Policy is present in Settings");
        print("------------------------------------------------------");
    }

    @Test(priority = 8)
    public void testDownloadUserData(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.downloadUserDataIsPresent());
        print("Verified Download User Data is present in Settings");
        legal.tapDownloadUserData();
        Assert.assertTrue(legal.myUserDataIsPresent());
        print("Verified My User Data title is present");
        print("------------------------------------------------------");
    }

    @Test(priority = 9)
    public void testDownloadButton(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.downloadButtonIsPresent());
        print("Verified Download button is present");
        legal.tapDownloadButton();
        legal.closeShareSheet();
        legal.tapXButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 10)
    public void testNielsenRatings(){
        LegalPage legal = new LegalPage();
        Assert.assertTrue(legal.nielsenRatingsIsPresent());
        print("Verified Nielsen Ratings is present in Settings");
        legal.tapNielsenRatings();
        Assert.assertTrue(legal.aboutNielsenIsPresent());
        print("Verified About Nielsen Measurements is present");
        legal.tapDoneButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 11)
    public void deleteUser(){
        ActivityPage activity = new ActivityPage();
        activity.deleteUser();
        print("------------------------------------------------------");
    }
}