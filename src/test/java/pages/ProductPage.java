package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    //proceed to Checkout
    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    public WebElement proceedCheckoutBtn;

    @FindBy(xpath = "")
    public WebElement productColor;

}
