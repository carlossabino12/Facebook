package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import system.page.FacebookLoginPage;

public class Hooks {



    @Before
    public void inicializar(){
        System.out.println("Inicia driver");
        FacebookLoginPage.chromeDriverConnection();
        //DriverManager.getDriver().manage().window().maximize();

    }
    @After
    public void finalizar(){
        System.out.println("finalizar driver");
        FacebookLoginPage.endSession();

    }
}
