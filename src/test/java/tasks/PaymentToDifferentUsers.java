package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.LoginPageElements;
import ui.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaymentToDifferentUsers implements Task {
    private String name="";
    private String amount="";
    private String phone="";

    public PaymentToDifferentUsers(String name, String amount, String phone) {

        this.name = name;
        this.amount = amount;
        this.phone = phone;
    }
    @Override
    @Step("{0} payment with different users")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaymentPageElements.PAYMENT_BUTTON),
                Click.on(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.name).into(PaymentPageElements.NAME_FIELD),
                Click.on(PaymentPageElements.AMOUNT_FIELD),
                SendKeys.of(this.amount).into(PaymentPageElements.AMOUNT_FIELD),
                Click.on(PaymentPageElements.PHONE_FIELD),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_FIELD),
                Click.on(PaymentPageElements.COUNTRY_FIELD)

        );
    }

    public static PaymentToDifferentUsers payment(String name, String amount, String phone){
        return instrumented(PaymentToDifferentUsers.class, name,amount,phone);
    }


}

