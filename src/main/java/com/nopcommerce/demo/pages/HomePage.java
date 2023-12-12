package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelryLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;


    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogoLink;


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnComputers(){clickOnElement(computersLink);}
    public void clickOnElectronics(){clickOnElement(electronicsLink);}
    public void clickOnApparel(){clickOnElement(apparelLink);}
    public void clickOnDigitalDownLoads(){clickOnElement(digitalDownloadsLink);}
    public void clickOnBooks(){clickOnElement(booksLink);}
    public void clickOnJewelry(){clickOnElement(jewelryLink);}
    public void clickOnGiftCards(){clickOnElement(giftCardsLink);}
    public void clickOnMyAccount(){clickOnElement(myAccountLink);}
    public void clickOnNopCommerceLogo(){clickOnElement(nopCommerceLogoLink);}
}
