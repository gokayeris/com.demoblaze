package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPage {
    private WebDriver lDriver;

    public CategoriesPage(WebDriver gDriver) {
        lDriver = gDriver;
    }
    private final By button_laptops = By.xpath("//*[@class = 'list-group']//*[text() = 'Laptops']");
    private final By link_sony_vaio_i5 = By.xpath("//*[@class = 'hrefch'][text ()= 'Sony vaio i5']");
    private final By button_addTo_cart = By.xpath("//*[@class = 'btn btn-success btn-lg'][text ()= 'Add to cart']");



    private WebElement getButtonLaptops(){return lDriver.findElement(button_laptops);}
    private WebElement getclickLaptop(){return lDriver.findElement(link_sony_vaio_i5);}
    private WebElement getAddToCart(){return lDriver.findElement(button_addTo_cart);}



    public void clickButtonLaptops(){getButtonLaptops().click();}
    public void clickLaptop(){getclickLaptop();}
    public void addToCart(){getAddToCart();}


}
