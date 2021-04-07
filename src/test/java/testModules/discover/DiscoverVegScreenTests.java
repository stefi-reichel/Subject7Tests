package testModules.discover;

import config.InitTest;
import config.pages.discover.DiscoverPage;
import config.pages.onboarding.OnboardingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscoverVegScreenTests extends InitTest {

    public void print (String message) {
        System.out.println(message);
    }

    @Test (priority = 1)
    public void testVegButton(){
        OnboardingPage onboarding = new OnboardingPage();
        onboarding.waitForGetStartedButton();
        onboarding.tapGetStarted();
        onboarding.waitForVegButton();
        Assert.assertTrue(onboarding.vegButtonIsPresent());
        print("Verified Vegetarian button");
        onboarding.tapVegButton();
        print("------------------------------------------------------");
    }

    @Test(priority = 2)
    public void testAllowButton(){
        OnboardingPage onboarding = new OnboardingPage();
        Assert.assertTrue(onboarding.allowButtonIsPresent());
        print("Verified Allow Notification button");
        onboarding.tapAllowNotiButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 3)
    public void testWelcomeText(){
        DiscoverPage discover = new DiscoverPage();
        Assert.assertTrue(discover.welcomeTextIsPresent());
        print("Verified Welcome text from Welcome package");
        print("------------------------------------------------------");
    }

    @Test (priority = 4)
    public void testWelcomeImage(){
        DiscoverPage discover = new DiscoverPage();
        Assert.assertTrue(discover.tastyImageIsPresent());
        print("Verified Tasty image from Welcome package");
        print("------------------------------------------------------");
    }

    @Test (priority = 5)
    public void testFirstRecipeFromWelcome(){
        DiscoverPage discover = new DiscoverPage();
        discover.tapFirstRecipe();
        discover.waitForBackButton();
        discover.tapBackButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 6)
    public void testDismissButton(){
        DiscoverPage discover = new DiscoverPage();
        discover.scrollToDismissButton();
        Assert.assertTrue(discover.dismissButtonIsPresent());
        print("Verified Dismiss button from Welcome package");
        discover.tapDismissButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 7)
    public void testSplashCell(){
        DiscoverPage discover = new DiscoverPage();
        Assert.assertTrue(discover.splashIsPresent());
        print("Verified Splash from home screen");
        discover.tapSplashCell();
        discover.waitForBackButton();
        discover.tapBackButton();
        print("------------------------------------------------------");
    }
    @Test (priority = 8)
    public void testFirstCarousel(){
        DiscoverPage discover = new DiscoverPage();
        discover.waitForScroll();
        discover.scrollToFirstCarousel();
        Assert.assertTrue(discover.firstCarouselRecipeIsPresent());
        print("Verified recipe in first carousel");
        discover.tapRecipeFromFirstCarousel();
        discover.tapBackButton();
        print("------------------------------------------------------");
    }
}
