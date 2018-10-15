import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleMainPage;
import pages.ImagesResultsPage;
import pages.LoginPage;
import pages.SearchResultsPage;

public class TestBase {
    WebDriver driver;
    String BASE_URL = "https://google.com";
    GoogleMainPage mainPage;
    SearchResultsPage searchResultsPage;
    ImagesResultsPage imagesResultsPage;
    LoginPage loginPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        mainPage  = PageFactory.initElements(driver, GoogleMainPage.class);
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        imagesResultsPage = PageFactory.initElements(driver, ImagesResultsPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.get(BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
