package basePackage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Base {

    public static IOSDriver<MobileElement> driver;
    private static final String APP_LOCATION = "/Users/stefireichel/Library/Developer/Xcode/DerivedData/BuzzFeed-ghyxeuxybiscdjeifpwsjwmenmbj/Build/Products/Debug-iphonesimulator/Tasty.app";

    public static void setUp() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            /*Platform and device for running locally*/
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 mini");
            caps.setCapability("automationName", "XCUITest");

            //App
            caps.setCapability(MobileCapabilityType.APP, APP_LOCATION);

            //Driver
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new IOSDriver<MobileElement>(url, caps);

        } catch (Exception exp) {
            System.out.println("Cause is : " + exp.getCause());
            System.out.println("Message is : " + exp.getMessage());
            exp.printStackTrace();
        }
    }

    public static void baseClassPassed() {
        System.out.println("Capabilities passed, Driver started... Starting Tests");
    }

    public static void closeAppBase() {
        driver.closeApp();
        System.out.println("Closed App");
    }

    public static void closeDriverBase() {
        driver.quit();
        System.out.println("Closed Driver");
    }

    public static void waiter() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}