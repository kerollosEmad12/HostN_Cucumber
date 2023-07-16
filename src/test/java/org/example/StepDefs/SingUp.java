package org.example.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P01_HomePage;
import org.example.Pages.P02_RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import static org.junit.Assert.*;

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

    @And("user enter valid last name {string} and first name {string}")
    public void step3(String first_name, String last_name) throws InterruptedException {
        signup.firstname.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        signup.lastname.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid number")
    public void step4() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        signup.number.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid email")
    public void step5() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid password {string} and confirm password {string}")
    public void step6(String password, String confirm_password) throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        signup.confirmPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("new account is created successfully")
    public void step7()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @And("user could enter valid last name {string} and first name {string}")
    public void step8(String first_name, String last_name) throws InterruptedException {
        signup.firstname.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        signup.lastname.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user could enter valid number {string}")
    public void step9(String phone_number) throws InterruptedException {
        signup.number.sendKeys(phone_number);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter valid email")
    public void step10() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could enter valid password {string} and confirm password {string}")
    public void step11(String password, String confirm_password) throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        signup.confirmPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("user could created new account successfully {string}")
    public void step12(String result) {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);

        //1- message content or equal "Invalid number"
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.id("error-msg")).getText();
        soft.assertTrue(actualMsg.contains("First name is mandatory"),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"Invalid number"
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.id("error-msg")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.id("error-msg")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#fd3f3f");

        soft.assertAll();
    }

    @And("Register should be possible if enter valid last name {string} and first name {string}")
    public void step13(String last_name, String first_name) throws InterruptedException {
        signup.firstname.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        signup.lastname.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Register should be possible if enter valid number")
    public void step14() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        signup.number.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Register should be possible if enter valid email {string}")
    public void step15(String email) throws InterruptedException {
        signup.email.sendKeys(email);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("Register should be possible if enter valid password {string} and confirm password {string}")
    public void step16(String password, String confirm_password) throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        signup.confirmPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Register should be possible if user created new account successfully {string}")
    public void step17(String result) {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);

        //1- message content or equal "The email must be a valid email address."
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"invalid-feedback \"]:nth-child(5) strong")).getText();
        soft.assertTrue(actualMsg.contains("The email must be a valid email address."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The email must be a valid email address."
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"invalid-feedback \"]:nth-child(5) strong")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"invalid-feedback \"]:nth-child(5) strong")).getCssValue("color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#dc3545");

        soft.assertAll();
    }

    @And("user could input valid last name {string} and first name {string}")
    public void step18(String first_name, String last_name) throws InterruptedException {
        signup.firstname.sendKeys(first_name);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        signup.lastname.sendKeys(last_name);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user could input valid number")
    public void step19() throws InterruptedException {
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("010########");
        signup.number.sendKeys(phoneNumber);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user could input valid email")
    public void step20() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user could input invalid password {string} and confirm password {string}")
    public void step21(String password, String confirm_password) throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        signup.confirmPass.sendKeys(confirm_password);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("user could created new account submitted")
    public void step22() {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }


   /* @Given("User navigate to home page")
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
    }*/
}
