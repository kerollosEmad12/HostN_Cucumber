package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDefs.Hooks.driver;

public class P01_HomePage {
    public P01_HomePage ()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "a[href=\"https://api.host-n.com/register\"]")
    public WebElement registerTab;
}
