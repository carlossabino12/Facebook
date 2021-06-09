package system.stepDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import system.page.Base;
import system.page.FacebookLoginPage;

public class userLogin {

    FacebookLoginPage facebookLoginPage = new FacebookLoginPage(Base.chromeDriverConnection());

    @Dado("o usuário acessa o site")
    public void oUsuárioAcessaOSite() {
        FacebookLoginPage.chromeDriverConnection();
    }
    @Quando("o usuário digita o {string}")
    public void oUsuárioDigitaO(String string) {
       facebookLoginPage.typeEmailOrTelefone();
    }
    @E("o usuário informa a {string}")
    public void oUsuárioInformaA(String string) {
        facebookLoginPage.typePassword();
    }
    @E("o usuário clica no botão {string}")
    public void oUsuárioClicaNoBotão(String string) {
        facebookLoginPage.clickEnterBtn();
    }
    @Entao("o usuário pode ver a página inicial do seu Facebook")
    public void oUsuárioPodeVerAPáginaInicialDoSeuFacebook() {
        String faceSearch = facebookLoginPage.usuarioNameTopBar();
        Assertions.assertEquals("Carlos",faceSearch,"O texto não está igual");

    }




}
