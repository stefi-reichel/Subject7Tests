package config.dataProvider;


import org.testng.annotations.DataProvider;

public class SearchDataProvider {

    //----------------------------------------------------------------------------------------
    //SearchByTextTests Class
    //----------------------------------------------------------------------------------------

    @DataProvider(name = "searchByValidTextDataProvider")
    public static Object[][] fetchData() throws Exception {
        return new Object[][]{
                {"chicken breast"},
                {"chocolate"},
                {"fettuccine"},
                {"penne"}
        };
    }


    //----------------------------------------------------------------------------------------
    //SearchByTextAndTagTests class
    //----------------------------------------------------------------------------------------

    @DataProvider(name = "searchByTextAndTagDataProvider")
    public static Object[][] fetchData2() throws Exception {
        return new Object[][]{
                {"lettuce"},

        };
    }


    //----------------------------------------------------------------------------------------
    //SearchByPopularTagTests class
    //----------------------------------------------------------------------------------------

    @DataProvider(name = "searchByPopularTagDataProvider")
    public static Object[][] fetchData3() throws Exception {
        return new Object[][]{
                {"chicken"},
        };
    }


    //----------------------------------------------------------------------------------------
    //SEARCH BY INGREDIENT - SearchByIngredientsTests class
    //----------------------------------------------------------------------------------------
    //FIRST SCREEN
    //--------------------------------------------------
    //1rst ingredient
    //--------------------------------------------------

    @DataProvider(name = "completingFirstIngredient")
    public static Object[][] fetchData4() throws Exception {
        return new Object[][]{
                {"carrot"},
        };
    }

    //--------------------------------------------------
    //2nd ingredient
    //--------------------------------------------------
    @DataProvider(name = "completingSecondIngredient")
    public static Object[][] fetchData5() throws Exception {
        return new Object[][]{
                {"steak"},
        };
    }

    @DataProvider(name = "completingSecondIngredient2")
    public static Object[][] fetchData6() throws Exception {
        return new Object[][]{
                {"beef"},
        };
    }

    //--------------------------------------------------
    //3rd ingredient
    //--------------------------------------------------
    @DataProvider(name = "completingThirdIngredient")
    public static Object[][] fetchData7() throws Exception {
        return new Object[][]{
                {"onion"},
        };
    }

    @DataProvider(name = "completingThirdIngredient2")
    public static Object[][] fetchData8() throws Exception {
        return new Object[][]{
                {"tomato"},
        };
    }

    //--------------------------------------------------
    //SECOND SCREEN
    //--------------------------------------------------
    //--------------------------------------------------
    //3rd ingredient
    //--------------------------------------------------

    @DataProvider(name = "completingThirdIngredient3")
    public static Object[][] fetchData9() throws Exception {
        return new Object[][]{
                {"cheddar"},
        };
    }

    //----------------------------------------------------------------------------------------
    //SEARCH RECIPE - LoginFBRecipeIMadeThisNewUserTests class
    //----------------------------------------------------------------------------------------

    @DataProvider(name = "searchRecipe")
    public static Object[][] fetchData10() throws Exception {
        return new Object[][]{
                {"Pizza In A Mug"},
        };
    }
}



















