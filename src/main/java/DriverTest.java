import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {

    WebDriver driver;

        //загрузка драйвера
    @BeforeEach

    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();

    }

    //заход на страницу
    @Test

    public void driverTest(){
        driver.get("https://shop.acodemy.lv");
    }

    //закрытие страницы
    @AfterEach

    public void afterTest() {
        driver.quit();
    }
}
