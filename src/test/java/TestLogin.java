import org.junit.Test;

/**
 * Created by vistula on 15.10.2018.
 */
public class TestLogin extends TestBase{
    @Test
    public void shouldLoginToGMail() throws InterruptedException {
        mainPage.goToLogin();
        loginPage.enterIdentifier("asd123");
    }
}
