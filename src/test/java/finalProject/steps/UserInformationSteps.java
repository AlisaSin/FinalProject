package finalProject.steps;

import finalProject.pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserInformationSteps {
    UserPage userPage = new UserPage();
    @Then("i remember user information in the order")
    public void iRememberUserInformationInTheOrder() {
        userPage.getUserDataInTheOrder();
    }

    @And("validate that user information in the order equals user information what i fill")
    public void validateThatUserInformationInTheOrderEqualsUserInformationWhatIFill() {
        userPage.getUserDataFormed().equals(userPage.getUserDataInTheOrder());
    }
}
