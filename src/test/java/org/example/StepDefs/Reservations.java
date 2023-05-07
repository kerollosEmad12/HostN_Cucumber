package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_ReservationPage;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;
public class Reservations {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    P04_ReservationPage reservation = new P04_ReservationPage();
    @Given("user go to home page")
    public void step1()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }


    @And("user click on login button")
    public void step2() throws InterruptedException {
        reservation.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter phone number")
    public void step3() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", reservation.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter password")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].value='12345678';", reservation.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user click on signup btn")
    public void step5()
    {
        js.executeScript("arguments[0].click();", reservation.submit);
    }

    @And("user choose district")
    public void step6() throws InterruptedException
    {
        js.executeScript("arguments[0].click();", reservation.selectDist);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.dist);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user choose compound")
    public void step7() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.selectComp);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.Comp);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @When("user choose date from-to")
    public void step8() throws InterruptedException {
        //calendar left month
        js.executeScript("arguments[0].click();", reservation.dateMonth);
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day from
        js.executeScript("arguments[0].click();", reservation.dateDayFrom);
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day to
        js.executeScript("arguments[0].click();", reservation.dateDayTo);
        Thread.sleep(Duration.ofSeconds(1));

        //Apply
        js.executeScript("arguments[0].click();", reservation.apply );
    }

    @And("user click on search button")
    public void step9() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.search );
    }

    @And("user choose unit")
    public void step10() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.view);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.unit);
        Thread.sleep(Duration.ofSeconds(1));

        //click on booking now
        js.executeScript("arguments[0].click();", reservation.book);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user click on I Agree To Cancellation Policy")
    public void step11() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.agree);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("checkout is successfully")
    public void step13() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.check);
        Thread.sleep(Duration.ofSeconds(1));
    }
}
