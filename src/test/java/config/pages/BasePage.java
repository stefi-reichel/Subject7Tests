package config.pages;

import basePackage.Base;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends Base {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
