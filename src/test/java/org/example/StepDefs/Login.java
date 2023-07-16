package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import static org.example.StepDefs.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class Login {

    JavascriptExecutor js =  (JavascriptExecutor) driver;
    P03_LoginPage login = new P03_LoginPage();
    @Given("User Navigate To home page")
    public void Step1 ()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("user click on login Btn")
    public void Step2() throws InterruptedException {
       login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter phone number {string}")
    public void Step3(String number) throws InterruptedException {
        login.phone.sendKeys(number);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter valid password {string}")
    public void Step4(String password) throws InterruptedException {
        login.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("login is successfully \"([^\"]*)\"$")
    public void Step5(String result)
    {
        js.executeScript("arguments[0].click();", login.submit);

        //1- message content or equal "Login credential are invalid."
        SoftAssert soft = new SoftAssert();
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"alert alert-danger\"]")).getText();
        soft.assertTrue(actualMsg.contains("Login credential are invalid."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"Login credential are invalid."
        );

        if ("failure".equals(result)){
            assertTrue(driver.findElement(By.cssSelector("div[class=\"alert alert-danger\"]")).isDisplayed());
        }

        //2- message color is red using RGBA or Hex
        String actualColorRGBA = driver.findElement(By.cssSelector("div[class=\"alert alert-danger\"]")).getCssValue("background-color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#f8d7da");

        soft.assertAll();
    }

    @And("user input phone number {string}")
    public void Step7(String number) throws InterruptedException {
        login.phone.sendKeys(number);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user input valid password {string}")
    public void Step8(String password) throws InterruptedException {
        login.pass.sendKeys(password);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("The login is passed")
    public void Step9() {
        js.executeScript("arguments[0].click();", login.submit);
    }
}
