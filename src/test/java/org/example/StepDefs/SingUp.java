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
    public void step1()
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


}
