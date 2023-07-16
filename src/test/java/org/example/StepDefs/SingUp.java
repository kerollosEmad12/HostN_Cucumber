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
}
