package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import static org.example.StepDefs.Hooks.driver;
public class Login {

    JavascriptExecutor js =  (JavascriptExecutor) driver;
    @Given("User Navigate To home page")
    public void Step1 ()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @Then("login is successfully")
    public void Step2()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @And("user click on login Btn")
    public void userClickOnLoginBtn() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user keep phone number is an empty")
    public void Step3() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter valid password")
    public void Step4() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='123456789';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }


    @Given("User Navigate To Home page")
    public void Step5()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User click on login Btn")
    public void Step6() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user enter invalid phone number format")
    public void Step7() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='010335847';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User enter valid password")
    public void Step8() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='123456789';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("Login is successfully")
    public void Step9()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("User[A] Navigate To Home page")
    public void Step10()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User[B] click on login Btn")
    public void Step11() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user[C] enter phone number not registered")
    public void Step12() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='01036954123';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter valid password")
    public void Step13() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='123456789';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("Login[E] is successfully")
    public void Step14()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("User[A] Navigate To Home Page")
    public void Step15()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("User[B] Click on login Btn")
    public void Step16() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("user[C] enter valid phone number")
    public void Step17() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter password is an empty")
    public void Step18() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("login[E] is Successfully")
    public void Step19()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("USer[A] Navigate To Home Page")
    public void Step20()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("USer[B] Click on login Btn")
    public void Step21() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[C] enter valid phone number")
    public void Step22() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("User[D] enter password without one num")
    public void Step23() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='1234567';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("LOgin[E] is Successfully")
    public void Step24()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }

    @Given("USER[A] Navigate To Home Page")
    public void Step25()
    {
        driver.navigate().to("https://dev-api.host-n.com/");
    }

    @And("USER[B] Click on login Btn")
    public void Step26() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"https://dev-api.host-n.com/login\"]")).click();
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("USER[C] enter valid phone number")
    public void Step27() throws InterruptedException {
        WebElement num = driver.findElement(By.cssSelector("input[id=\"phone\"]"));
        js.executeScript("arguments[0].value='01033584776';", num);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @And("USER[D] enter valid password")
    public void Step28() throws InterruptedException {
        WebElement pass = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        js.executeScript("arguments[0].value='12345678';", pass);
        Thread.sleep(Duration.ofSeconds(3));
    }

    @Then("LOGIN[E] Is Successfully")
    public void Step29()
    {
        WebElement Btn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        js.executeScript("arguments[0].click();", Btn);
    }
}
