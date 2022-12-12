package finalProject.attributes;


import finalProject.pages.ProductFilterPage;
import finalProject.pages.ProductOrderingPage;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ProductPriceAttributes {

    ProductOrderingPage productOrderingPage = new ProductOrderingPage();
    ProductFilterPage productFilterPage = new ProductFilterPage();

    private String catalogPrice;
    private String finalPrice;

    public String getPriceOnProductPage() {
        return $(productFilterPage.getPriceOnProductPage(), 1).getText();
    }

    public String getFinalOrderPrice() {

        return $(productOrderingPage.getFinalPrice()).getText();
    }
}


