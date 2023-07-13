package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By nextDayAirRadioButton = By.id("shippingoption_1");
    By radioButton2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By continueButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By secondDayAirText = By.xpath("//span[normalize-space()='2nd Day Air']");
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton4 = By.xpath("//button[contains(text(),'Continue')]");
    By firstNameTextBox1 = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox1 = By.id("BillingNewAddress_LastName");
    By emailTextBox2 = By.id("BillingNewAddress_Email");
    By countryDropdown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalCodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton3 = By.xpath("//button[@onclick='Billing.save()']");


    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);}

    public void clickOnPaymentContinueButton() {
        clickOnElement(paymentContinueButton);
    }

    public void selectCreditCard(String card) {
        selectByVisibleTextFromDropDown(creditCardDropDown, card);
    }

    public void inputCardHolderName(String holdername) {
        sendTextToElement(cardHolderName, holdername);
    }

    public void inputCardNumber(String card) {
        sendTextToElement(cardNumber, card);
    }

    public void selectExpireMonth(String expirymonth) {
        selectByVisibleTextFromDropDown(expireMonthDropdown, expirymonth);}

    public void selectExpireYear(String expiryyear) {
        selectByVisibleTextFromDropDown(expireYearDropdown, expiryyear);
    }

    public void inputCardCode(String cvc) {
        sendTextToElement(cardCode, cvc);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        return getTextFromElement(nextDayAirText);
    }

    public String get2DayAirText() {
        return getTextFromElement(secondDayAirText);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountText);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getOrderSuccessProcessText() {
        return getTextFromElement(orderSuccessProcessText);
    }

    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
    }

    public void inputFirstname1(String firstname) {
        sendTextToElement(firstNameTextBox1, firstname);
    }

    public void inputLastname1(String lastname) {
        sendTextToElement(lastNameTextBox1, lastname);
    }

    public void inputEmail2(String email) {
        sendTextToElement(emailTextBox2, email);
    }

    public void selectCountry(String countryname) {
        selectByVisibleTextFromDropDown(countryDropdown, countryname);
    }

    public void inputCity(String cityname) {
        sendTextToElement(cityTextBox, cityname);
    }

    public void inputAddress(String address) {
        sendTextToElement(address1TextBox, address);
    }

    public void inputPostalCode(String postcode) {
        sendTextToElement(postalCodeTextBox, postcode);
    }

    public void inputPhoneNumber(String phone) {
        sendTextToElement(phoneNumberTextBox, phone);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public void clickOnRadioButton2ndDayAir() {
        clickOnElement(radioButton2ndDayAir);
    }

}
