package co.uk.barclays.testsuite;

import co.uk.barclays.pages.HomePage;
import co.uk.barclays.pages.RegisterPage;
import co.uk.barclays.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPageTest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage ;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUpMethod () {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test (priority = 0, groups = {"regression"})
    public void verifyUserIsAbleToNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterJumboText();
        sa.assertTrue(registerPage.getRegisterJumboText().contains("Register for Online Banking"));
        sa.assertAll();
    }

}
