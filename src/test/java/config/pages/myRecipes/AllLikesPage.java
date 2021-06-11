package config.pages.myRecipes;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AllLikesPage extends Base {

    // catching elements
    private final By allLikesTab = MobileBy.AccessibilityId("All Likes");

    private final By noLikesMessage = MobileBy.AccessibilityId("You haven’t liked any recipes yet. When you do, they’ll be here!");

    private final By likeButton = By.id("like");

    private final By likeConfirmation = By.id("liked_toast_label");

    private final By likedRecipe = MobileBy.iOSNsPredicateString("label == \"Baked Cinnamon Apple Chips\"");

    private final By unLikeButton = By.id("unlike");

    private final By removeConfirmation = By.id("unliked_toast_label");

    private final By backButton = By.xpath("//*[contains(@name,'Back')]");

    private final By gotItButton = MobileBy.AccessibilityId("Got it");

    //for asserts
    public boolean allLikesTabIsPresent(){ return driver.findElement(allLikesTab).isDisplayed(); }

    public boolean noLikesMessageIsPresent(){ return driver.findElement(noLikesMessage).isDisplayed(); }

    public boolean likeConfirmationIsPresent(){ return driver.findElement(likeConfirmation).isDisplayed(); }

    public boolean likedRecipeTitleIsPresent(){ return driver.findElement(likedRecipe).isDisplayed(); }

    public boolean removeConfirmationIsPresent(){ return driver.findElement(removeConfirmation).isDisplayed(); }

    //actions
    public void tapAllLikesTab(){
        driver.findElement(allLikesTab).click();
        System.out.println("Tapped Discover tab");
    }

    public void tapLikeButton(){
        driver.findElement(likeButton).click();
        System.out.println("Tapped Like button");
    }

    public void tapRecipe(){
        driver.findElement(likedRecipe).click();
        System.out.println("Opened recipe from All Likes");
    }

    public void tapUnLikeButton(){
        driver.findElement(likeButton).click();
        System.out.println("Tapped unlike button");
    }

    public void removeFromRecipes(){
        driver.findElement(unLikeButton).click();
        System.out.println("Removed Recipe from My Recipes");
    }

    public void tapBackButton() {
        driver.findElement(backButton).click();
        System.out.println("Tapped back button");
    }

    public void tapGotItButton() {
        driver.findElement(gotItButton).click();
        System.out.println("Tapped got it button from cookbook tooltip");
    }
}