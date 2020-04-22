package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Using selenium @Findby and initElement methods
// using _ help separate from variable

    @FindBy(xpath = "//strong[contains(text(),'Quick, safe and convenient')]")
    WebElement _textOnLoginPage;
    //    By textOnLoginPage = By.xpath("//strong[contains(text(),'Quick, safe and convenient')]");

    @FindBy (linkText = "Register now")
    WebElement _registerNowLink;
    //    By registerNowLink = By.linkText("Register now");

    public void setTextOnLoginPage() {
        Reporter.log("Displaying Login Page Text " + _textOnLoginPage.toString() + "<br>");
        verifyThatTextIsDisplayed(_textOnLoginPage, "Quick, safe and convenient");
        log.info("Displaying Login Page Text : " + _textOnLoginPage.toString());
    }

    public String getTextOnLoginPage() {
        Reporter.log("Displaying Login Page Text " + _textOnLoginPage.toString() + "<br>");
        log.info("Displaying Login Page Text : " + _textOnLoginPage.toString());
        return getTextFromElement(_textOnLoginPage);
    }

    public void clickOnRegisterNowLink() {
        Reporter.log("Clicking on Register Link  " + _registerNowLink.toString() + "<br>");
        clickOnElement(_registerNowLink);
        log.info("Clicking on Register Link : " + _registerNowLink.toString());


    }
}
