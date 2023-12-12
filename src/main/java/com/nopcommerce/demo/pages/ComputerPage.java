package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement getComputerText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    public String computerText(){
        return getTextFromElement(getComputerText);
    }
    public void clickOnDeskTopLink(){
        clickOnElement(desktopLink);
    }
}
