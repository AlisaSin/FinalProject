package finalProject.pages;

import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$;

@Data
public class UserPage {
    private String name;
    private String lastName;
    private String phoneNumber;
    private final By customerDataInTheOrder = By.cssSelector(".checkout-order-summary__table-shipping-info");


    public String getUserDataInTheOrder() {
        return $$(customerDataInTheOrder).get(0).getText();
    }
    public String getUserDataFormed() {
        return name + " " + lastName +  "\n+371" + phoneNumber;
    }
}
