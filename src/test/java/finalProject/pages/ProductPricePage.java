package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPricePage {

    private final By priceOnProductPage = By.cssSelector(".detailed-cart-item__price");
    private final By finalPrice = By.cssSelector(".checkout-order-summary-total__price");

public String getPriceOnProductPage () {
    return $$(priceOnProductPage).get(1).getText();
}

    public String getFinalPrice() {
        return $$(finalPrice).get(0).getText();
        }
}


