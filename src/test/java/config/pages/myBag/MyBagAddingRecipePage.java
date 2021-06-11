package config.pages.myBag;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyBagAddingRecipePage extends Base {

    //Catching elements empty My Bag
    private final By myBagTab = MobileBy.AccessibilityId("My Bag");
    private final By yourGroceryBagIsEmptyLabel = By.id("Your Grocery Bag is empty.");
    private final By saveTimeLabel = MobileBy.AccessibilityId("Save time, shop ingredients");
    private final By buildYourGroceryBagWithTastyLabel = MobileBy.AccessibilityId("Build your grocery bag with Tasty, then choose how you want to get your order from Walmart.");
    private final By learnMoreButton = MobileBy.AccessibilityId("Learn more");

    //Catching elements on recipe
    private final By discoverTab = MobileBy.AccessibilityId("Discover");
    private final By addItemsToMyBagButton = By.xpath("//XCUIElementTypeButton[@name='add_to_bag']");
    private final By removeItemsFromGroceryBagButton = MobileBy.AccessibilityId("Remove items from grocery bag");

    //Catching elements when selecting/changing Store
    private final By selectWMStoreLabel = MobileBy.AccessibilityId("Select a Walmart store");
    private final By weLlUseYourLocationLabel = MobileBy.AccessibilityId("We'll use your location to find local Walmart stores offering Grocery Pickup and Delivery.");
    private final By enableLocationServicesButton = MobileBy.AccessibilityId("Enable location services");
    private final By enterYourZipCodeButton = MobileBy.AccessibilityId("or enter your zip code");
    private final By searchStoreField = By.className("XCUIElementTypeTextField");
    private final By doneButton = MobileBy.AccessibilityId("Done");
    private final By storeOne = MobileBy.AccessibilityId("5686 - DotCom Delivery Special Event");
    private final By changeStoreButton = MobileBy.AccessibilityId("Change store");
    private final By storeChanged = By.xpath("//*[contains(@name,'848 - Spark Delivery')]");
    private final By confirmChangeStoreButton = MobileBy.AccessibilityId("Yes, change my store");

    //Catching element when My bag is empty but a recipe was already added and deleted
    private final By recipesOnEmptyMyBag = By.id("tasty_recipe_cell");

    //Catching elements on My Bag with Recipe
    private final By groceryBagHeader = MobileBy.AccessibilityId("Grocery Bag");
    private final By justSoYouKnowText = By.xpath("//XCUIElementTypeStaticText[@name='Just so you know, Tasty may collect a share of sales or other compensation from purchases made through Walmart Pickup and Delivery.']");
    private final By backButton = By.xpath("//*[contains(@name,'Back')]");
    private final By addedRecipeOnMyBag = By.xpath("//XCUIElementTypeCollectionView[@name='grocery_bag_collection_view']/XCUIElementTypeOther[2]/XCUIElementTypeImage");
    private final By removeRecipeFromMyBagTab = By.id("recipe_delete");
    private final By confirmRemoveRecipeFromMyBagTab = MobileBy.AccessibilityId("Yes, remove these items");

    //Toasts
    private final By addedRecipeConfirmationToast = By.id("added_to_bag_toast_label");
    private final By removedRecipeConfirmationToast = By.id("removed_from_bag_toast_label");
    private final By storeConfirmationToast = By.id("saved_store_toast_label");



    //Actions on empty My Bag
    public void tapMyBagTab() {
        driver.findElement(myBagTab).click();
        System.out.println("Tapped empty My Bag Tab");
    }

    public Boolean yourGroceryBagIsEmptyLabelIsPresent() {
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        return driver.findElement(yourGroceryBagIsEmptyLabel).isDisplayed();
    }

    public Boolean saveTimeLabelIsPresent() {
        return driver.findElement(saveTimeLabel).isDisplayed();
    }

    public Boolean buildYourGroceryBagWithTastyLabelIsPresent() {
        return driver.findElement(buildYourGroceryBagWithTastyLabel).isDisplayed();
    }

    public Boolean learnMoreButtonIsPresent() {
        return driver.findElement(learnMoreButton).isDisplayed();
    }


    //Actions on recipe
    public void waitToScroll() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("like")));
        System.out.println("Wait to scroll: it found 'Add to My Recipes' button, now it can start scrolling");
    }


    public void scroll() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);

        do{
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        }while (addItemsToMyBagButton==null);
    }

    public void tapDiscoverTab() {
        driver.findElement(discoverTab).click();
        System.out.println("Tapped Discover Tab");
    }

    public void tapAddItemsToMyBagButton() {
        driver.findElement(addItemsToMyBagButton).click();
        System.out.println("Tapped 'Add items to My Bag' button");
    }

    public Boolean addedRecipeConfirmationToastIsPresent() {
        return driver.findElement(addedRecipeConfirmationToast).isDisplayed();
    }

    public void tapRemoveRecipeButton() {
        driver.findElement(removeItemsFromGroceryBagButton).click();
        System.out.println("Tapped Remove Items From Grocery Bag button");
    }

    public Boolean removedRecipeConfirmationToastIsPresent() {
        return driver.findElement(removedRecipeConfirmationToast).isDisplayed();
    }


    //Actions on Selecting/Changing Store
    public Boolean selectWMStoreLabelIsPresent() {
        return driver.findElement(selectWMStoreLabel).isDisplayed();
    }

    public Boolean weLlUserYourLocationLabelIsPresent() {
        return driver.findElement(weLlUseYourLocationLabel).isDisplayed();
    }

    public Boolean enableLocationServicesButtonIsPresent() {
        return driver.findElement(enableLocationServicesButton).isDisplayed();
    }

    public Boolean enterYourZipCodeButtonIsPresent() {
        return driver.findElement(enterYourZipCodeButton).isDisplayed();
    }

    public void tapEnterYourZipCodeButton() {
        driver.findElement(enterYourZipCodeButton).click();
        System.out.println("Tapped Enter Your Zip Code button");
    }


    public Boolean searchStoreFieldIsPresent() {
        return driver.findElement(searchStoreField).isDisplayed();
    }

    public void searchStore(String zipCode1) {
        driver.findElement(searchStoreField).click();
        driver.findElement(searchStoreField).sendKeys(zipCode1);
        driver.findElement(doneButton).click();
        System.out.println("Entered zip code");
    }

    public void selectStore() {
        driver.findElement(storeOne).click();
        System.out.println("Selected First Store");
    }

    public Boolean storeConfirmationToastIsPresent() {
        return driver.findElement(storeConfirmationToast).isDisplayed();
    }

    public void tapChangeStoreButton() {
        driver.findElement(changeStoreButton).click();
        System.out.println("Tapped Change Store button");
    }

    public void searchChangeStore(String changeZipCode) {
        driver.findElement(searchStoreField).click();
        driver.findElement(searchStoreField).sendKeys(changeZipCode);
        driver.findElement(doneButton).click();
        System.out.println("Entered zip code");
    }

    public void selectChangeStore() {
        driver.findElement(storeChanged).click();
        System.out.println("Selected Changed Store");
    }

    public void tapConfirmChangeStorebutton() {
        driver.findElement(confirmChangeStoreButton).click();
        System.out.println("Confirm Change Store");
    }


    //Actions when My bag is empty but a recipe was already added and deleted
    public void tapRecipeOnEmptyMyBag() {
        driver.findElement(recipesOnEmptyMyBag).click();
        System.out.println("Tapped recipe on Empty My bag");
        driver.findElement(backButton).click();
    }


    //Actions when My bag has recipe
    public Boolean changedStoreIsPresentOnMyBag() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'848 - Spark Delivery')] ")));
        return driver.findElement(storeChanged).isDisplayed();
    }

    public Boolean groceryBagHeaderIsPresent() {
        return driver.findElement(groceryBagHeader).isDisplayed();
    }

    public Boolean justSoYouKnowTextIsPresent() {
        return driver.findElement(justSoYouKnowText).isDisplayed();
    }

    public void tapAddedRecipeOnMyBag() {
        driver.findElement(addedRecipeOnMyBag).click();
        System.out.println("Tapped added recipe on My bag");
        driver.navigate().back();
    }

    public void tapRemoveRecipeFromMyBagTab() {
        driver.findElement(removeRecipeFromMyBagTab).click();
        System.out.println("Tapped X button to delete recipe on My bag");
    }

    public void tapConfirmRemoveRecipeFromMyBagTab() {
        driver.findElement(confirmRemoveRecipeFromMyBagTab).click();
        System.out.println("Tapped 'Yes, remove these items' to delete a recipe from My Bag tab");
    }
}
