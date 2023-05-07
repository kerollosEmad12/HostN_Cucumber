package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.StepDefs.Hooks.driver;
public class P04_ReservationPage {

    public P04_ReservationPage ()
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

    @FindBy (css = "div button[data-id=\"selectDistrict\"]")
    public WebElement selectDist;

    @FindBy (css = "a[id=\"bs-select-1-2\"]")
    public WebElement dist;

    @FindBy (css = "div button[data-id=\"selectCompound\"]")
    public WebElement selectComp;

    @FindBy (css = "a[id=\"bs-select-2-3\"]")
    public WebElement Comp;

    @FindBy (css = "input[id=\"demo\"]")
    public WebElement dateMonth;

    @FindBy (css = "div[class=\"drp-calendar left\"] td[data-title=\"r1c0\"]")
    public WebElement dateDayFrom;

    @FindBy (css = "div[class=\"drp-calendar left\"] td[data-title=\"r1c6\"]")
    public WebElement dateDayTo;

    @FindBy (css = "button[class=\"applyBtn btn btn-sm btn-primary\"]")
    public WebElement apply;

    @FindBy (css = "button[class=\"btn btn-find px-5\"]")
    public WebElement search;

    @FindBy (id = "1091")
    public WebElement unit;

    @FindBy (css = "button[class=\"btn viewpopupe_5\"]")
    public WebElement view;

    @FindBy (css = "button[id=\"bookNow-996\"]")
    public WebElement book;

    @FindBy (id = "policyAgreegation")
    public WebElement agree;

    @FindBy (css = "button[class=\"btn checkout\"]")
    public WebElement check;
}
