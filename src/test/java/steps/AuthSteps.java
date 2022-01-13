package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import tasks.PaymentToDifferentUsers;
import ui.LoginPageElements;
import ui.PaymentPageElements;

public class AuthSteps {


    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I login with username company and password company")
    public void i_login_with_username_company_and_password_company() throws InterruptedException {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company","company"));
      //  Thread.sleep(10000);
    }



    @When("I login with username eaa and password eaa")
    public void iLoginWithUsernameEaaAndPasswordEaa() throws InterruptedException {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("eaa","eaa"));
        Thread.sleep(3000);
    }
    @Then("Actor goes to payment page")
    public void actorGoesToPaymentPage() throws InterruptedException {
     actor.attemptsTo(PaymentToDifferentUsers.payment("eren","10","5555555555"));
     actor.attemptsTo(Click.on(PaymentPageElements.SELECT_INDIA),
             Click.on(PaymentPageElements.SEND_BTN),
             Click.on(PaymentPageElements.YES_BTN));
    }

    @Then("you should click close button")
    public void youShouldClickCloseButton() {
        actor.attemptsTo(Click.on(By.id("android:id/button3")));

    }


    @Then("Second Actor make a payment")
    public void secondActorMakeAPayment() {
        actor.attemptsTo(PaymentToDifferentUsers.payment("alp","20","5555512314"));
        actor.attemptsTo(Click.on(PaymentPageElements.SELECT_CANADA),
                Click.on(PaymentPageElements.SEND_BTN),
                Click.on(PaymentPageElements.YES_BTN));

    }

    @Then("Third Actor make a payment")
    public void thirdActorMakeAPayment() {
        actor.attemptsTo(PaymentToDifferentUsers.payment("Bero","30","5562455555"));
        actor.attemptsTo(Click.on(PaymentPageElements.SELECT_USA),
                Click.on(PaymentPageElements.SEND_BTN),
                Click.on(PaymentPageElements.YES_BTN));
    }

    @Then("Logout")
    public void logout() {
        actor.attemptsTo(Click.on(By.id("logoutButton")));
    }
}
