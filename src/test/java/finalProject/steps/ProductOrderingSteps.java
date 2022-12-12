package finalProject.steps;

import finalProject.attributes.ProductPriceAttributes;
import finalProject.attributes.UserPageAttributes;
import finalProject.pages.ProductOrderingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOrderingSteps {

    ProductOrderingPage productOrderingPage = new ProductOrderingPage();
    UserPageAttributes userPageAttributes = new UserPageAttributes();
    @When("I press proceed button")
    public void iPressProceedButton() {
        productOrderingPage.pressProceedButton();
    }

    @And("^I fill (.*) $")
    public void iFillEmail(String email) {
        productOrderingPage.fillEmail(email);
    }

    @And("I chose get order in office")
    public void iChoseGetOrderInOffice() {
        productOrderingPage.choseGetOrderInOffice();
    }

    @And("I chose current office")
    public void iChoseCurrentOffice() {
        productOrderingPage.choseCurrentOffice();
    }

    @And("^I fill email (.*) and press submit button$")
    public void iFillEmailAndPressSubmitButton(String email) {
        productOrderingPage.fillEmail(email);
    }

    @Then("^I fill user info name (.*) last name (.*) phone number (.*)$")
    public void iFillUserInfoNameAlisaLastNameTestPhoneNumber(String name, String lastName, String phoneNumber) {
        productOrderingPage.fillUserInfo(name, lastName, phoneNumber);
        userPageAttributes.setName(name);
        userPageAttributes.setLastName(lastName);
        userPageAttributes.setPhoneNumber(phoneNumber);
    }

    @And("I press proceed button two times")
    public void iPressProceedButtonTwoTimes() {
        productOrderingPage.pressProceedButtonAfterFillUserInfo();
    }

    @And("I chose pay with cash")
    public void iChosePayWithCash() {
        productOrderingPage.chosePayWithCash();
    }
    @Then("I remember user information in the order")
    public void iRememberUserInformationInTheOrder() {
        userPageAttributes.getUserDataInTheOrder();
    }

    @And("Validate that user information in the order equals user information what i fill")
    public void validateThatUserInformationInTheOrderEqualsUserInformationWhatIFill() {
        assertEquals(userPageAttributes.getUserDataFormed(), userPageAttributes.getUserDataInTheOrder());
    }

    }

