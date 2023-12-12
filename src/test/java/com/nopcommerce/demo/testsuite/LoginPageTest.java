package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","smoke" ,"regression"})
    public void UserShouldNavigateToLoginPageSuccessfully() {
        //Click on login link
        homePage.clickOnLoginLink();

        //verify that "Welcome, Please Sign In!" message display

        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageWithInvalidCredentials() {

        //Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmailId("gg@gmail.com");

//        Enter Password
        loginPage.enterPassword("mnb0987");//invalid password original mnbv0987

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Verify that the Error message
        Assert.assertEquals(loginPage.getErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {

//        Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmailId("lllll@gmail.com");

//        Enter Password
        loginPage.enterPassword("mnbv0987");

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Verify that LogOut link is display
        Assert.assertEquals(loginPage.getLogOutText(), "Log out");


    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully() {
//        Click on login link
        homePage.clickOnLoginLink();

//        Enter EmailId
        loginPage.enterEmailId("lll@gmail.com");

//        Enter Password
        loginPage.enterPassword("mnbv0987");

//        Click on Login Button
        loginPage.clickOnLoginButton();

//        Click on LogOut Link
        loginPage.clickOnLogOut();

//        Verify that LogIn Link Display
        Assert.assertEquals(loginPage.getLogINText(), "Log in");


    }

}
