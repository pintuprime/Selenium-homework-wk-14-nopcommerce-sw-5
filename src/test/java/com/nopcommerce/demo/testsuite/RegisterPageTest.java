package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();

        //Verify "Register" text
        Assert.assertEquals(registerPage.getRegisterTitle(),"Register");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {

//        Click on Register Link
        homePage.clickOnRegisterLink();

//        Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

//        Verify the error message "First name is required."
        Assert.assertEquals(registerPage.getFirstNameText(),"First name is required.");

//        Verify the error message "Last name is required."
        Assert.assertEquals(registerPage.getLastNameText(),"Last name is required.");

//        Verify the error message "Email is required."
        Assert.assertEquals(registerPage.getEmailText(),"Email is required.");

//        Verify the error message "Password is required."
        Assert.assertEquals(registerPage.getPasswordText(),"Password is required.");

//        Verify the error message "Password is required.
        Assert.assertEquals(registerPage.getConfirmPasswordText(),"Password is required.");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
//        Click on Register Link
        homePage.clickOnRegisterLink();

//        Select gender "male"
        registerPage.clickOnRadioButton();

//        Enter firstname
        registerPage.enterFirstName("Tom");

//        Enter lastname
        registerPage.enterLastName("Alter");

//        Select day
        registerPage.enterDayOfBirth("1");

//        Select month
        registerPage.enterMonthOfBirth("1");

//        Select year
        registerPage.enterYearOfBirth("1980");

//        Enter email
        registerPage.enterEmail("lllll@gmail.com");

//        Enter password
        registerPage.enterPassword("mnbv0987");

//        Enter Confirm Password
        registerPage.enterConfirmPassword("mnbv0987");

//        Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

//        Verify message "Your registration completed"
        Assert.assertEquals(registerPage.getRegisterText(),"Your registration completed");
    }
}
