package config.pages.search;

import config.pages.BasePage;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class SearchByTextPage extends BasePage {

    //Catching elements
    @iOSXCUITFindBy(accessibility="Search Tasty")
    private IOSElement searchTastyField;

    @iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[@name='tasty_recipe_cell'])[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage")
    private IOSElement searchResult;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeCell[@name='RecipeComponentsCell']/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    private List<IOSElement> ingredientsOnRecipe;

    @iOSXCUITFindBy(accessibility = "Close")
    private IOSElement closeButton;

    @iOSXCUITFindBy(xpath = "//*[contains(@name,'Back')] ")
    private IOSElement backButton;



    //Actions
    public void tapSearchField(){
        searchTastyField.click();
        System.out.println("Tapped on search field");

    }

    public void clearSearchField(){
        searchTastyField.clear();
        System.out.println("Cleaning search field");
    }

     public void sendSearchString(String searchTerm){
        searchTastyField.sendKeys(searchTerm);
        searchTastyField.sendKeys(Keys.ENTER);
        System.out.println("SearchTerm+Enter");
    }

    public void tapSearchResult(){
        searchResult.click();
        System.out.println("Tapped search result");
    }

    public List<String> ingredient(){
        List<String>  ingredientsFoundOnRecipe = new ArrayList<>();
        for(IOSElement e : ingredientsOnRecipe) {
            ingredientsFoundOnRecipe.add(e.getText());
        }
        System.out.println("List of Ingredients on recipe: " + ingredientsFoundOnRecipe);
        return ingredientsFoundOnRecipe;
    }

    public void backSearch(){
        backButton.click();
    }
}
