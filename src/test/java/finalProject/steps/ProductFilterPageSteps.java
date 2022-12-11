package finalProject.steps;

import finalProject.pages.ProductFilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductFilterPageSteps {
    ProductFilterPage productFilterPage = new ProductFilterPage();

    @When("^i fill key word (.*) and i press submit button$")
    public void iFillKeyWordAnyAndIPressSubmitButton(String keyWords) {
        productFilterPage.searchingByKeyWords(keyWords);
    }


    @And("i chose product brand")
    public void iChoseProductBrand() {
        productFilterPage.brandChose();
    }

    @And("i choose filter most popular")
    public void iChooseFilterMostPopular() {
        productFilterPage.sortBy();
    }

    @And("i choose first product")
    public void iChooseFirstProduct() {
        productFilterPage.chooseFirstOption();
    }

//    @And("i remember price of this product")
//    public void iRememberPriceOfThisProduct() {
//    }

    @And("i add this product to cart")
    public void iAddThisProductToCart() {
        productFilterPage.addToCart();
    }

    @And("i go to the shopping cart")
    public void iGoToTheShoppingCart() {
        productFilterPage.goToTheShoppingCart();
    }


}
