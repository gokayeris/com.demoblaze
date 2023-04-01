package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.HomePage;
import utilities.Driver;

public class HomeStep {

    HomePage homePage = new HomePage(Driver.getDriver());

    @Given("User gets the url")
    public void userGetsUrl() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
    }
    @And("User verifies on singup popup appeared")
    public void userVerifiesSingupPage() {
        //Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.demoblaze.com/index.html");
        homePage.verifySignupPopup();
    }
    @When("User enters username (.*) on signup")
    public void user_enters_username(String string) { homePage.sendTextUsername(string);  }
    @When("User enters password (.*) on signup")
    public void user_enters_password(String string) {
        homePage.sendTextPassword(string);
    }
    @When("User clicks on login button  on home page")
    public void user_clicks_on_login_button() { homePage.clickButtonLoginHome();   }
    @Then("User verifies sings up successfully")
    public void user_verifies_sings_up_successfully() {
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertMessage = alert.getText();
        Assert.assertEquals("Sign up successful.", alertMessage);
        alert.accept();
    }

    @Then("User clicks on singup button on home page")
    public void userClicksOnSingupButton() {
        homePage.clickButtonHomeSignin();
    }

    @And("User clicks on signup button for regsiter")
    public void userClicksOnSignupButton() { homePage.clickSignupRegButton();   }

    @And("User verifies on login popup appeared")
    public void userVerifiesLoginPopup() {
        //Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.demoblaze.com/index.html");
        homePage.verifyPopupLogin();
    }
    @When("User enters username (.*) on login.")
    public void LoginEntersUsername(String string) { homePage.sendTextLoginUsername(string);  }
    @When("User enters password (.*) on login.")
    public void LoginEntersPassword(String string) {
        homePage.sendTextLoginPassword(string);
    }
    @And("User clicks on login button on login popup")
    public void ClicksOnButtonLoginPopup() { homePage.clickButtonLoginPopup();   }
    @Then("User verifies logged in successfully")
    public void verifyLoggedin() { homePage.verifyloggedin(); }
    @When("User logs out")
    public void userLogsOut() {homePage.logOut();
    }


    @Then("User verifies logged out successfully")
    public void userVerifiesLoggedOutSuccessfully() { homePage.verifyLoggedOut();  }
}
