package finalProject.steps;

import finalProject.model.ProductPrice;
import finalProject.pages.ProductFilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lombok.Data;

@Data
public class ProductFilterPageSteps {
    ProductFilterPage productFilterPage = new ProductFilterPage();
    @When("^I fill key word (.*) and i press submit button$")
    public void iFillKeyWordAnyAndIPressSubmitButton(String keyWords) {
        productFilterPage.searchingByKeyWords(keyWords);
    }
    @And("I chose product brand logitech")
    public void iChoseProductBrand() {
        productFilterPage.brandChose();
    }

    @And("I choose filter most popular")
    public void iChooseFilterMostPopular() {
        productFilterPage.sortBy();
    }
    @And("I choose product computer mouse Logitech MX Anywhere 3 pink")
    public void iChooseFirstProduct() {
        productFilterPage.chooseFirstOption();
    }

    @And("I add this product to cart")
    public void iAddThisProductToCart() {
        productFilterPage.addToCart();
    }

    @And("I go to the shopping cart")
    public void iGoToTheShoppingCart() {
        productFilterPage.goToTheShoppingCart();
    }


    }

