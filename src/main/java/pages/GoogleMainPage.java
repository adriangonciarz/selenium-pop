package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage {
    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(name = "btnI")
    WebElement luckyGuess;

    @FindBy(id = "gb_70")
    WebElement loginButton;

    public void searchForText(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
    }

    public void useLuckyGuess(){
        luckyGuess.click();
    }

    public void goToLogin(){
        loginButton.click();
    }

}
