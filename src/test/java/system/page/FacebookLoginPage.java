package system.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.setup.DriverManeger;

public class FacebookLoginPage{

    private WebDriver driver;

    private By facebookTitleLoginPage = By.cssSelector("#globalContainer > div > div > div > img[alt='Facebook']");
    private By entrarNoFacebookText = By.xpath("//div[text()='Entrar no Facebook']");
    private By esqueceuAContaLinkbtn = By.linkText("Esqueceu a conta?");
    private By outext = By.className("._1rf8");
    private By criarUmaNovaContaBtn = By.cssSelector("#login_link > div:nth-child(3) > a");
    private By mostrarSenha = By.id("u_0_c_Xw");
    private By emailOrTelefone = By.id("email");
    private By password = By.id("pass");
    private By enterBtn = By.id("loginbutton");

    public FacebookLoginPage(WebDriver driver){
        this.driver = DriverManeger.getDriver();

    }

    public void typeEmailOrTelefone(){
        driver.findElement(emailOrTelefone).sendKeys("dudu");

    }
    public void typePassword(){
        driver.findElement(password).sendKeys("dudu");

    }
    public void clickEnterBtn(){
        driver.findElement(enterBtn).click();
    }

    public void clickEsqueceuAContaLinkBtn(){
        driver.findElement(esqueceuAContaLinkbtn).click();
    }

    public void clickCriarUmaNovaContaBtn(){
        driver.findElement(criarUmaNovaContaBtn).click();
    }

    public void login(){
        driver.findElement(emailOrTelefone).sendKeys("dudu");
        driver.findElement(password).sendKeys("dudu");
        driver.findElement(enterBtn).click();
    }
}
