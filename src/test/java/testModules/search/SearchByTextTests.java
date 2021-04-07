package testModules.search;

import config.InitTest;
import config.dataProvider.SearchDataProvider;
import config.pages.onboarding.OnboardingPage;
import config.pages.search.SearchByTextPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchByTextTests extends InitTest {

    @BeforeClass
    public void onboardingProcess() {
        OnboardingPage onboarding = new OnboardingPage();
        onboarding.onboarding();
        System.out.println("------------------------------------------------------");
    }


    @Test(dataProvider = "searchByValidTextDataProvider", dataProviderClass = SearchDataProvider.class)
    public void testSeachByText(String data) {

        System.out.println("-------------------SEARCH BY TEXT-------------------");

        System.out.println("Sending String");
        SearchByTextPage searchByText = new SearchByTextPage();
        searchByText.tapSearchField();
        searchByText.clearSearchField();
        searchByText.sendSearchString(data);
        searchByText.tapSearchResult();

        System.out.println("Comparing String with Ingredients");
        List<String> ingredientsOnRecipe = new ArrayList<>();
        ingredientsOnRecipe= searchByText.ingredient();
        boolean hasData = false;
        for (String e : ingredientsOnRecipe) {
            if (e.contains(data)) {
                hasData = true;
                Assert.assertTrue(hasData);
                System.out.println("Ingredient is matching criteria: " + e);
                break;
            }
        }
        Assert.assertTrue(hasData);

        searchByText.backSearch();
        System.out.println("------------------------------------------------------");
    }
}



