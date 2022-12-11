package finalProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductOrderingPage {


    private final By proceedButton = By.cssSelector("input[class='main-button cart-main-button']");
    private final By emailWindowForNotUser = By.cssSelector("input[class='users-session-form__input users-session-form__input--text']");
    private final By submitEmailButton = By.cssSelector("input[type='submit']");
    private final By getOrderInOfficeButton = By.cssSelector("input[name='shipping_unused']");
    private final By officeLucavsalaRiga = By.cssSelector("input[name='pickup_point_id']");
    private final By userName = By.cssSelector("input[id='address_first_name']");
    private final By userLastname = By.cssSelector("input[id='address_last_name']");
    private final By userPhoneNumber = By.cssSelector("input[id='address_phone_number']");
    private final By proceedButtonAfterFillUserInfo = By.cssSelector("button[class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");
    private final By proceedButtonAfterFillUserInfo2 = By.cssSelector("button[class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']");
    private final By payWithCashButton = By.cssSelector("input[id='payment_unused_22']");

    UserPage userPage = new UserPage();

    public void pressProceedButton() {
        $(proceedButton).click();
    }

    public void fillEmail(String email) {
        WebElement enterEmail = $$(emailWindowForNotUser).get(1);
        enterEmail.sendKeys(email);
        WebElement submitButton = $$(submitEmailButton).get(1);
        submitButton.submit();
    }

    public void choseGetOrderInOffice() {
        WebElement orderInOffice = $$(getOrderInOfficeButton).get(1);
        orderInOffice.click();
    }

    public void choseCurrentOffice() {
        WebElement currentOffice = $$(officeLucavsalaRiga).get(0);
        currentOffice.click();
    }

    public void fillUserInfo(String name, String lastname, String phoneNumber) {
        $(userName).sendKeys(name);
        $(userLastname).sendKeys(lastname);
        $(userPhoneNumber).sendKeys(phoneNumber);
    }

    public void pressProceedButtonAfterFillUserInfo() {
        $(proceedButtonAfterFillUserInfo).click();
    }

    public void pressProceedButtonAfterFillUserInfoSecondTime() {
        sleep(4000);
        $(proceedButtonAfterFillUserInfo2).click();
    }

    public void chosePayWithCash() {
        $(payWithCashButton).click();
    }

}
