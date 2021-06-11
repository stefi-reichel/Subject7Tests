package config.pages.myBag;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyBagTabFunctionalityPage extends Base {

    //Catching elements empty My Bag
    private final By gotItTooltipButton = By.xpath("//XCUIElementTypeButton[@name='got_it']");
    private final By increaseRecipeQuantityButton = By.xpath("//XCUIElementTypeButton[@name='recipe_quantity_increase']");
    private final By decreaseRecipeQuantityButton = By.xpath("//XCUIElementTypeButton[@name='recipe_quantity_decrease']");
    private final By recipeQuantityWOModification = By.xpath("//XCUIElementTypeStaticText[@name='10']");
    private final By recipeQuantityWModification = By.xpath("//XCUIElementTypeStaticText[@name='11']");
    private final By increaseProductQuantityButton = By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity_increase'])[1]");
    private final By decreaseProductQuantityButton = By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity_decrease'])[1]");
    private final By productQuantity = By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity'][1])");
    private final By swapCell = By.xpath("//XCUIElementTypeCell[@name=\"tasty_grocery_bag_product\"]/XCUIElementTypeOther/XCUIElementTypeScrollView");
    private final By deleteButton = By.xpath("(//XCUIElementTypeButton[@name='delete'])[1]");
    private final By addButton = By.xpath("(//XCUIElementTypeButton[@name='add'])[1]");
    private final By swapButton = By.xpath("(//XCUIElementTypeStaticText[@name='Swap'])[1]");
    private final By firstSwapItem = By.xpath("(//XCUIElementTypeCollectionView[@name='edit_grocery_product_collection_view']/XCUIElementTypeCell[@name='tasty_grocery_bag_product'])[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText");
    private final By pantryLabel = MobileBy.AccessibilityId("Pantry Ingredients");
    private final By mightHaveAtHomeText = MobileBy.AccessibilityId("Ingredients you might already have at home");
    private final By bagTotalLabel = MobileBy.AccessibilityId("Bag Total (estimated)");
    private final By addMoreItemsText = MobileBy.AccessibilityId("Add more items to your order at Walmart to meet their $30 minimum.");
    private final By headsUpText = By.xpath("//*[contains(@name,'Heads up:')]");
    private final By excludesTaxText = MobileBy.AccessibilityId("Bag total excludes tax and delivery charges. Final cost will be displayed at Walmart checkout.");
    private final By checkOutButton = By.xpath("//XCUIElementTypeButton[@name='finish_shopping']");
    private final By seeYaSoonText = MobileBy.AccessibilityId("See ya soon!");
    private final By didYouCompleteText = By.xpath("//XCUIElementTypeStaticText[@name='Did you complete your purchase with Walmart?']");
    private final By letUsKnowText = MobileBy.AccessibilityId("Let us know what you want to do with the items in your bag.");
    private final By yesEmptyButton = MobileBy.AccessibilityId("Yes, empty my bag");
    private final By noEmptyButton = MobileBy.AccessibilityId("No, keep the items in my bag");
    private final By safariURLField = By.id("URL");
    private final By clearSafariURLField = MobileBy.AccessibilityId("Clear text");
    private final By openTastyAppButton = MobileBy.AccessibilityId("Open");
    private final By youAreLeavingTastyText = By.id("leaving_for_checkout");



    //ACTIONS

    //Increasing/decreasing Recipe Quantity
   public void tapGotItTooltipButton() {
       driver.findElement(gotItTooltipButton).click();
        System.out.println("Tapped 'Got it' Pantry Tooltip");
   }

    public Boolean recipeQuantityWOModificationIsPresent() {
        return driver.findElement(recipeQuantityWOModification).isDisplayed();
    }

    public void tapIncreaseRecipeQuantity() {
        driver.findElement(increaseRecipeQuantityButton).click();
        System.out.println("Increased recipe quantity by 1");
    }

    public Boolean recipeQuantityWModificationIsPresent() {
        return driver.findElement(recipeQuantityWModification).isDisplayed();
    }

    public void tapDecreaseRecipeQuantity() {
        driver.findElement(decreaseRecipeQuantityButton).click();
        System.out.println("Decreased recipe quantity by 1");
    }


    //Increasing/decreasing Product Quantity
    public void tapIncreaseProductQuantity() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity'][1])")));
        driver.findElement(productQuantity).click();
        driver.findElement(increaseProductQuantityButton).click();
        System.out.println("Increased first ingredient quantity by 1");
        driver.findElement(productQuantity).click();
    }

    public void tapDecreaseProductQuantity() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity'][1])")));
        driver.findElement(productQuantity).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='ingredient_quantity_decrease'])[1]")));
        driver.findElement(decreaseProductQuantityButton).click();
        System.out.println("Decreased recipe quantity by 1");
        driver.findElement(productQuantity).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    //Delete product
    public void swipe() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "left");
        params.put("element", (driver.findElement(swapCell).getId()));
        js.executeScript("mobile: swipe", params);
    }

    public void deleteProduct(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='delete'])[1]")));
        driver.findElement(deleteButton).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Tapped Delete button");
    }


    //Add Product again
    public Boolean reAddButtonIsPresent() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(addButton).isDisplayed();
    }

    public void reAddProduct() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(addButton).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Tapped Add button to add deleted product");
    }


    //Swap product
    public Boolean swapButtonIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeStaticText[@name='Swap'])[1]")));
        return driver.findElement(swapButton).isDisplayed();
    }

    public void swapProduct() {
        driver.findElement(swapButton).click();
        System.out.println("Tapped Swap button");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeCell[@name='tasty_grocery_bag_product'])[2]/XCUIElementTypeOther/XCUIElementTypeScrollView")));
        driver.findElement(firstSwapItem).click();
        System.out.println("Tapped First item button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    //Add Pantry Product
    public Boolean pantryLabelIsPresent() {
        return driver.findElement(pantryLabel).isDisplayed();
    }

    public Boolean mightHaveAtHomeTextIsPresent() {
        return driver.findElement(mightHaveAtHomeText).isDisplayed();
    }

    public void addPantryProduct() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(addButton).click();
        System.out.println("Tapped Add button to add pantry item");
    }


    //Check Out
    public void scroll() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.90);
        int endy = (int) (size.height * 0.001);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);

        do {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        } while (excludesTaxText == null);
    }

    public Boolean bagTotalLabelIsPresent() {
        return driver.findElement(bagTotalLabel).isDisplayed();
    }

    public Boolean addMoreItemsTextIsPresent() {
        return driver.findElement(addMoreItemsText).isDisplayed();
    }

    public Boolean headsUpTextIsPresent() {
        return driver.findElement(headsUpText).isDisplayed();
    }

    public Boolean excludesTaxTextIsPresent() {
        return driver.findElement(excludesTaxText).isDisplayed();
    }

    public Boolean checkOutIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='finish_shopping']")));
        return driver.findElement(checkOutButton).isDisplayed();
    }

    public void checkout() {
        driver.findElement(checkOutButton).click();
        System.out.println("Tapped Check Out button");
    }

    public Boolean seeYaSoonTextIsPresent() {
        return driver.findElement(seeYaSoonText).isDisplayed();
    }

    public Boolean youAreLeavingTastyTextIsPresent() {
        return driver.findElement(youAreLeavingTastyText).isDisplayed();
    }

    public Boolean safariURLFieldIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("URL")));
        return driver.findElement(safariURLField).isDisplayed();
    }


    //Back to Tasty App - Not emptying My Bag
    public void backToTastyApp() {
        driver.findElement(safariURLField).click();
        driver.findElement(clearSafariURLField).click();
        driver.findElement(safariURLField).sendKeys("tasty://");
        driver.findElement(safariURLField).sendKeys(Keys.ENTER);
        driver.findElement(openTastyAppButton).click();
    }

    public Boolean didYouCompleteTextIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='Did you complete your purchase with Walmart?']")));
        return driver.findElement(didYouCompleteText).isDisplayed();
    }

    public Boolean letUsKnowTextIsPresent() {
        return driver.findElement(letUsKnowText).isDisplayed();
    }

    public Boolean noEmptyButtonIsPresent() {
        return driver.findElement(noEmptyButton).isDisplayed();
    }

    public void noEmptyMyBag() {
        driver.findElement(noEmptyButton).click();
        System.out.println("Tapped 'No, keep the items in my bag' button");
    }


    //Back to Tasty App - Emptying My Bag
    public Boolean yesEmptyButtonIsPresent() {
        return driver.findElement(yesEmptyButton).isDisplayed();
    }

    public void EmptyMyBag() {
        driver.findElement(yesEmptyButton).click();
        System.out.println("Tapped 'Yes, empty my bag' button");
    }
}






