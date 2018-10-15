package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "identifierId")
    WebElement identifierTextfield;

    public void enterIdentifier(String identifier){
        identifierTextfield.sendKeys(identifier);

    }

}
