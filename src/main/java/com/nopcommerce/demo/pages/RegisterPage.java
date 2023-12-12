package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerTitle;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement radio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "select[name='DateOfBirthDay']")
    WebElement dayOfBirth;

    @CacheLookup
    @FindBy(css = "select[name='DateOfBirthMonth']")
    WebElement monthOfBirth;

    @CacheLookup
    @FindBy(css = "select[name='DateOfBirthYear']")
    WebElement yearOfBirth;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;


    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerVerified;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;

    public String getRegisterTitle() {
        return getTextFromElement(registerTitle);
    }

    public void clickOnRadioButton() {
        clickOnElement(radio);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName,name);
    }

    public void enterLastName(String lastName1) {
        sendTextToElement(lastName,lastName1);
    }

    public void enterDayOfBirth(String value) {
        selectByValueFromDropDown(dayOfBirth, value);

    }

    public void enterMonthOfBirth(String value) {
        selectByValueFromDropDown(monthOfBirth, value);
    }

    public void enterYearOfBirth(String value) {
        selectByValueFromDropDown(yearOfBirth, value);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPW) {
        sendTextToElement(confirmPasswordField, confirmPW);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterText() {
        return getTextFromElement(registerVerified);
    }
    public String getFirstNameText(){
        return getTextFromElement(firstNameError);
    }
    public String getLastNameText(){
        return getTextFromElement(lastNameError);
    }
    public String getEmailText(){
        return getTextFromElement(emailError);
    }
    public String getPasswordText(){
        return getTextFromElement(passwordError);
    }
    public String getConfirmPasswordText(){
        return getTextFromElement(confirmPasswordError);
    }

}
