package system.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import system.setup.Constantes;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Base {

    private static WebDriver driver;


    public Base(WebDriver driver){
        Base.driver = driver;

    }

    //Método para iniciar o driver
    public static WebDriver chromeDriverConnection(){

        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", Constantes.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            driver.get(Constantes.BASE_URL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return driver;
    }

    //Método para pegar a URL
    public void getUrl(String url){
        driver.get(url);

    }

    //Método para encontrar um elemento por locator
    public WebElement findElement(By locator){

        return driver.findElement(locator);
    }

    //Método para encontrar elementos na lista
    public List<WebElement> findElements(By locator){

        return driver.findElements(locator);

    }

    //Método para pegar um texto de um elemento
    public String getText(WebElement element){

        return element.getText();
    }

    //Método para pegar um texto de um elemento por locator
    public String getText(By locator){

        return driver.findElement(locator).getText();
    }

    //Método para digitar um texto em um elemento
    public void type(String text , By locator){

        driver.findElement(locator).sendKeys(text);

    }

    //Método para clicar em um elemento
    public void click(By locator){

        driver.findElement(locator).click();
    }

    //Método para verificar se o elemento está visivel na página
    public Boolean isDisplayed(By locator){

        try {
            return driver.findElement(locator).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;

        }
    }
    public static void endSession() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
