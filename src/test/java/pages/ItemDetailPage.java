package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDetailPage extends BasePage {

    //add to cart btn
    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartBtn;

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(id = "inline-twister-expanded-dimension-text-color_name")
    public WebElement itemColor;

}
