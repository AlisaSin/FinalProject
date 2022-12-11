package finalProject;

import com.codeborne.selenide.WebDriverRunner;
import finalProject.pages.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class DemoPage {

    HomePage homePage = new HomePage();
    ProductFilterPage productFilterPage = new ProductFilterPage();
    ProductOrderingPage productOrderingPage = new ProductOrderingPage();
    ProductPricePage productPricePage = new ProductPricePage();
    SoftAssertions softAssertions = new SoftAssertions();
    UserPage userPage = new UserPage();


    @Test
    public void testDemoFor1alv() {
        userPage.setName("Alisa");
        userPage.setLastName("Test");
        userPage.setPhoneNumber("22222222");
        homePage.openBaseUrl();
        softAssertions.assertThat(WebDriverRunner.url()).isEqualTo(homePage.getBaseUrl());
        softAssertions.assertAll();
        homePage.pressAcceptCookiesButton();
        productFilterPage.searchingByKeyWords("any");
        productFilterPage.brandChose();
        productFilterPage.sortBy();
        productFilterPage.chooseFirstOption();
        productFilterPage.addToCart();
        String firstPrice = productPricePage.getPriceOnProductPage();
        productFilterPage.goToTheShoppingCart();
        productOrderingPage.pressProceedButton();
        productOrderingPage.fillEmail("testemail@testemail.lv");
        productOrderingPage.choseGetOrderInOffice();
        productOrderingPage.choseCurrentOffice();
        productOrderingPage.fillUserInfo(userPage.getName(), userPage.getLastName(), userPage.getPhoneNumber());
        productOrderingPage.pressProceedButtonAfterFillUserInfo();
        productOrderingPage.pressProceedButtonAfterFillUserInfoSecondTime();
        productOrderingPage.chosePayWithCash();
        productPricePage.getFinalPrice();
        softAssertions.assertThat(firstPrice).isEqualTo(productPricePage.getFinalPrice());
        softAssertions.assertAll();
        userPage.getUserDataInTheOrder();
        softAssertions.assertThat(userPage.getUserDataInTheOrder()).isEqualTo(userPage.getUserDataFormed());
        softAssertions.assertAll();

    }


}
