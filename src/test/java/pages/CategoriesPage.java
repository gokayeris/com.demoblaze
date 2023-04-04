package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utils;

import java.time.Duration;

import static utilities.Utils.*;

public class CategoriesPage {
    private WebDriver lDriver;
    static String textOfProduct;

    public CategoriesPage(WebDriver gDriver) {
        lDriver = gDriver;
    }
    private final By button_laptops = By.xpath("//*[@class = 'list-group-item'][text() = 'Laptops']");
    private final By select_a_laptop = By.xpath("//*[@class= 'card-title'][1]");
    private final By button_addTo_cart = By.xpath("//*[@class = 'btn btn-success btn-lg'][text ()= 'Add to cart']");
    private final By button_cart = By.id("cartur");
    private final By added_laptop_in_cart =By.xpath("//*[@class='success'][1]/*[2]");
    private final By products_contains_text_laptop = By.xpath("(//*[@class='card-text'][contains(text(), 'laptop')]/../*[1]/a)[1]");




    private WebElement getButtonLaptops(){return lDriver.findElement(button_laptops);}
    private WebElement getclickLaptop(){return lDriver.findElement(select_a_laptop);}
    private WebElement getAddToCart(){return lDriver.findElement(button_addTo_cart);}
    private WebElement getButtonCart(){return lDriver.findElement(button_cart);}
    private WebElement getAddedLaptopInCart(){return lDriver.findElement(added_laptop_in_cart);}
    private WebElement getProductsContainsTextLaptop(){return lDriver.findElement(products_contains_text_laptop);}



    public void clickButtonLaptops(){

            WebDriverWait wait = new WebDriverWait(lDriver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'list-group-item'][text() = 'Laptops']")));
            waitVisibilityAndClick(lDriver, button_laptops);
    }
    public void clickLaptop(){
        String url = lDriver.getCurrentUrl();
        String expectedUrl = (url.endsWith("#")) ? url : url.concat("#");
        while (!lDriver.getCurrentUrl().equals(expectedUrl)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
        waitForVisibility(products_contains_text_laptop, 5);
        textOfProduct= getProductsContainsTextLaptop().getText();
//        Assert.assertTrue(textLaptop.contains("laptop") || textLaptop.contains("notebook")||textLaptop.contains("Intel Core"));
//        = Utils.waitForVisibility(select_a_laptop, 4).getAttribute("textContent");
        System.out.println(textOfProduct);
        waitVisibilityAndClick(lDriver, select_a_laptop);

    }
    public void addToCart(){getAddToCart().click();}

    public void verifyAlert(){
        Alert alert = waitAlert(lDriver);
        String alertMessage = alert.getText();
        Assert.assertEquals("Product added.", alertMessage);
        alert.accept();

    }
    public void clickOnButtonCart(){
        getButtonCart().click();
    }

    public void verifyProductAddedOnCart(){
        String textOfAddedProduct = Utils.waitForVisibility(added_laptop_in_cart, 2).getText();
        System.out.println(textOfAddedProduct);
        Assert.assertEquals(textOfProduct, textOfAddedProduct);

    }



}
