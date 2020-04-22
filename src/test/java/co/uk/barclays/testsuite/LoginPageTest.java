package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.LoginPage;
import co.uk.barclays.pages.RegisterPage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage ;
    RegisterPage registerPage ;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUpMethod () {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();

    }

    @Test (priority = 0, groups = {"smoke", "sanity"})
    public void verifyThatUserisAbleToNavigatetoLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.setTextOnLoginPage();
        sa.assertTrue(loginPage.getTextOnLoginPage().contains("Quick, safe and convenient"));
        sa.assertAll();

            }

    @Test (priority = 1, groups = { "regression"})
    public void verifyThatUserisAbleToNavigatetoRegisterPageThruLoginInPage () {
        homePage.clickOnLoginLink();
        loginPage.clickOnRegisterNowLink();
        registerPage.verifyRegisterJumboText();
        sa.assertTrue(registerPage.getRegisterJumboText().contains("Register for Online Banking"));
        sa.assertAll();

    }
}
