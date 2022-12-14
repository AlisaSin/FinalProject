package finalProject.pages;

import com.codeborne.selenide.Condition;
import finalProject.model.ProductPrice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProductOrderingPage {

    ProductPrice productPrice = new ProductPrice();


    private final By proceedButton = By.cssSelector("input[class='main-button cart-main-button']");
    private final By emailWindowForNotUser = By.cssSelector("input[class='users-session-form__input users-session-form__input--text']");
    private final By submitEmailButton = By.cssSelector("input[type='submit']");
    private final By getOrderInOfficeButton = By.cssSelector("input[name='shipping_unused']");
    private final By officeLucavsalaRiga = By.cssSelector("input[name='pickup_point_id']");
    private final By userName = By.cssSelector("input[id='address_first_name']");
    private final By userLastname = By.cssSelector("input[id='address_last_name']");
    private final By userPhoneNumber = By.cssSelector("input[id='address_phone_number']");
    private final By proceedButtonAfterFillUserInfo = By.cssSelector("button[class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");
    private final By customerInfoWindow = By.className("chosen-address");
    private final By payWithCashButton = By.cssSelector("input[id='payment_unused_22']");
    public final By finalPrice = By.className("checkout-order-summary-total__price");
    private final By customerDataInTheOrder = By.className("checkout-order-summary__table-shipping-info");


    public void pressProceedButton() {
        $(proceedButton).click();
    }

    public void fillEmail(String email) {
        WebElement enterEmail = $(emailWindowForNotUser, 1);
        enterEmail.sendKeys(email);
        WebElement submitButton = $(submitEmailButton, 1);
        submitButton.submit();
    }

    public void choseGetOrderInOffice() {
        WebElement orderInOffice = $(getOrderInOfficeButton, 1);
        orderInOffice.click();
    }

    public void choseCurrentOffice() {
        WebElement currentOffice = $(officeLucavsalaRiga, 0);
        currentOffice.click();
    }

    public void fillUserInfo(String name, String lastname, String phoneNumber) {
        $(userName).sendKeys(name);
        $(userLastname).sendKeys(lastname);
        $(userPhoneNumber).sendKeys(phoneNumber);
    }

    public void pressProceedButtonAfterFillUserInfo() {

        $(proceedButtonAfterFillUserInfo).click();
        $(customerInfoWindow).shouldBe(Condition.exist,Duration.ofSeconds(4));
        $(proceedButtonAfterFillUserInfo).click();

    }

    public void chosePayWithCash() {
        $(payWithCashButton).click();
    }
    public String getFinalOrderPrice() {
         productPrice.setFinalPrice($(finalPrice).getText());
        return productPrice.getFinalPrice();
    }
        public String getUserDataInTheOrder() {
        return $(customerDataInTheOrder).getText();
    }

}
