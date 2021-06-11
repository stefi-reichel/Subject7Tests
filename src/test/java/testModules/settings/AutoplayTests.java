package testModules.settings;

import config.InitTest;
import config.pages.settings.AutoplayPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/*continues from SettingsTests*/

public class AutoplayTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

    @Test (priority = 1)
    public void testAutoplaySectionDefaultOption(){
        AutoplayPage autoplay = new AutoplayPage();
        Assert.assertTrue(autoplay.autoplaySectionNeverIsPresent());
        print("Verified Autoplay option Never is selected by default");
        print("------------------------------------------------------");
    }

    @Test (priority = 2)
    public void testAutoplayVideoHeader(){
        AutoplayPage autoplay = new AutoplayPage();
        autoplay.tapAutoplaySectionNever();
        Assert.assertTrue(autoplay.autoplayVideosHeaderIsPresent());
        print("Verified Autoplay Video header is present when tapping the autoplay section");
        print("------------------------------------------------------");
    }

    @Test (priority = 3)
    public void testAutoplayAlwaysOption(){
        AutoplayPage autoplay = new AutoplayPage();
        Assert.assertTrue(autoplay.autoplayAlwaysOptionIsPresent());
        print("Verified Always option is present in the autoplay section");
        autoplay.tapAutoplayAlwaysOption();
        autoplay.tapSettingsBackButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 4)
    public void testAutoplayAlwaysSection(){
        AutoplayPage autoplay = new AutoplayPage();
        Assert.assertTrue(autoplay.autoplaySectionAlwaysIsPresent());
        print("Verified Always option is selected in the autoplay section");
        print("------------------------------------------------------");
    }

    @Test (priority = 5)
    public void testAutoplayWiFiOption(){
        AutoplayPage autoplay = new AutoplayPage();
        autoplay.tapAutoplaySectionAlways();
        Assert.assertTrue(autoplay.autoplayOptionWiFiIsPresent());
        print("Verified Wi Fi option is present in the autoplay section");
        autoplay.tapAutoplayWiFiOption();
        autoplay.tapSettingsBackButton();
        print("------------------------------------------------------");
    }

    @Test (priority = 6)
    public void testAutoplayWiFiSection(){
        AutoplayPage autoplay = new AutoplayPage();
        Assert.assertTrue(autoplay.autoplaySectionWiFiIsPresent());
        print("Verified Wi Fi option is selected in the autoplay section");
        print("------------------------------------------------------");
    }

    @Test (priority = 7)
    public void testSelectAutoPlayNeverOption(){
        AutoplayPage autoplay = new AutoplayPage();
        autoplay.tapAutoplaySectionWiFi();
        autoplay.tapAutoplayNeverOption();
        autoplay.tapSettingsBackButton();
        Assert.assertTrue(autoplay.autoplaySectionNeverIsPresent());
        print("Verified Autoplay option Never is selected");
        print("------------------------------------------------------");
    }
}