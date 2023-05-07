package org.example.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P01_HomePage;
import org.example.Pages.P02_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class SingUp {

    public static String globalEmail;

    P01_HomePage home = new P01_HomePage();
    P02_RegisterPage signup = new P02_RegisterPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("user navigate to home page")
    public void userNavigateToHomepage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("user click on signup button")
    public void userClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name and first name")
    public void userEnterValidLastNameAndFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='Dev';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid number")
    public void userEnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid email")
    public void userEnterValidEmail() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid password and confirm password")
    public void userEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("new account is created successfully")
    public void newAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }


    @Given("User navigate to home page")
    public void userNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User click on signup button")
    public void UserClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name an empty first name")
    public void userEnterValidLastNameAnEmptyFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid number")
    public void UserEnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid email")
    public void UserEnterValidEmail() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid password and confirm password")
    public void UserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New account is created successfully")
    public void NewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("User Navigate to home page")
    public void UserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User Click on signup button")
    public void user_ClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("user enter valid last name with one character first name")
    public void userEnterValidLastNameWithOneCharacterFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='f';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid number")
    public void user_EnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01093136673';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid email")
    public void user_EnterValidEmail() throws InterruptedException {
        js.executeScript("arguments[0].value='test43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid password and confirm password")
    public void user_EnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New Account is created successfully")
    public void new_AccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("StepA User Navigate to home page")
    public void step1()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("StepB User Click on signup button")
    public void step2()
    {
        home.registerTab.click();
    }

    @And("StepC user enter valid last name first name")
    public void step3() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepE User Enter phone number missing number")
    public void step4() throws InterruptedException {
        js.executeScript("arguments[0].value='0109313667';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepF User Enter valid email")
    public void step5() throws InterruptedException {
        js.executeScript("arguments[0].value='Test.43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepG User Enter valid password and confirm password")
    public void step6() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("StepH New Account is created successfully")
    public void step7()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("stepA User Navigate to home page")
    public void stepAUserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("stepB User Click on signup button")
    public void steBbUserClickOnSignupButton()
    {
        signup.submit.click();
    }

    @And("stepC user enter valid last name first name")
    public void stepCUserEnterValidLastNameFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter number an empty")
    public void stepEUserEnterNumberAnEmpty() throws InterruptedException {
        js.executeScript("arguments[0].value='';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepF User Enter valid email")
    public void stepFUserEnterValidEmail() throws InterruptedException {
        js.executeScript("arguments[0].value='Test.43@gmail.com';", signup.email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepG User Enter valid password and confirm password")
    public void stepGUserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password

        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("stepH New Account is created successfully")
    public void stepHNewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("step[A] User Navigate to home page")
    public void stepA_UserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("step[B] User Click on signup button")
    public void stepB_UserClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("step[C] user enter valid last name first name")
    public void stepC_UserEnterValidLastNameFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter invalid number format")
    public void stepE_UserEnterInvalidNumberFormat() throws InterruptedException {
        js.executeScript("arguments[0].value='010893';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("step[F] User Enter valid email")
    public void stepF_UserEnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password and confirm password")
    public void stepG_UserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        signup.pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("step[H] New Account is created successfully")
    public void stepH_NewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("Step[A] User Navigate to home page")
    public void step_AUserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("Step[B] User Click on signup button")
    public void stepBUserClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("Step[C] user enter valid last name first name")
    public void step_CUserEnterValidLastNameFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[E] User Enter valid number")
    public void stepEUserEnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[F] User Enter valid email")
    public void step_FUserEnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter password and confirm password is an empty")
    public void stepGUserEnterPasswordAndConfirmPasswordIsAnEmpty() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Step[H] New Account is created successfully")
    public void step_HNewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("STep[A] User Navigate to home page")
    public void stepAUser_NavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STep[B] User Click on signup button")
    public void stepBUser_ClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("STep[C] user enter valid last name first name")
    public void stepCUser_EnterValidLastNameFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[E] User Enter valid number")
    public void stepEUser_EnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[F] User Enter valid email")
    public void stepFUser_EnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter invalid password format and valid confirm password")
    public void stepGUserEnterInvalidPasswordFormatAndValidConfirmPassword() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='123';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STep[H] New Account is created successfully")
    public void stepHNewAccount_IsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }

    @Given("STEp[A] User Navigate to home page")
    public void stepA_User_NavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STEp[B] User Click on signup button")
    public void stepB_User_ClickOnSignupButton()
    {
        home.registerTab.click();
    }

    @And("STEp[C] user enter valid last name first name")
    public void stepC_User_EnterValidLastNameFirstName() throws InterruptedException {
        js.executeScript("arguments[0].value='fabrica';", signup.firstname);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        js.executeScript("arguments[0].value='CS';", signup.lastname);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[E] User Enter valid number")
    public void stepE_UserEnterValidNumber() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", signup.number);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[F] User Enter valid email")
    public void stepF_User_EnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        signup.email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password format and invalid confirm password format")
    public void stepGUserEnterValidPasswordFormatAndInvalidConfirmPasswordFormat() throws InterruptedException {
        //Enter valid password
        js.executeScript("arguments[0].value='123456789';", signup.pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        js.executeScript("arguments[0].value='1234';", signup.confirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STEp[H] New Account is created successfully")
    public void stepH_NewAccount_IsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        js.executeScript("arguments[0].click();", signup.submit);
    }
}
