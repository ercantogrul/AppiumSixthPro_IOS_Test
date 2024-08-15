package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    static IOSDriver driver;

    public static void setDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName("iOS");
        options.setAutomationName("XCUITest");
        options.setUdid("40BCA5BD-9389-4184-8039-633AC3D452D4");
        options.setBundleId("com.saucelabs.SwagLabsMobileApp");
        options.setNoReset(false);
        try {
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static IOSDriver getDriver() {
        return driver;
    }
}
