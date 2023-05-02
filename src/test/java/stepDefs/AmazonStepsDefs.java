package stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.AmazonGuestHomePage;
import pages.ItemDetailPage;
import pages.ProductPage;
import utils.ConfigurationReader;
import utils.Driver;

public class AmazonStepsDefs {

    AmazonGuestHomePage amazonGuestHomePage = new AmazonGuestHomePage();
    ItemDetailPage itemDetailPage = new ItemDetailPage();
    ProductPage productPage = new ProductPage();

    @Given("Guest user is on the Amazon HomePage")
    public void guest_user_is_on_the_Amazon_HomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Assert.assertEquals("Amazon.com. Spend less. Smile more.",Driver.getDriver().getTitle());
    }

    @When("Search for {string}")
    public void search_for(String product) {
        amazonGuestHomePage.searchBox.click();
        amazonGuestHomePage.searchBox.sendKeys(product);
        amazonGuestHomePage.searchBtn.click();

        Assert.assertEquals(product,amazonGuestHomePage.searchResult.getText().replace("\"",""));
    }

    @When("Click on first item tile")
    public void click_on_first_item_tile() {
        amazonGuestHomePage.firstItemTile.click();
    }

    @When("Add item into cart")
    public void add_item_into_cart() {
        itemDetailPage.addToCartBtn.click();
    }

    @Then("Proceed to check out")
    public void proceed_to_check_out() throws InterruptedException {
        //Assert.assertEquals(itemDetailPage.itemColor.getText(),productPage.productColor.getText());
        productPage.proceedCheckoutBtn.click();
    }
}
