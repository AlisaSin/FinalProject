package finalProject.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductFilterPage {

    private final By searchingWindow = By.id("q");
    private final By submitButton = By.xpath("//button [@class='main-search-submit']");
    private final By brandFilter = By.xpath("//a [@class='ks-filter-link']/span[contains(text(), 'Logitech')]");
    private final By sortByButton = By.cssSelector("span[class='select2-selection__rendered']");
    private final By sortByPopularity = By.cssSelector("li[class='select2-results__option select2-results__option--highlighted']");
    private final By firstOption = By.cssSelector("a[class='ks-new-product-name']");
    private final By buttonAddToCart = By.cssSelector("button[id='add_to_cart_btn']");
    @Getter
    private final By priceOnProductPage = By.cssSelector(".detailed-cart-item__price");
    private final By buttonGoToCart = By.cssSelector("a[class='main-button']");


    public void searchingByKeyWords(String keyWords) {
        $(searchingWindow).sendKeys(keyWords);
        $(submitButton).click();
    }

    public void brandChose() {
        $(brandFilter).click();
    }

    public void sortBy() {
        WebElement sorting = $(sortByButton, 1);
        sorting.click();
        $(sortByPopularity).click();
    }


    public void chooseFirstOption() {
        $(firstOption).click();
    }


    public void addToCart(){
        $(buttonAddToCart).click();

    }

    public void goToTheShoppingCart() {
        $(buttonGoToCart).click();
    }


}
