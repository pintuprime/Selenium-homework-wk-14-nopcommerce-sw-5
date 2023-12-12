package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    ComputerPage computerPage;
    DesktopsPage desktopsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        //Click on Computer tab
        homePage.clickOnComputers();

        //Verify "Computer" text
        Assert.assertEquals(computerPage.computerText(), "Computers");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        //  Click on Computer tab
        homePage.clickOnComputers();

        // Click on Desktops link
        computerPage.clickOnDeskTopLink();

        // Verify "Desktops" text
        Assert.assertEquals(desktopsPage.getTextOfDesktops(), "Desktops");

    }

    @Test(groups = {"regression"}, dataProvider = "computerConfigs", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        homePage.clickOnComputers();
        computerPage.clickOnDeskTopLink();
        desktopsPage.clickOnProductName();
        desktopsPage.selectFeaturesOfComputer(processor, ram, hdd, os, software);
        desktopsPage.clickOnAddToCart();
        Assert.assertEquals(desktopsPage.getProductAddMessage(), "The product has been added to your shopping cart");

    }
}