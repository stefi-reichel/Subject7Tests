package testModules.settings;

import config.InitTest;
import config.pages.onboarding.OnboardingPage;
import config.pages.settings.SettingsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SettingsTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

    @Test(priority = 1)
    public void testSettingsButton(){
        SettingsPage settings = new SettingsPage();
        settings.tapMyRecipesTab();
        Assert.assertTrue(settings.settingsButtonIsPresent());
        print("Verified settings button is present in My Recipes");
        settings.tapSettingsButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 2)
    public void testSettingsHeader(){
        SettingsPage settings = new SettingsPage();
        Assert.assertTrue(settings.settingsHeaderIsPresent());
        print("Verified settings Header is present in Settings");
        print("------------------------------------------------------");
    }

    @Test (priority = 3)
    public void testSettingsSectionTitle(){
        SettingsPage settings = new SettingsPage();
        Assert.assertTrue(settings.settingsSectionTitleIsPresent());
        print("Verified settings section title is present in Settings");
        print("------------------------------------------------------");
    }

    @Test (priority = 4)
    public void testVegetarianSwitch(){
        SettingsPage settings = new SettingsPage();
        Assert.assertTrue(settings.vegetarianOptionIsPresent());
        print("Verified vegetarian option is present in Settings");
        settings.tapVegetarianOption();
        print("------------------------------------------------------");
    }

    @Test (priority = 5)
    public void testNofificationsOption(){
        SettingsPage settings = new SettingsPage();
        Assert.assertTrue(settings.notificationsOptionIsPresent());
        print("Verified notification option is present in Settings");
        settings.tapNotificationOption();
        print("------------------------------------------------------");
    }

    @Test (priority = 6)
    public void testOneTopOption(){
        SettingsPage settings = new SettingsPage();
        Assert.assertTrue(settings.oneTopOptionIsPresent());
        print("Verified One Top option is present in Settings");
        settings.tapOneTopOption();
        settings.tapCancelOneTopButton();
        print("------------------------------------------------------");
    }
}