package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesResultsPage {
    @FindBy(xpath = "//div[@id='rg_s']/div")
    List<WebElement> imageContainers;

    public Integer countImages(){
        return imageContainers.size();
    }

    public void clickOnImageResultNumber(Integer numberOfResult){
        imageContainers.get(numberOfResult).click();
    }
}
