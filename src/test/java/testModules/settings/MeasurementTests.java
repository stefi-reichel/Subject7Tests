package testModules.settings;

import config.InitTest;
import config.pages.settings.MeasurementPage;
import config.pages.settings.SettingsDebugPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/*continues from AutoplayTests*/

public class MeasurementTests extends InitTest {
    public void print (String message) {
        System.out.println(message);
    }

    @Test(priority = 1)
    public void testMeasurementDefaultOption(){
        MeasurementPage measurement = new MeasurementPage();
        SettingsDebugPage debug = new SettingsDebugPage();
        Assert.assertTrue(measurement.measurementSystemUSIsPresent());
        print("Verified Measurement option is set by default to US");
        /*debug.loadRecipeIDFromSettings("5556");
        Assert.assertTrue(measurement.USMeasurementInRecipeIsPresent());
        print("Verified US Measurement system is present in a Recipe");
        driver.navigate().back();*/
        print("------------------------------------------------------");
    }

    @Test(priority = 2)
    public void testMetricMeasurementOption(){
        MeasurementPage measurement = new MeasurementPage();
        measurement.tapMeasurementUSOption();
        Assert.assertTrue(measurement.metricOptionIsPresent());
        print("Verified Metric option is present");
        measurement.tapMetricOption();
        measurement.tapBackButton();
        Assert.assertTrue(measurement.measurementSystemMetricIsPresent());
        print("Verified Metric option is selected");
        print("------------------------------------------------------");
    }

    @Test(priority = 3)
    public void testMetricOptionInRecipe(){
        /*MeasurementPage measurement = new MeasurementPage();
        SettingsDebugPage debug = new SettingsDebugPage();
        debug.loadRecipeIDFromSettings("5556");
        Assert.assertTrue(measurement.MetricMeasurementInRecipeIsPresent());
        print("Verified Metric option is present in Recipe");
        driver.navigate().back();*/
        print("------------------------------------------------------");
    }

    @Test(priority = 4)
    public void testChangeToUSOption(){
        MeasurementPage measurement = new MeasurementPage();
        measurement.tapMeasurementMetricOption();
        measurement.tapUSOption();
        measurement.tapBackButton();
        Assert.assertTrue(measurement.measurementSystemUSIsPresent());
        print("Verified US only Measurement option is selected");
        print("------------------------------------------------------");
    }

    @Test(priority = 5)
    public void testUSOptionInRecipe(){
        /*MeasurementPage measurement = new MeasurementPage();
        SettingsDebugPage debug = new SettingsDebugPage();
        debug.loadRecipeIDFromSettings("5556");
        Assert.assertTrue(measurement.USMeasurementInRecipeIsPresent());
        print("Verified US Measurement system is present in a Recipe");
        driver.navigate().back();*/
        print("------------------------------------------------------");
    }
}