package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_ReservationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;
public class Reservations {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    P04_ReservationPage reservation = new P04_ReservationPage();

    Actions action = new Actions(driver);
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
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.submit);
        Thread.sleep(Duration.ofSeconds(1));
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
        action.moveToElement(reservation.dateDayFrom).perform();
        action.click(reservation.dateDayFrom).perform();
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day to
        action.moveToElement(reservation.dateDayTo).perform();
        action.click(reservation.dateDayTo).perform();
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

    @Given("User go to home page")
    public void step14()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User click on login button")
    public void step15() throws InterruptedException {
        reservation.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter phone number")
    public void step16() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", reservation.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter password")
    public void step17() throws InterruptedException {
        js.executeScript("arguments[0].value='12345678';", reservation.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User click on signup btn")
    public void step18() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.submit);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User choose district")
    public void step19() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.selectDist);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.dist);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User choose compound")
    public void step20() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.selectComp);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.Comp);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @When("user choose one day date from-to")
    public void step21() throws InterruptedException {
        //calendar left month
        js.executeScript("arguments[0].click();", reservation.dateMonth);
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day from
        action.moveToElement(reservation.dateDayFrom).perform();
        action.click(reservation.dateDayFrom).perform();
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day to
        action.moveToElement(reservation.dateDayTo).perform();
        action.click(reservation.dateDayTo).perform();
        Thread.sleep(Duration.ofSeconds(1));

        //Apply
        js.executeScript("arguments[0].click();", reservation.apply );
    }

    @And("User click on search button")
    public void step22() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.search );
    }

    @And("User choose unit")
    public void step23() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.view);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.unit);
        Thread.sleep(Duration.ofSeconds(1));

        //click on booking now
        js.executeScript("arguments[0].click();", reservation.book);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User click on I Agree To Cancellation Policy")
    public void step24() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.agree);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Checkout is successfully")
    public void step25() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.check);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Given("User Go to home page")
    public void step26()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User Click on login button")
    public void step27() throws InterruptedException {
        reservation.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User Enter phone number")
    public void step28() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", reservation.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User Enter password")
    public void step29() throws InterruptedException {
        js.executeScript("arguments[0].value='12345678';", reservation.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User Click on signup btn")
    public void step30() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.submit);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Choose district")
    public void step31() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.selectDist);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.dist);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Choose compound")
    public void step32() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.selectComp);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.Comp);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @When("user choose the same date from-to")
    public void step33() throws InterruptedException {
        //calendar left month
        js.executeScript("arguments[0].click();", reservation.dateMonth);
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day from
        action.moveToElement(reservation.dateDayFrom).perform();
        action.click(reservation.dateDayFrom).perform();
        Thread.sleep(Duration.ofSeconds(1));

        //calendar left day to
        action.moveToElement(reservation.dateDayTo).perform();
        action.click(reservation.dateDayTo).perform();
        Thread.sleep(Duration.ofSeconds(1));

        //Apply
        js.executeScript("arguments[0].click();", reservation.apply );
    }

    @And("User Click on search button")
    public void step34() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.search );
    }

    @And("User Choose unit")
    public void step35() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.view);
        Thread.sleep(Duration.ofSeconds(1));
        js.executeScript("arguments[0].click();", reservation.unit);
        Thread.sleep(Duration.ofSeconds(1));

        //click on booking now
        js.executeScript("arguments[0].click();", reservation.book);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Click on I Agree To Cancellation Policy")
    public void step36() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.agree);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Checkout Is successfully")
    public void step37() throws InterruptedException {
        js.executeScript("arguments[0].click();", reservation.check);
        Thread.sleep(Duration.ofSeconds(1));
    }
}
