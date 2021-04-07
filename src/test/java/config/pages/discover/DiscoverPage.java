package config.pages.discover;

import config.pages.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class DiscoverPage extends BasePage {
    //Catching elements
    @iOSXCUITFindBy(accessibility = "DISCOVER")
    private IOSElement discoverTab;

    @iOSXCUITFindBy(accessibility = "WELCOME TO")
    private IOSElement welcomeText;

    @iOSXCUITFindBy(accessibility = "Tasty")
    private IOSElement tastyImage;

    @iOSXCUITFindBy(accessibility = "The Best Chewy Chocolate Chip Cookies")
    private IOSElement welcomeFirstRecipe;

    @iOSXCUITFindBy(accessibility = "dismiss")
    private IOSElement dismissButton;

    @iOSXCUITFindBy(id = "tasty_recipe_splash_cell")
    private IOSElement splash;

    @iOSXCUITFindBy(accessibility = "Trending")
    private IOSElement trendingCarousel;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"TastyItemCard\"])[1]")
    private IOSElement firstCarouselRecipe;

    @iOSXCUITFindBy(xpath = "//*[contains(@name,'Back')] ")
    private IOSElement backButton;

    //for asserts
    public boolean welcomeTextIsPresent(){
        return welcomeText.isDisplayed();
    }

    public boolean tastyImageIsPresent(){
        return tastyImage.isDisplayed();
    }

    public boolean dismissButtonIsPresent(){
        return dismissButton.isDisplayed();
    }

    public boolean splashIsPresent(){
        return splash.isDisplayed();
    }

    public boolean trendingCarouselIsPresent(){
        return trendingCarousel.isDisplayed();
    }

    public boolean firstCarouselRecipeIsPresent(){
        return firstCarouselRecipe.isDisplayed();
    }

    //Actions
    public void scrollToDismissButton(){
        do{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            driver.executeScript("mobile: scroll",scrollObject);

        }while (dismissButton==null);
    }

    public void scrollToTrendingCarousel(){
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.50);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
        do{
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        }while (trendingCarousel==null);
    }

    public void scrollToFirstCarousel(){
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.50);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
        do{
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        }while (firstCarouselRecipe==null);
    }

    public void tapFirstRecipe() {
        welcomeFirstRecipe.click();
        System.out.println("Tapped first recipe in welcome package");
    }

    public void tapDismissButton() {
        dismissButton.click();
        System.out.println("Tapped Dismiss button from welcome package");
    }

    public void tapSplashCell() {
        splash.click();
        System.out.println("Selected Splash");
    }

    public void tapRecipeFromFirstCarousel() {
        firstCarouselRecipe.click();
        System.out.println("Selected recipe in first carousel");
    }

    public void tapBackButton() {
        backButton.click();
        System.out.println("Tapped back button");
    }

    public void tapDiscoverTab() {
        discoverTab.click();
        System.out.println("Tapped Discover tab");
    }

    //Waiters
    WebDriverWait wait = new WebDriverWait(driver,50);

    public void waitForBackButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[contains(@name,'Back')] ")));
    }

    public void waitForScroll() {
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("tasty_recipe_splash_cell")));
    }
}
