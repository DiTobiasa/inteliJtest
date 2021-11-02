import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.LocalDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
    }

    @ParameterizedTest(name = "Buy product with name {0} and apply coupon {1} and then remove it")
    @CsvSource({"Belt,ACODEMY10OFF", "Album, ACODEMY20OFF"})
    public void applyCouponTestandRemoveTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .applyCouponCode(couponCode)
                .removeCoupon(couponCode);
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}

