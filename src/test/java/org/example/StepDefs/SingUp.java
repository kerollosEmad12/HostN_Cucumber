package org.example.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class SingUp {

    public static String globalEmail;

    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("user navigate to home page")
    public void userNavigateToHomepage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("user click on signup button")
    public void userClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("user enter valid last name and first name")
    public void userEnterValidLastNameAndFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid number")
    public void userEnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01093136673';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid email")
    public void userEnterValidEmail() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        js.executeScript("arguments[0].value='test43@gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("user enter valid password and confirm password")
    public void userEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("new account is created successfully")
    public void newAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }


    @Given("User navigate to home page")
    public void userNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User click on signup button")
    public void UserClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("user enter valid last name an empty first name")
    public void userEnterValidLastNameAnEmptyFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid number")
    public void UserEnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01093136673';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid email")
    public void UserEnterValidEmail() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        js.executeScript("arguments[0].value='test43@gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User enter valid password and confirm password")
    public void UserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New account is created successfully")
    public void NewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("User Navigate to home page")
    public void UserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("User Click on signup button")
    public void user_ClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("user enter valid last name with one character first name")
    public void userEnterValidLastNameWithOneCharacterFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='f';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid number")
    public void user_EnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01093136673';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid email")
    public void user_EnterValidEmail() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        js.executeScript("arguments[0].value='test43@gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("User Enter valid password and confirm password")
    public void user_EnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("New Account is created successfully")
    public void new_AccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("StepA User Navigate to home page")
    public void step1()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("StepB User Click on signup button")
    public void step2()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("StepC user enter valid last name first name")
    public void step3() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepE User Enter phone number missing number")
    public void step4() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='0109313667';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepF User Enter valid email")
    public void step5() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        js.executeScript("arguments[0].value='Test.43@gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("StepG User Enter valid password and confirm password")
    public void step6() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("StepH New Account is created successfully")
    public void step7()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("stepA User Navigate to home page")
    public void stepAUserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("stepB User Click on signup button")
    public void steBbUserClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("stepC user enter valid last name first name")
    public void stepCUserEnterValidLastNameFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter number an empty")
    public void stepEUserEnterNumberAnEmpty() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepF User Enter valid email")
    public void stepFUserEnterValidEmail() throws InterruptedException {
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        js.executeScript("arguments[0].value='Test.43@gmail.com';", email);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepG User Enter valid password and confirm password")
    public void stepGUserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("stepH New Account is created successfully")
    public void stepHNewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("step[A] User Navigate to home page")
    public void stepA_UserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("step[B] User Click on signup button")
    public void stepB_UserClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("step[C] user enter valid last name first name")
    public void stepC_UserEnterValidLastNameFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("stepE User Enter invalid number format")
    public void stepE_UserEnterInvalidNumberFormat() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='010893';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("step[F] User Enter valid email")
    public void stepF_UserEnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password and confirm password")
    public void stepG_UserEnterValidPasswordAndConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("step[H] New Account is created successfully")
    public void stepH_NewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("Step[A] User Navigate to home page")
    public void step_AUserNavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("Step[B] User Click on signup button")
    public void stepBUserClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("Step[C] user enter valid last name first name")
    public void step_CUserEnterValidLastNameFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[E] User Enter valid number")
    public void stepEUserEnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("Step[F] User Enter valid email")
    public void step_FUserEnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter password and confirm password is an empty")
    public void stepGUserEnterPasswordAndConfirmPasswordIsAnEmpty() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        js.executeScript("arguments[0].value='';", pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("Step[H] New Account is created successfully")
    public void step_HNewAccountIsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("STep[A] User Navigate to home page")
    public void stepAUser_NavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STep[B] User Click on signup button")
    public void stepBUser_ClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("STep[C] user enter valid last name first name")
    public void stepCUser_EnterValidLastNameFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[E] User Enter valid number")
    public void stepEUser_EnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STep[F] User Enter valid email")
    public void stepFUser_EnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter invalid password format and valid confirm password")
    public void stepGUserEnterInvalidPasswordFormatAndValidConfirmPassword() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        js.executeScript("arguments[0].value='123';", pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='123456789';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STep[H] New Account is created successfully")
    public void stepHNewAccount_IsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("STEp[A] User Navigate to home page")
    public void stepA_User_NavigateToHomePage()
    {
        driver.navigate().to("https://api.host-n.com/");
    }

    @And("STEp[B] User Click on signup button")
    public void stepB_User_ClickOnSignupButton()
    {
        driver.findElement(By.cssSelector("a[href=\"https://api.host-n.com/register\"]")).click();
    }

    @And("STEp[C] user enter valid last name first name")
    public void stepC_User_EnterValidLastNameFirstName() throws InterruptedException {
        WebElement first = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
        js.executeScript("arguments[0].value='fabrica';", first);
        Thread.sleep(Duration.ofSeconds(1));

        //Input valid last name
        WebElement last = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
        js.executeScript("arguments[0].value='CS';", last);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[E] User Enter valid number")
    public void stepE_UserEnterValidNumber() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[name=\"mobile\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @And("STEp[F] User Enter valid email")
    public void stepF_User_EnterValidEmail() throws InterruptedException {
        Faker faker = new Faker();
        globalEmail = faker.internet().emailAddress();
        WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        email.sendKeys(globalEmail);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("step[G] User Enter valid password format and invalid confirm password format")
    public void stepGUserEnterValidPasswordFormatAndInvalidConfirmPasswordFormat() throws InterruptedException {
        //Enter valid password
        WebElement pass = driver.findElement(By.name("password"));
        js.executeScript("arguments[0].value='123456789';", pass);
        Thread.sleep(Duration.ofSeconds(1));

        //Enter confirm password
        WebElement ConfirmPass = driver.findElement(By.cssSelector("input[name=\"confirm_password\"]"));
        js.executeScript("arguments[0].value='1234';", ConfirmPass);
        Thread.sleep(Duration.ofSeconds(1));
    }

    @Then("STEp[H] New Account is created successfully")
    public void stepH_NewAccount_IsCreatedSuccessfully()
    {
        //Click on Create Account Btn
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }
}
