package finalProject.pages;

import com.codeborne.selenide.Configuration;
import finalProject.model.HomeUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    HomeUrl homeUrl = new HomeUrl();
    private final By acceptCookiesButton = By.xpath("//a[@class='c-button']");

    public void openBaseUrl() {
        open(homeUrl.getBaseUrl());
        Configuration.holdBrowserOpen = true;
    }

    public void pressAcceptCookiesButton() {
        $(acceptCookiesButton).click();
    }

}
