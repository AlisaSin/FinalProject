package finalProject.steps;

import finalProject.pages.ProductOrderingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductOrderingSteps {

    ProductOrderingPage productOrderingPage = new ProductOrderingPage();
    @When("i press proceed button")
    public void iPressProceedButton() {
        productOrderingPage.pressProceedButton();
    }

    @And("^i fill (.*) $")
    public void iFillEmail(String email) {
        productOrderingPage.fillEmail(email);
    }

    @And("i chose get order in office")
    public void iChoseGetOrderInOffice() {
        productOrderingPage.choseGetOrderInOffice();
    }

    @And("i chose current office")
    public void iChoseCurrentOffice() {
        productOrderingPage.choseCurrentOffice();
    }

    @And("^i fill email (.*) and press submit button$")
    public void iFillEmailAndPressSubmitButton(String email) {
        productOrderingPage.fillEmail(email);
    }

    @Then("^i fill user info name (.*) last name (.*) phone number (.*)$")
    public void iFillUserInfoNameAlisaLastNameTestPhoneNumber(String name, String lastName, String phoneNumber) {
        productOrderingPage.fillUserInfo(name, lastName, phoneNumber);
    }

    @And("i press proceed button two times")
    public void iPressProceedButtonTwoTimes() {
        productOrderingPage.pressProceedButtonAfterFillUserInfo();
        productOrderingPage.pressProceedButtonAfterFillUserInfoSecondTime();
    }

    @And("i chose pay with cash")
    public void iChosePayWithCash() {
        productOrderingPage.chosePayWithCash();
    }

//    @Then("i remember user information in the order")
//    public void iRememberUserInformationInTheOrder() {
//    }
//
//    @And("validate that user information in the order equals user information what i fill")
//    public void validateThatUserInformationInTheOrderEqualsUserInformationWhatIFill() {
//
//    }
//
//    @Then("i remember price")
//    public void iRememberPrice() {
//    }
//
//    @And("validate that price in product info and in cart is the same")
//    public void validateThatPriceInProductInfoAndInCartIsTheSame() {
//    }
}
