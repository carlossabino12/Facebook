package system.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.page.FacebookLoginPage;
import system.setup.DriverManeger;

public class FacebookLoginTest{

        private WebDriver driver;
        private WebDriverWait wait;
        FacebookLoginPage facebookLoginPage;

        @Test
        public void login () {
           DriverManeger.getDriver();
           facebookLoginPage = new FacebookLoginPage(driver);
           facebookLoginPage.typeEmailOrTelefone();
           facebookLoginPage.typePassword();
           facebookLoginPage.clickEnterBtn();
           DriverManeger.endSession();

        }

    @Test
    public void clicarEsqueceuAConta () {
        DriverManeger.getDriver();
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickEsqueceuAContaLinkBtn();
        DriverManeger.endSession();

    }

    @Test
    public void clicarCriarUmaNovaConta () {
        DriverManeger.getDriver();
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.clickCriarUmaNovaContaBtn();
        DriverManeger.endSession();

    }

}
