import org.junit.Test;

public class TestSearch extends TestBase {

    @Test
    public void shouldSearchForCatImages(){
        mainPage.searchForText("dogs");
        searchResultsPage.goToImages();
        imagesResultsPage.clickOnImageResultNumber(1);
    }

    @Test
    public void shouldUseLuckyGuessOption(){
        mainPage.useLuckyGuess();
        System.out.println(driver.getCurrentUrl());
        assert driver.getCurrentUrl().contains("doodles");
    }

}
