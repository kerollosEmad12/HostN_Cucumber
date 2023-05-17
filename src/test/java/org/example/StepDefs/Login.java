package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import static org.example.StepDefs.Hooks.driver;
public class Login {

    JavascriptExecutor js =  (JavascriptExecutor) driver;
    P03_LoginPage login = new P03_LoginPage();
    @Given("User Navigate To home page")
    public void Step1 ()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @Then("login is successfully")
    public void Step2()
    {
        js.executeScript("arguments[0].click();", login.submit);
    }

    @And("user click on login Btn")
    public void Step3() throws InterruptedException {
       login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user keep phone number is an empty")
    public void Step4() throws InterruptedException {
        js.executeScript("arguments[0].value='';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter valid password")
    public void Step5() throws InterruptedException {
        js.executeScript("arguments[0].value='123456789';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }


    @Given("User Navigate To Home page")
    public void Step6()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User click on login Btn")
    public void Step7() throws InterruptedException {
        login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter invalid phone number format")
    public void Step8() throws InterruptedException {
        js.executeScript("arguments[0].value='010335847';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter valid password")
    public void Step9() throws InterruptedException {
        js.executeScript("arguments[0].value='123456789';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("Login is successfully")
    public void Step10()
    {
        js.executeScript("arguments[0].click();", login.submit);


        SoftAssert soft = new SoftAssert();
        //1- assert url equal or contains https://dev-api.host-n.com/login
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://dev-api.host-n.com/login"),
                "actual result : "+actualUrl + "  " + "expected result : " +  "https://dev-api.host-n.com/login"
            );

        //2- message content or equal "Login credential are invalid."
        String actualMsg = login.actualMge.getText();
        soft.assertTrue(actualMsg.contains("Login credential are invalid."),
                "actualMsg : "+actualMsg + " | " + "expected Msg : "+"Login credential are invalid."
        );
        //3- message color is green using RGBA or Hex
        String actualColorRGBA = login.color.getCssValue("border-color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#f5c6cb");

        //4- assertAll()
        soft.assertAll();
    }

    @Given("User[A] Navigate To Home page")
    public void Step11()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User[B] click on login Btn")
    public void Step12() throws InterruptedException {
        login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user[C] enter phone number not registered")
    public void Step13() throws InterruptedException {
        js.executeScript("arguments[0].value='01036954123';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter valid password")
    public void Step14() throws InterruptedException {
        js.executeScript("arguments[0].value='123456789';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("Login[E] is successfully")
    public void Step15()
    {
        js.executeScript("arguments[0].click();", login.submit);

        SoftAssert soft = new SoftAssert();
        //1- assert url equal or contains https://dev-api.host-n.com/login
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://dev-api.host-n.com/login"),
                "actual result : "+actualUrl + "  " + "expected result : " +  "https://dev-api.host-n.com/login"
        );

        //2- message content or equal "Login credential are invalid."
        String actualMsg = login.actualMge.getText();
        soft.assertTrue(actualMsg.contains("Login credential are invalid."),
                "actualMsg : "+actualMsg + " | " + "expected Msg : "+"Login credential are invalid."
        );
        //3- message color is green using RGBA or Hex
        String actualColorRGBA = login.color.getCssValue("border-color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#f5c6cb");

        //4- assertAll()
        soft.assertAll();
    }

    @Given("User[A] Navigate To Home Page")
    public void Step16()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User[B] Click on login Btn")
    public void Step17() throws InterruptedException {
        login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user[C] enter valid phone number")
    public void Step18() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter password is an empty")
    public void Step19() throws InterruptedException {
        js.executeScript("arguments[0].value='';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("login[E] is Successfully")
    public void Step20()
    {
        js.executeScript("arguments[0].click();", login.submit);
    }

    @Given("USer[A] Navigate To Home Page")
    public void Step21()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("USer[B] Click on login Btn")
    public void Step22() throws InterruptedException {
        login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[C] enter valid phone number")
    public void Step23() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter password without one num")
    public void Step24() throws InterruptedException {
        js.executeScript("arguments[0].value='1234567';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("LOgin[E] is Successfully")
    public void Step25()
    {
        js.executeScript("arguments[0].click();", login.submit);

        SoftAssert soft = new SoftAssert();
        //1- assert url equal or contains https://dev-api.host-n.com/login
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://dev-api.host-n.com/login"),
                "actual result : "+actualUrl + "  " + "expected result : " +  "https://dev-api.host-n.com/login"
        );

        //2- message content or equal "Login credential are invalid."
        String actualMsg = login.actualMge.getText();
        soft.assertTrue(actualMsg.contains("Login credential are invalid."),
                "actualMsg : "+actualMsg + " | " + "expected Msg : "+"Login credential are invalid."
        );
        //3- message color is green using RGBA or Hex
        String actualColorRGBA = login.color.getCssValue("border-color");
        String actualColorHex = Color.fromString(actualColorRGBA).asHex();
        soft.assertEquals(actualColorHex, "#f5c6cb");

        //4- assertAll()
        soft.assertAll();
    }

    @Given("USER[A] Navigate To Home Page")
    public void Step26()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("USER[B] Click on login Btn")
    public void Step27() throws InterruptedException {
        login.loginTab.click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("USER[C] enter valid phone number")
    public void Step28() throws InterruptedException {
        js.executeScript("arguments[0].value='01033584776';", login.phone);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("USER[D] enter valid password")
    public void Step29() throws InterruptedException {
        js.executeScript("arguments[0].value='12345678';", login.pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("LOGIN[E] Is Successfully")
    public void Step30()
    {
        js.executeScript("arguments[0].click();", login.submit);

        SoftAssert soft = new SoftAssert();
        //1- assert url equal or contains https://dev-api.host-n.com/login
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://dev-api.host-n.com/login"),
                "actual result : "+actualUrl + "  " + "expected result : " +  "https://dev-api.host-n.com/login"
        );

        //4- assertAll()
        soft.assertAll();
    }
}
