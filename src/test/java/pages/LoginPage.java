package pages;

import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;
import utilities.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    IOSDriver driver;
    ReusableMethods methods;
    public LoginPage(IOSDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By loginButton = By.name("test-LOGIN");
    By usernameBox = By.name("test-Username");
    By passwordBox = By.name("test-Password");
    By logo = By.name("assets/src/img/swag-labs-logo.png");
    By icon = By.name("assets/src/img/login-bot.png");
    By usernameErrorMessage = By.name("Username is required");
    By passwordErrorMessage = By.name("Password is required");
    By errorMessageGenel = By.name("Username and password do not match any user in this service.");

    public void checkLoginButton(String str){
        Assert.assertEquals(methods.getText(loginButton), str);
    }
    public void checkUsernameBox(String str){
        Assert.assertEquals(methods.getText(usernameBox), str);
    }
    public void checkPasswordBox(String str){
        Assert.assertEquals(methods.getText(passwordBox), str);
    }
    public void clickLoginButton(){
        methods.click(loginButton);
    }
    public void checkLoginPage(){
        methods.checkElement(loginButton);
    }
    public void checkLogo(){
        methods.checkElement(logo);
    }
    public void checkIcon(){
        methods.checkElement(icon);
    }
    public void sendKeyPasswordText(String str){
        methods.sendKeys(passwordBox, str);
    }
    public void senkeysUsernameText(String str){
        methods.sendKeys(usernameBox, str);
    }
    public void checkErrorMessageGenel(String str){
        Assert.assertEquals(methods.getText(errorMessageGenel), str);
    }
    public void checkUsernameErrorMessage(String str){
        Assert.assertEquals(methods.getText(usernameErrorMessage), str);
    }
    public void checkPasswordErrorMessage(String str){
        Assert.assertEquals(methods.getText(passwordErrorMessage), str);
    }

}
