package co.uk.barclays.pages;

import co.uk.barclays.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    //Using selenium @Findby and initElement methods
// using _ help separate from variable

    @FindBy (xpath = "//h2[@class='h2 jumbo-title']")
    WebElement _registerJumboText;

//    By registerJumboText = By.xpath("//h2[@class='h2 jumbo-title']");

    public void verifyRegisterJumboText(){
        Reporter.log("Displaying Register Page Text " + _registerJumboText.toString() + "<br>");
        verifyThatTextIsDisplayed(_registerJumboText, "Register for Online Banking");
        log.info("Displaying Register Page Text : " + _registerJumboText.toString());

    }

    public String getRegisterJumboText (){
        Reporter.log("Displaying Register Page Text " + _registerJumboText.toString() + "<br>");
        log.info("Displaying Register Page Text : " + _registerJumboText.toString());
        return getTextFromElement(_registerJumboText);
    }

}
