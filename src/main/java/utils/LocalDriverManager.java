package utils;

import exceptions.UnsupportedDriverException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if(driver == null) {
            driver = configureDriver();
        }
        return driver;
    }

    public static WebDriver configureDriver() {
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                chromeOptions.merge(capabilities);
                return new ChromeDriver(chromeOptions);
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                return new FirefoxDriver();
            default: throw new UnsupportedDriverException("Following browser is not supported: " + browser);
        }
    }

    public static DesiredCapabilities setUpCapabilities() {
        // example of how manage your code better
        return new DesiredCapabilities();
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}