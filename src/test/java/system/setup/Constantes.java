package system.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Constantes {

    public static final String CHROME_DRIVER_PATH = "src/test/resources/chromedriver.exe";
    public static final String BASE_URL = "https://pt-br.facebook.com/login/web/";
    //public static final String BASE_URL = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";

   /* private WebDriver driver;

    public WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            System.setProperty("webdriver.chrome.silentOutput", "True");
            //Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
            driver = new ChromeDriver();

        }
        return driver;
    }

    public void getUrl(){
        driver.get("https://pt-br.facebook.com/login/web/");
        driver.manage().window().maximize();
    }
    public static WebDriverWait getDriverWait(){
        if (driverWait == null) {
            driverWait = new WebDriverWait(driver, 5);
        }

        return driverWait;
    }

    public void endSession() {
            driver.quit();
    }*/
}


