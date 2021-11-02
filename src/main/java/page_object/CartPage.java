package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static page_object.StaticWebElements.SUCCESS_MESSAGE_ELEMENT;
import static utils.Messages.COUPON_APPLIED_MESSAGE;

public class CartPage extends BasePage {

    private final By couponCodeField = By.id("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");
    private final By couponCodeButton = By.xpath("//tr[contains(@class,'cart-discount')]//a");

    public CartPage applyCouponCode(String couponCode) {
        findElement(couponCodeField).sendKeys(couponCode);
        findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("Message is not correct", findElement(SUCCESS_MESSAGE_ELEMENT).getText(), equalTo(COUPON_APPLIED_MESSAGE));
        return this;
    }

    public void removeCoupon(String coupon) {
        By couponCode = By.xpath("//a[@data-coupon='" + coupon.toLowerCase() + "']");
        WebElement element = findElement(couponCode);
        element.click();
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void removeCoupon() {
        WebElement couponCode = findElement(couponCodeButton);
        couponCode.click();
        wait.until(ExpectedConditions.invisibilityOf(couponCode));
    }
}