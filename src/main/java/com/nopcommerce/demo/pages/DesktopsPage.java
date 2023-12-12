package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement getDesktopsText;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramFromDropDown;

    @CacheLookup
    @FindBy(xpath = "//label[text() = '320 GB']")
    WebElement hdd320Gb;

    @CacheLookup
    @FindBy(xpath = "//label[text() = '400 GB [+$100.00]']")
    WebElement hdd400Gb;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osVistaHome;

    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Vista Premium [+$60.00]']")
    WebElement osVistaPremium;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMicrosoftOffice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddMessageText;


    /******************************** All Elements' Action Methods on DesktopsPage *************************************/


    public void clickOnProductName() {
        clickOnElement(productName);
    }

    public void selectProcessor(String processor2) {
        selectByVisibleTextFromDropDown(processorFromDropDown, processor2);
    }

    public void selectRAM(String ram2) {
        selectByValueFromDropDown(ramFromDropDown, ram2);
    }

    public void selectHdd(String hdd) {
        if (hdd == "320 GB") {
            clickOnElement(hdd320Gb);
        } else if (hdd == "400 GB [+$100.00]") {
            clickOnElement(hdd400Gb);
        } else {
            System.out.println("select wrong Features ");
        }
    }

    public void selectOs(String os) {
        if (os == "Vista Home [+$50.00]") {
            clickOnElement(osVistaHome);
        } else if (os == "Vista Premium [+$60.00]") {
            clickOnElement(osVistaPremium);
        } else {
            System.out.println("select wrong Features ");
        }

    }

    public void selectSoftware(String software) {
        if (software == "Microsoft Office [+$50.00]") {
            clickOnElement(softwareMicrosoftOffice);
        } else if (software == "Acrobat Reader [+$10.00]") {
            clickOnElement(softwareAcrobatReader);
        } else if (software == "Total Commander [+$5.00]") {
            clickOnElement(softwareTotalCommander);
        } else {
            System.out.println("select wrong Features ");
        }
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getProductAddMessage() {
        return getTextFromElement(productAddMessageText);
    }

    public void selectFeaturesOfComputer(String processor, String ram, String hdd, String os, String software) {
        selectProcessor(processor);
        selectRAM(ram);
        selectHdd(hdd);
        selectOs(os);
        selectSoftware(software);

    }

    public String getTextOfDesktops() {
        return getTextFromElement(getDesktopsText);
    }
}
