package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    By firstNameTextBox1 = By.id("FirstName");
    By lastNameTextBox = By.id("BillingNewAddress_LastName");
    By lastNameTextBox1 = By.id("LastName");
    By emailTextBox = By.id("BillingNewAddress_Email");
    By emailTextBox1 = By.id("Email");
    By passwordTextBox = By.id("Password");
    By confirmPasswordTextBox = By.id("ConfirmPassword");
    By registerButton1 = By.id("register-button");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By continueButton1 = By.xpath("//a[normalize-space()='Continue']");
    By countryDropdown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalCodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By registerSuccessText = By.xpath("//div[contains(text(),'Your registration completed')]");


    public void inputFirstname(String firstname) {
        sendTextToElement(firstNameTextBox, firstname);
    }

    public void inputFirstname1(String firstname1) {
        sendTextToElement(firstNameTextBox1, firstname1);
    }

    public void inputLastname(String lastname) {
        sendTextToElement(lastNameTextBox, lastname);
    }

    public void inputLastname1(String lastname1) {
        sendTextToElement(lastNameTextBox1, lastname1);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void inputEmail1(String email1) {
        sendTextToElement(emailTextBox1, email1);
    }

    public void selectCountry(String countryName) {
        selectByVisibleTextFromDropDown(countryDropdown, countryName);
    }

    public void inputCity(String cityName) {
        sendTextToElement(cityTextBox, cityName);
    }

    public void inputAddress1(String address) {
        sendTextToElement(address1TextBox, address);
    }

    public void inputPostalCode(String postcode) {
        sendTextToElement(postalCodeTextBox, postcode);
    }

    public void inputPhoneNumber(String phone) {
        sendTextToElement(phoneNumberTextBox, phone);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void inputConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordTextBox, confirmPassword);
    }

    public void clickOnRegisterButton1() {
        clickOnElement(registerButton1);
    }

    public String getRegisterSuccessText() {
        return getTextFromElement(registerSuccessText);
    }

}
