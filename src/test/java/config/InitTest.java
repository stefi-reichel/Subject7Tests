package config;

import basePackage.HookInt;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class InitTest extends HookInt {

    @BeforeSuite
    public static void setUpTest() {
        platform();
    }

    @AfterSuite
    public static void tearDown(){
        closeApp();
        closeDriver();
    }
}
