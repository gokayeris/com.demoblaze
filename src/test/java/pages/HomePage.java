package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver lDriver;

    public HomePage(WebDriver gDriver) {
        lDriver = gDriver;
    }
    private final By button_home_signup = By.id("signin2");
    private final By sign_username = By.id("sign-username");
    private final By sign_password = By.id("sign-password");
    private final By signup_popup = By.id("signInModalLabel");
    private final By button_signup_register = By.xpath("//*[@class = 'modal-footer']//*[text() = 'Sign up']");
    private final By button_home_login= By.id("login2");
    private final By popup_login = By.id("logInModalLabel");
    private final By login_username = By.id("loginusername");
    private final By login_password = By.id("loginpassword");
    private final By button_login_popup = By.xpath("//*[@class = 'modal-footer']//*[text() = 'Log in']");
    private final By button_home_logout = By.id("logout2");




    private WebElement getSignupUsername(){
        return lDriver.findElement(sign_username);
    }
    private WebElement getSignupPassword(){
        return lDriver.findElement(sign_password);
    }
    private WebElement getButtonHomeSignup(){ return lDriver.findElement(button_home_signup);  }
    private WebElement getSignupPopup(){
        return lDriver.findElement(signup_popup);
    }
    private WebElement getSignupRegButton(){ return lDriver.findElement(button_signup_register);  }
    private WebElement getButtonLoginHome(){ return lDriver.findElement(button_home_login);}
    private WebElement getPopupLogin(){ return lDriver.findElement(popup_login);}
    private WebElement getLoginUsername(){ return lDriver.findElement(login_username);    }
    private WebElement getLoginPassword(){
        return lDriver.findElement(login_password);
    }
    private WebElement getButtonLoginPopup(){
        return lDriver.findElement(button_login_popup);
    }
    private WebElement getButtonHomeLogout(){ return lDriver.findElement(button_home_logout);}







    public void clickButtonHomeSignin() {
        getButtonHomeSignup().click();
    }
    public void sendTextUsername(String username){
        getSignupUsername().sendKeys(username);
    }
    public void sendTextPassword(String password){

        getSignupPassword().sendKeys(password);
    }

    public void clickButtonLoginHome()  {
        getButtonLoginHome().click();
    }
    public void verifySignupPopup(){

        getSignupPopup().isDisplayed();
    }
    public void clickSignupRegButton(){
        getSignupRegButton().click();
    }
    public void verifyPopupLogin(){

        getPopupLogin().isDisplayed();
    }
    public void sendTextLoginUsername(String username){
        getLoginUsername().sendKeys(username);  }
    public void sendTextLoginPassword(String password){

        getLoginPassword().sendKeys(password);
    }
    public void clickButtonLoginPopup(){
        getButtonLoginPopup().click();
    }
    public void verifyloggedin(){
        getButtonHomeLogout().isDisplayed();
    }
    public void logOut(){
        getButtonHomeLogout().click();}

    public void verifyLoggedOut()  {
        getButtonLoginHome().isDisplayed();
    }



}