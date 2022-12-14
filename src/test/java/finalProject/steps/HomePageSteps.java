package finalProject.steps;

import com.codeborne.selenide.WebDriverRunner;
import finalProject.model.HomeUrl;
import finalProject.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    HomeUrl homeUrl = new HomeUrl();
    @Given("I open base url")
    public void iOpenBaseUrl() {
        homePage.openBaseUrl();
    }
    @When("I validate that page is loaded")
    public void iValidateThatPageIsLoaded() {
        homeUrl.getBaseUrl().equals(WebDriverRunner.url());
    }
    @When("I press accept cookies button")
    public void iPressAcceptCookiesButton() {
        homePage.pressAcceptCookiesButton();
    }

}
