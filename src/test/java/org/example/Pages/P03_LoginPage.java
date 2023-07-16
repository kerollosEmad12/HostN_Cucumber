package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDefs.Hooks.driver;
public class P03_LoginPage {

    public P03_LoginPage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "a[href=\"https://dev-api.host-n.com/login\"]")
    public WebElement loginTab;

    @FindBy (css = "input[id=\"phone\"]")
    public WebElement phone;

    @FindBy (css = "input[type=\"password\"]")
    public WebElement pass;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement submit;
}
