package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDefs.Hooks.driver;

public class P02_RegisterPage {

    public P02_RegisterPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "input[name=\"first_name\"]")
    public WebElement firstname;

    @FindBy (css = "input[name=\"last_name\"]")
    public WebElement lastname;

    @FindBy (css = "input[name=\"mobile\"]")
    public WebElement number;

    @FindBy (css = "input[name=\"email\"]")
    public WebElement email;

    @FindBy (name = "password")
    public WebElement pass;

    @FindBy (css = "input[name=\"confirm_password\"]")
    public WebElement confirmPass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement submit;
}
