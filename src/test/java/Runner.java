import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.annotations.events.BeforeExample;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //tags ="@seach_film"
        tags ="@payment_the_different_client"
)

public class Runner {
    static AppiumDriverLocalService appiumService = null;

    @BeforeClass
    public static void startAppiumServer() throws IOException {
       appiumService = AppiumDriverLocalService.buildDefaultService();
   appiumService.start();
    }

    @AfterClass
    public static void stopAppiumServer() throws InterruptedException {
        Thread.sleep(10000);
     //   appiumService.stop();
    }

}
