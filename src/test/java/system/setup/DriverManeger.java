package system.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManeger {

    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public static WebDriver getDriver(){

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", Constantes.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            driver.get(Constantes.BASE_URL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        return driver;
    }

    public static WebDriverWait getDriverWait(){

        if (driverWait == null) {
            driverWait = new WebDriverWait(driver, 5);
        }

        return driverWait;
    }

    public static void endSession() {

        if (driver != null) {
            driver.quit();
            driver = null;
            driverWait = null;
        }
    }


}
