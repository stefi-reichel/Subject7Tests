package testModules.myRecipes;

import config.InitTest;
import config.pages.myRecipes.ActivityPage;
import config.pages.myRecipes.AllLikesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/* continues from activityTests*/
public class AllLikesTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

    @Test(priority = 1)
    public void testAllLikesTab(){
        AllLikesPage likes = new AllLikesPage();
        Assert.assertTrue(likes.allLikesTabIsPresent());
        print("Verified All Likes tab is present");
        likes.tapAllLikesTab();
        print("------------------------------------------------------");
    }

    @Test(priority = 2)
    public void testNoLikesMessage(){
        AllLikesPage likes = new AllLikesPage();
        Assert.assertTrue(likes.noLikesMessageIsPresent());
        print("Verified No Likes yet message is displayed");
        print("------------------------------------------------------");
    }

    @Test(priority = 3)
    public void testLikeRecipe(){
        AllLikesPage likes = new AllLikesPage();
        ActivityPage activity = new ActivityPage();
        activity.tapDiscoverTab();
        likes.tapLikeButton();
        Assert.assertTrue(likes.likeConfirmationIsPresent());
        print("Verified recipe is added to My Recipes");
        likes.tapGotItButton();
        activity.tapMyRecipesTab();
        print("------------------------------------------------------");
    }

    @Test(priority = 4)
    public void testRecipeLiked(){
        AllLikesPage likes = new AllLikesPage();
        Assert.assertTrue(likes.likedRecipeTitleIsPresent());
        print("Verified recipe is present in All Likes");
        print("------------------------------------------------------");
    }

    @Test(priority = 5)
    public void testRemoveRecipe(){
        AllLikesPage likes = new AllLikesPage();
        likes.tapRecipe();
        likes.tapUnLikeButton();
        likes.removeFromRecipes();
        Assert.assertTrue(likes.removeConfirmationIsPresent());
        print("Verified removed recipe comnfirmation is displayed");
        print("------------------------------------------------------");
    }

    @Test(priority = 6)
    public void testEmptyLikesAfterRemoval(){
        AllLikesPage likes = new AllLikesPage();
        likes.tapBackButton();
        Assert.assertTrue(likes.noLikesMessageIsPresent());
        print("Verified No Likes yet message is displayed");
        print("------------------------------------------------------");
    }
}