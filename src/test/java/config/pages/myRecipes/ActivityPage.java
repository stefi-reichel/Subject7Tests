package config.pages.myRecipes;

import basePackage.Base;
import config.pages.login.DeleteUserPage;
import config.pages.login.LoginFBMyRecipesPage;
import config.pages.myBag.MyBagAddingRecipePage;
import config.pages.myBag.MyBagTabFunctionalityPage;
import config.pages.search.SearchByTextPage;
import config.pages.settings.SettingsPage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.HashMap;

public class ActivityPage extends Base {

    // catching elements
    private final By myRecipesTab = MobileBy.AccessibilityId("My Recipes");

    private final By activityTab = MobileBy.AccessibilityId("Activity");

    private final By recentlyViewed = MobileBy.AccessibilityId("Recently viewed");

    private final By discoverTab = MobileBy.AccessibilityId("Discover");

    private final By recipeTitleRV = MobileBy.iOSNsPredicateString("label == \"Apple Peel Chips\"");

    private final By recipeTitleRP = MobileBy.iOSNsPredicateString("label == \"Caramel Apple Crumble Cheesecake\"");

    private final By recipeTitleWMA = MobileBy.iOSNsPredicateString("label == \"Baked Cinnamon Apple Chips\"");

    private final By recentlyPurchased = MobileBy.AccessibilityId("Recently purchased");

    private final By wouldMakeAgain = By.id("title_cell");

    private final By rateButton = MobileBy.AccessibilityId("I made this!");

    private final By thumbsUpButton = By.id("thumbs_up");

    private final By noThanksButton = MobileBy.AccessibilityId("No thanks");

    private final By backButton = By.xpath("//*[contains(@name,'Back')]");

    private final By tapHideKeyboard = MobileBy.iOSNsPredicateString("label == \"Log into your Facebook account to " +
            "connect to Tasty\"");

    private final By addToBagButton = MobileBy.AccessibilityId("Add items to grocery bag");

    //for asserts
    public boolean activityTabIsPresent(){ return driver.findElement(activityTab).isDisplayed(); }

    public boolean recentlyViewedIsPresent(){ return driver.findElement(recentlyViewed).isDisplayed(); }

    public boolean recipeTitleRVIsPresent(){ return driver.findElement(recipeTitleRV).isDisplayed(); }

    public boolean recipeTitleRPIsPresent(){ return driver.findElement(recipeTitleRP).isDisplayed(); }

    public boolean recipeTitleWMAIsPresent(){ return driver.findElement(recipeTitleWMA).isDisplayed(); }

    public boolean recentlyPurchasedIsPresent(){ return driver.findElement(recentlyPurchased).isDisplayed(); }

    public boolean wouldMakeAgainIsPresent(){ return driver.findElement(wouldMakeAgain).isDisplayed(); }

    //Actions
    public void print (String message) {
        System.out.println(message);
    }

    //Scrolls
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void scroll(){
        HashMap scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        driver.executeScript("mobile: scroll",scrollObject);
    }


    public void accessSettings(){
        SettingsPage settings = new SettingsPage();

        settings.tapMyRecipesTab();
        settings.tapSettingsButton();
        settings.scrollToBottom();
    }

    public void deleteUser(){
        DeleteUserPage delete = new DeleteUserPage();
        delete.tapDeleteUserButton();
        delete.tapYesModalButton();
        delete.tapDoneButton();
        print ("Deleted User");
    }

    public void loginNewUser() {
        LoginFBMyRecipesPage login = new LoginFBMyRecipesPage();
        login.tapFBButtonOnTasty();
        login.tapContinueButtonOnModalOnTasty();
        login.tapContinueOnFB();
        print ("Logged in from My Recipes");
    }

    public void searchForRecipeRV(){
        SearchByTextPage search = new SearchByTextPage();
        search.tapSearchField();
        search.sendSearchString("Apple Peel Chips");
        search.tapSearchResult();
    }

    public void searchForRecipeRP(){
        SearchByTextPage search = new SearchByTextPage();
        search.clearSearchField();
        search.sendSearchString("Caramel Apple Crumble Cheesecake");
        search.tapSearchResult();
    }

    public void searchForRecipeWMA(){
        SearchByTextPage search = new SearchByTextPage();
        search.clearSearchField();
        search.sendSearchString("Apple Chips");
        search.tapSearchResult();
    }

    public void tapDiscoverTab(){
        driver.findElement(discoverTab).click();
        print ("Tapped Discover tab");
    }

    public void tapMyRecipesTab(){
        driver.findElement(myRecipesTab).click();
        print ("Tapped My Recipes tab");
    }

    public void addToBag(){
        MyBagAddingRecipePage recipeBag = new MyBagAddingRecipePage();
        MyBagTabFunctionalityPage bag = new MyBagTabFunctionalityPage();
        scroll();

        driver.findElement(addToBagButton).click();
        recipeBag.tapEnterYourZipCodeButton();
        recipeBag.searchStore("90210");
        recipeBag.selectStore();
        recipeBag.tapMyBagTab();
        print ("Added recipe to my bag");

        scroll();
        scroll();
        bag.checkout();
        print ("Proceeded to checkout");
        bag.backToTastyApp();
        bag.EmptyMyBag();
        print ("Emptied my bag");
    }

    public void tapBackButton() {
        driver.findElement(backButton).click();
        print ("Tapped back button");
    }

    public void rateRecipe() {
        scroll();
        driver.findElement(rateButton).click();
        driver.findElement(thumbsUpButton).click();
        driver.findElement(noThanksButton).click();
    }

    public void hideKeyboard(){
        driver.findElement(tapHideKeyboard).click();
    }
}