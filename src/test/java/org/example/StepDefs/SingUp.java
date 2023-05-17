package org.example.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P01_HomePage;
import org.example.Pages.P02_RegisterPage;
import org.openqa.selenium.*;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class SingUp {

    public static String globalEmail;
    P01_HomePage home = new P01_HomePage();
    P02_RegisterPage signup = new P02_RegisterPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("user navigate to home page")
    public void step1()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("user click on signup button")
    public void step2()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name and first name")
    public void step3() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='Dev';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid number")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid email")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid password and confirm password")
    public void step6() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("new account is created successfully")
    public void step7()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }


    @Given("User navigate to home page")
    public void step8()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User click on signup button")
    public void step9()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name an empty first name")
    public void step10() throws InterruptedException {
        js.executeScript("arguments[0].value='';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid number")
    public void step11() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid email")
    public void step12() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid password and confirm password")
    public void step13() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New account is created successfully")
    public void step14()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("User Navigate to home page")
    public void step15()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User Click on signup button")
    public void step16()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name with one character first name")
    public void step17() throws InterruptedException {
        js.executeScript("arguments[0].value='f';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid number")
    public void step18() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid email")
    public void step19() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid password and confirm password")
    public void step20() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New Account is created successfully")
    public void step21()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("StepA User Navigate to home page")
    public void step22()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("StepB User Click on signup button")
    public void step23()
    {
        home.registerTab.click();
    }

    @And("StepC user enter valid last name first name")
    public void step24() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepE User Enter phone number missing number")
    public void step25() throws InterruptedException {
        js.executeScript("arguments[0].value='0109313667';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepF User Enter valid email")
    public void step26() throws InterruptedException {
        js.executeScript("arguments[0].value='Test.43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepG User Enter valid password and confirm password")
    public void step27() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("StepH New Account is created successfully")
    public void step28()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("stepA User Navigate to home page")
    public void step29()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("stepB User Click on signup button")
    public void step30()
    {
        signup.submit.click();
    }

    @And("stepC user enter valid last name first name")
    public void step31() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter number an empty")
    public void step32() throws InterruptedException {
        js.executeScript("arguments[0].value='';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepF User Enter valid email")
    public void step33() throws InterruptedException {
        js.executeScript("arguments[0].value='Test.43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepG User Enter valid password and confirm password")
    public void step34() throws InterruptedException {
        //Enter valid password

        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("stepH New Account is created successfully")
    public void step35()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("step[A] User Navigate to home page")
    public void step36()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("step[B] User Click on signup button")
    public void step37()
    {
        home.registerTab.click();
    }

    @And("step[C] user enter valid last name first name")
    public void step38() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter invalid number format")
    public void step39() throws InterruptedException {
        js.executeScript("arguments[0].value='010893';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("step[F] User Enter valid email")
    public void step40() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password and confirm password")
    public void step41() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("step[H] New Account is created successfully")
    public void step42()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("Step[A] User Navigate to home page")
    public void step43()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("Step[B] User Click on signup button")
    public void step44()
    {
        home.registerTab.click();
    }

    @And("Step[C] user enter valid last name first name")
    public void step45() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[E] User Enter valid number")
    public void step46() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[F] User Enter valid email")
    public void step47() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter password and confirm password is an empty")
    public void step48() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Step[H] New Account is created successfully")
    public void step49()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("STep[A] User Navigate to home page")
    public void step50()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STep[B] User Click on signup button")
    public void step51()
    {
        home.registerTab.click();
    }

    @And("STep[C] user enter valid last name first name")
    public void step52() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[E] User Enter valid number")
    public void step53() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[F] User Enter valid email")
    public void step54() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter invalid password format and valid confirm password")
    public void step55() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='123';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STep[H] New Account is created successfully")
    public void step56()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("STEp[A] User Navigate to home page")
    public void step57()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STEp[B] User Click on signup button")
    public void step58()
    {
        home.registerTab.click();
    }

    @And("STEp[C] user enter valid last name first name")
    public void step59() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[E] User Enter valid number")
    public void step60() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[F] User Enter valid email")
    public void step61() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password format and invalid confirm password format")
    public void step62() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='123456789';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='1234';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STEp[H] New Account is created successfully")
    public void step63()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }
}
