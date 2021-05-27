package system.setup.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import system.setup.Constantes;

public class Base {

    private WebDriver driver;


    public Base(WebDriver driver){
        this.driver = driver;

    }
    public WebDriver chromeDriverConnection(){

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", Constantes.CHROME_DRIVER_PATH);
            System.setProperty("webdriver.chrome.silentOutput", "True");
            driver = new ChromeDriver();
            driver.get("https://shop.samsung.com/br/");
            driver.manage().window().maximize();
        }

        return driver;
//
//        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        return driver;

    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void type(String text , By locator){
        driver.findElement(locator).sendKeys(text);

    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void getUrl(String url){
        driver.get(url);
    }
}
