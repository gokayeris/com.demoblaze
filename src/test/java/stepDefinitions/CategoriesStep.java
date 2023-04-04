package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoriesPage;
import utilities.Driver;

public class CategoriesStep {


    CategoriesPage categoriesPage = new CategoriesPage(Driver.getDriver());

    @When("User clicks on Laptops button")
    public void userClicksOnLaptopsButton() { categoriesPage.clickButtonLaptops();
    }

    @And("User chooses a laptop")
    public void userChoosesLaptop() { categoriesPage.clickLaptop();
    }

    @And("User adds it to cart")
    public void userAddsItToCart() {
        categoriesPage.addToCart();
        categoriesPage.verifyAlert();
    }
    @Then ("User clicks on Cart menu")
    public void userClicksOnCartMenu(){
        categoriesPage.clickOnButtonCart();
    }

    @And("User verifies the laptop added to cart")
    public void userVerifiesTheLaptopAddedToCart() {
        categoriesPage.verifyProductAddedOnCart();

    }


}
