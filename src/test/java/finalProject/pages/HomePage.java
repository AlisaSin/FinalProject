package finalProject.pages;

import com.codeborne.selenide.Configuration;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    @Getter
    private final String baseUrl = "https://www.1a.lv/";
    private final By acceptCookiesButton = By.xpath("//a[@class='c-button']");

    public void openBaseUrl() {
        open(baseUrl);
        Configuration.holdBrowserOpen = true;
    }

    public void pressAcceptCookiesButton() {
        $(acceptCookiesButton).click();
    }

}
