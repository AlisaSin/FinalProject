package finalProject.steps;

import finalProject.attributes.ProductPriceAttributes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPricePageSteps {
    ProductPriceAttributes productPriceAttributes = new ProductPriceAttributes();

    @And("I remember price of this product")
    public void iRememberPriceOfThisProduct() {
        productPriceAttributes.setCatalogPrice(productPriceAttributes.getPriceOnProductPage());
    }

    @Then("I remember final product price")
    public void iRememberFinalProductPrice() {
        productPriceAttributes.setFinalPrice(productPriceAttributes.getFinalOrderPrice());
    }

    @And("Validate that price in product info and in cart is the same")
    public void validateThatPriceInProductInfoAndInCartIsTheSame() {
        assertEquals(productPriceAttributes.getFinalPrice(), productPriceAttributes.getCatalogPrice());

    }
}
