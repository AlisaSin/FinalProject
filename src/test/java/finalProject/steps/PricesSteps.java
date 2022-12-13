package finalProject.steps;

import finalProject.model.ProductPrice;
import finalProject.pages.ProductFilterPage;
import finalProject.pages.ProductOrderingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PricesSteps {

    ProductPrice productPrice = new ProductPrice();
    ProductFilterPage productFilterPage = new ProductFilterPage();
    ProductOrderingPage productOrderingPage = new ProductOrderingPage();

    @And("I get price of this product")
    public String iRememberPriceOfThisProduct() {
        productPrice.setCatalogPrice(productFilterPage.getPriceOnProductPage());
        return productPrice.getCatalogPrice();
    }
    @Then("I remember final product price")
    public String iRememberFinalProductPrice() {
        productPrice.setFinalPrice(productOrderingPage.getFinalOrderPrice());
        return productPrice.getFinalPrice();    }

    @And("Validate that price in product info and in cart is the same")
    public void validateThatPriceInProductInfoAndInCartIsTheSame() {
        assertEquals(productPrice.getFinalPrice(), productPrice.getCatalogPrice());
    }
}
