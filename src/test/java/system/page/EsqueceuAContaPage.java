package system.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.setup.DriverManeger;

public class EsqueceuAContaPage{

    private WebDriver driver;

    private By encontreASuacontaText = By.cssSelector(".clearfix.uiHeaderTop > div:nth-child(2) > h2");
    private By insiraSeuEmailtext = By.cssSelector("tbody > tr:first-child > td:nth-child(2) > div");
    private By btnCancel = By.cssSelector("//a[text()='Cancelar']");
    private By btnPesquisar = By.cssSelector("//button[text()='Pesquisar']");
    private By inputEmailOuTelefone = By.cssSelector("input[placeholder='Email ou telefone']");
    private By inputSenha = By.cssSelector("input[placeholder='Senha']");
    private By inputNumeroCelular = By.cssSelector("input[placeholder='Número de celular']");
    private By enterBtn = By.cssSelector("div[aria-label='Accessible login button']");
    private By esqueceuAContaLinkText = By.linkText("Esqueceu a conta?");
    private By facebookLinkText = By.linkText("Facebook");

    //Insira seu email ou número de celular para procurar a sua conta.

    public EsqueceuAContaPage(WebDriver driver){
        this.driver = DriverManeger.getDriver();
    }

    public void getFacebookText(){
        driver.findElement(facebookLinkText).getText();
    }

    public String getEncontreSuaContaText(){
        return driver.findElement(encontreASuacontaText).getText();
    }

    public void getInsiraSeuEmailOuTelefoneText(){
        driver.findElement(insiraSeuEmailtext).getText();
    }

    public void inputNumeroCelular(){
        driver.findElement(inputNumeroCelular).sendKeys("123456789");
    }

    public void inputEmailOrTelefone(){
        driver.findElement(inputEmailOuTelefone).sendKeys("carlo@gmail.com");
    }

    public void inputSenha(){
        driver.findElement(inputSenha).sendKeys("12345");
    }

    public void clickCancelBtn(){
        driver.findElement(btnCancel).click();
    }

    public void clickPesquisarBtn(){
        driver.findElement(btnPesquisar).click();
    }

    public void clickEnterBtn(){
        driver.findElement(enterBtn).click();
    }

    public void clickEesqueceuSenhaLink(){
        driver.findElement(esqueceuAContaLinkText).click();
    }

    public void clickFacebookLink(){
        driver.findElement(facebookLinkText).click();
    }

}
