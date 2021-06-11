package config.pages.search;

import basePackage.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SearchByTextPage extends Base {

    //Catching elements
    private final By searchTastyField = MobileBy.AccessibilityId("Search Tasty");
    private final By searchResult = By.id("tasty_recipe_cell");
    private final By ingredientsOnRecipe = By.xpath("//XCUIElementTypeCell[@name='RecipeComponentsCell']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton");
    private final By backButton = By.xpath("//*[contains(@name,'Back')]");


    //Actions
    public void tapSearchField(){
        driver.findElement(searchTastyField).click();
        System.out.println("Tapped on search field");
    }

    public void clearSearchField(){
        driver.findElement(searchTastyField).clear();
        System.out.println("Cleaning search field");
    }

     public void sendSearchString(String searchTerm){
         driver.findElement(searchTastyField).sendKeys(searchTerm);
         driver.findElement(searchTastyField).sendKeys(Keys.ENTER);
        System.out.println("SearchTerm+Enter");
    }

    public void tapSearchResult(){
        driver.findElement(searchResult).click();
        System.out.println("Tapped search result");
    }

    public void scroll() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " , endy = " + endy + " , startx = " + startx);
        do {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(startx, endy)).release().perform();
        } while (ingredientsOnRecipe == null);
    }

    public List<String> ingredient(){
        List<MobileElement> firstSearchResult = driver.findElements(ingredientsOnRecipe);
        List<String>  ingredientsFoundOnRecipe = new ArrayList<>();
        for(MobileElement e : firstSearchResult) {
            ingredientsFoundOnRecipe.add(e.getText());
        }
        System.out.println("List of Ingredients on recipe: " + ingredientsFoundOnRecipe);
        return ingredientsFoundOnRecipe;
    }

    public void backSearch(){
        driver.findElement(backButton).click();
    }
}
