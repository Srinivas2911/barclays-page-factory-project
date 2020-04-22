package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {


    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Using selenium @Findby and initElement methods
// using _ help separate from variable

    @FindBy(xpath = "//body//header//span[2]")
    WebElement _iconDisplay;
    //   By iconDisplay = By.xpath("//body//header//span[2]");

    @FindBy(linkText = "Log In")
    WebElement _loginLink;
//    By loginLink = By.linkText("Log In");

    @FindBy (linkText = "Register")
    WebElement _registerLink;
//    By registerLink = By.linkText("Register");

    public void loginLinkisDisplayed() {
        Reporter.log("Displaying Login  Link " + _loginLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_loginLink);
        log.info("Displaying Login Link : " + _loginLink.toString());

    }

    public String getLoginLinkText() {
        Reporter.log("Displaying Login  Link " + _loginLink.toString() + "<br>");
        log.info("Displaying Login Link : " + _loginLink.toString());
        return getTextFromElement(_loginLink);
    }


    public void registerLinkisDisplayed() {
        Reporter.log("Displaying Register  Link " + _registerLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_registerLink);
        log.info("Displaying Register link : " + _registerLink.toString());

    }

    public String getRegisterLinkText() {
        Reporter.log("Displaying Register  Link " + _registerLink.toString() + "<br>");
        log.info("Displaying Register link : " + _registerLink.toString());
        return getTextFromElement(_registerLink);
    }


    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Login link : " + _loginLink.toString());

    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register  Link " + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on Register link : " + _registerLink.toString());

    }

}
