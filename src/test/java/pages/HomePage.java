package pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class HomePage {
    IOSDriver driver;
    ReusableMethods methods;
    public HomePage(IOSDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By products = By.xpath("//XCUIElementTypeStaticText[@name='PRODUCTS']");

    public void checkHomePage(){
        methods.checkElement(products);
    }


}
