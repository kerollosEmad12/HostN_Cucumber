package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class SingUp {

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
}
