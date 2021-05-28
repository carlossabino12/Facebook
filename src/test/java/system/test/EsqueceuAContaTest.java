package system.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.page.EsqueceuAContaPage;
import system.page.FacebookLoginPage;
import system.setup.DriverManeger;

public class EsqueceuAContaTest {

    private WebDriver driver;
    private WebDriverWait wait;
    EsqueceuAContaPage esqueceuAContaPage = new EsqueceuAContaPage(driver);
    FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);

    @Test
    public void validarFacebookText(){
        facebookLoginPage.clickEsqueceuAContaLinkBtn();
        String face = esqueceuAContaPage.getEncontreSuaContaText();
        Assertions.assertEquals("Encontre sua conta",face, "O texto está errado");
        DriverManeger.endSession();



    }
}
