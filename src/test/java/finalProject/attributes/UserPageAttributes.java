package finalProject.attributes;

import finalProject.pages.ProductOrderingPage;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;


@Data
public class UserPageAttributes {

    ProductOrderingPage productOrderingPage = new ProductOrderingPage();
    private  String name;
    private  String lastName;
    private  String phoneNumber;

    public String getUserDataInTheOrder() {
        return $(productOrderingPage.getCustomerDataInTheOrder()).getText();
    }
    public String getUserDataFormed() {
        return getName() + " " + getLastName() +  "\n+371" + getPhoneNumber();
    }
}
