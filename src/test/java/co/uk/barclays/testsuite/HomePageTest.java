package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends TestBase {

    HomePage homePage;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod (groups = {"sanity", "smoke", "regression"})
    public void setUpMethod (){
        homePage = new HomePage();

    }

    @Test (priority = 0, groups = {"smoke", "sanity"})
    public void verifyThatLoginLinkDisplayedOnHomepage() {
        homePage.loginLinkisDisplayed();
        sa.assertTrue(homePage.getLoginLinkText().contains("Log In"));
        sa.assertAll();

    }

    @Test (priority = 1, groups = {"sanity", "regression"})
    public void verifyThatRegisterLinkIsDisplayedOnHomepage() {
        homePage.registerLinkisDisplayed();
        sa.assertTrue(homePage.getRegisterLinkText().contains("Register"));
        sa.assertAll();

    }
}