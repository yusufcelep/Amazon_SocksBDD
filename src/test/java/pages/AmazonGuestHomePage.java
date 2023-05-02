package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonGuestHomePage extends BasePage {

//    @FindBy(id = "nav-link-accountList-nav-line-1")
//    public WebElement signInBtn;
//
//    @FindBy(id = "ap_email")
//    public WebElement userNameInputBox;
//    //ap_email
//
//    @FindBy(id = "continue")
//    public WebElement continueBtn;
//    //ap_email
//
//    @FindBy(id = "ap_password")
//    public WebElement   passwordInputBox;
//
//    @FindBy(id = "signInSubmit")
//    public WebElement   signInBtn;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement   searchBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement   searchBtn;

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-tall-aspect'][1]")
    public WebElement   firstItemTile;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement   searchResult;

    @FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'][1]")
    public WebElement   productName;

}
