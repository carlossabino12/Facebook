package system.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends Base {

    private By emailOrTelefone = By.id("email");
    private By password = By.id("pass");
    private By enterBtn = By.xpath("//button[@type='submit']");
    private By userNameTopBar = By.cssSelector("div[aria-label ='Configurações e controles da conta'] > div:last-child > a > span");

    public FacebookLoginPage(WebDriver driver){
        super(driver);

    }

    public void typeEmailOrTelefone(){

        type("dudu",emailOrTelefone);
    }
    public void typePassword(){
        type("dudu",password);
    }
    public void clickEnterBtn(){

        click(enterBtn);
    }
    public void userLogin(){
        type("dudu",emailOrTelefone);
        type("dudu",password);
        click(enterBtn);
    }

    public String usuarioNameTopBar(){
        return chromeDriverConnection().findElement(userNameTopBar).getText();

    }
}
