package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import system.page.Base;
import system.page.FacebookLoginPage;
import system.setup.Constantes;

public class FacebookLoginTest{

        WebDriver driver;
        FacebookLoginPage facebookLoginPage;

       @BeforeEach
        public void setup(){
    	   System.out.println("TESTE");
    	   driver = Base.chromeDriverConnection();
    	   facebookLoginPage = new FacebookLoginPage(driver);
    	   facebookLoginPage.getUrl(Constantes.BASE_URL);
        }

        @Test
        public void login () {
             System.out.println("driver"+ driver);
             facebookLoginPage.userLogin();

        }
        @AfterEach
        public void quit () {
        	System.out.println("DEU CERTO!");
            driver.quit();
        }
}
