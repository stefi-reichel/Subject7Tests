package testModules.myRecipes;

import config.InitTest;
import config.dataProvider.LoginCredentialsDataProvider;
import config.pages.login.LoginFBOnboardingPage;
import config.pages.login.LoginFBSettingsPage;
import config.pages.myRecipes.ActivityPage;
import config.pages.onboarding.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActivityTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

    @BeforeClass
    public void onboardingProcess(){
        OnboardingPage onboarding = new OnboardingPage();
        onboarding.onboarding(); }

    @Test(enabled = false, dataProvider = "user", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginUserWCU(String data){
        ActivityPage activity = new ActivityPage();
        LoginFBSettingsPage login = new LoginFBSettingsPage();
        LoginFBOnboardingPage loginCredentials = new LoginFBOnboardingPage();

        activity.accessSettings();
        login.tapLogInButton();
        login.tapFBButtonOnTasty();
        login.tapContinueButtonOnModalOnTasty();
        loginCredentials.sendUserDataOnFB(data);
    }

    @Test(enabled = false, priority = 1, dataProvider = "pass", dataProviderClass = LoginCredentialsDataProvider.class)
    public void loginUserWCPAndDelete(String data){
        LoginFBOnboardingPage loginCredentials = new LoginFBOnboardingPage();
        ActivityPage activity = new ActivityPage();

        loginCredentials.sendPassDataOnFB(data);
        activity.hideKeyboard();
        loginCredentials.tapLoginButtonOnFB();
        loginCredentials.tapContinueOnFB();
        print ("Logged in from Settings");

        activity.deleteUser();
    }

    @Test(enabled = true, priority = 1)
    public void loginUserWOCAndDelete(){
        ActivityPage activity = new ActivityPage();
        LoginFBSettingsPage login = new LoginFBSettingsPage();
        activity.accessSettings();

        login.tapLogInButton();
        login.tapFBButtonOnTasty();
        login.tapContinueButtonOnModalOnTasty();
        login.tapContinueOnFB();
        print ("Logged in from Settings");

        activity.deleteUser();
    }

    @Test(priority = 2)
    public void testRecentlyViewed(){
        ActivityPage activity = new ActivityPage();
        activity.tapMyRecipesTab();
        activity.loginNewUser();
        activity.tapDiscoverTab();
        activity.searchForRecipeRV();
        activity.tapMyRecipesTab();

        Assert.assertTrue(activity.recentlyViewedIsPresent());
        print("Verified Recently Viewed title is present");

        Assert.assertTrue(activity.recipeTitleRVIsPresent());
        print("Verified Recipe is present in Recently Viewed");
        print("------------------------------------------------------");
    }

    @Test(priority = 3)
    public void testRecentlyPurchased(){
        ActivityPage activity = new ActivityPage();
        activity.tapDiscoverTab();
        activity.tapBackButton();
        activity.searchForRecipeRP();
        activity.addToBag();
        activity.tapMyRecipesTab();

        Assert.assertTrue(activity.recentlyPurchasedIsPresent());
        print("Verified Recently Purchased title is present");

        Assert.assertTrue(activity.recipeTitleRPIsPresent());
        print("Verified Recipe is present in Recently Purchased");
        print("------------------------------------------------------");
    }

    @Test(priority = 4)
    public void testWouldMakeAgain(){
        ActivityPage activity = new ActivityPage();
        activity.tapDiscoverTab();
        activity.tapBackButton();
        activity.searchForRecipeWMA();
        activity.rateRecipe();
        activity.tapMyRecipesTab();
        activity.scroll();

        Assert.assertTrue(activity.wouldMakeAgainIsPresent());
        print("Verified Would Make Again title is present");

        Assert.assertTrue(activity.recipeTitleWMAIsPresent());
        print("Verified Recipe is present in Would Make Again");
        print("------------------------------------------------------");
    }

    @Test (priority = 5)
    public void testActivityTab(){
        ActivityPage activity = new ActivityPage();
        Assert.assertTrue(activity.activityTabIsPresent());
        print("Verified Activity tab is present");
        print("------------------------------------------------------");
    }
}