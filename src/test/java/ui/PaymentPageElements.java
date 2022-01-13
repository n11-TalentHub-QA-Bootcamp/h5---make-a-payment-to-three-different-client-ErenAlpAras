package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElements {
    public static Target NAME_FIELD = Target.the("NAME field")
            .located(By.id("nameTextField"));

    public static Target AMOUNT_FIELD = Target.the("AMOUNT field")
            .located(By.id("amountTextField"));
    public static Target PHONE_FIELD = Target.the("PHONE field")
            .located(By.id("phoneTextField"));
    public static Target COUNTRY_FIELD = Target.the("Country field").located(By.id("countryButton"));
    public static Target SELECT_INDIA= Target.the("INDIA field").located(By.xpath("//*[@text='India']"));
    public static Target SELECT_CANADA= Target.the("CANADA field").located(By.xpath("//*[@text='Canada']"));
    public static Target SELECT_USA= Target.the("USA field").located(By.xpath("//*[@text='USA']"));
    public static Target PAYMENT_BUTTON = Target.the("Payment Button").located(By.id("makePaymentButton"));
    public static Target SEND_BTN = Target.the("SEND Button").located(By.id("sendPaymentButton"));
    public static Target YES_BTN = Target.the("Yes Button").located(By.id("android:id/button1"));

}
