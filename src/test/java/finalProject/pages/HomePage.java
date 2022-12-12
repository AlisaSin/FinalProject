package finalProject.pages;

import com.codeborne.selenide.Configuration;
import finalProject.attributes.HomePageAttributes;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    HomePageAttributes homePageAttributes = new HomePageAttributes();
    private final By acceptCookiesButton = By.xpath("//a[@class='c-button']");

    public void openBaseUrl() {
        open(homePageAttributes.getBaseUrl());
        Configuration.holdBrowserOpen = true;
    }

    public void pressAcceptCookiesButton() {
        $(acceptCookiesButton).click();
    }

}
