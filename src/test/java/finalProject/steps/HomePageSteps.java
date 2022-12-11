package finalProject.steps;

import com.codeborne.selenide.WebDriverRunner;
import finalProject.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    HomePage homePage = new HomePage();
    @Given("i open base url")
    public void iOpenBaseUrl() {
        homePage.openBaseUrl();
    }
    @When("i validate that page is loaded")
    public void iValidateThatPageIsLoaded() {
        homePage.getBaseUrl().equals(WebDriverRunner.url());
    }
    @When("i press accept cookies button")
    public void iPressAcceptCookiesButton() {
        homePage.pressAcceptCookiesButton();
    }

}
