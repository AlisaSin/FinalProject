package finalProject.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductPricePage {
    finalProject.pages.ProductPricePage productPricePage = new finalProject.pages.ProductPricePage();

    @And("i remember price of this product")
    public void iRememberPriceOfThisProduct() {
        productPricePage.getPriceOnProductPage();
    }

    @Then("i remember final product price")
    public void iRememberFinalProductPrice() {
        productPricePage.getFinalPrice();
    }

    @And("validate that price in product info and in cart is the same")
    public void validateThatPriceInProductInfoAndInCartIsTheSame() {
        productPricePage.getFinalPrice().equals(productPricePage.getPriceOnProductPage());
    }
}
