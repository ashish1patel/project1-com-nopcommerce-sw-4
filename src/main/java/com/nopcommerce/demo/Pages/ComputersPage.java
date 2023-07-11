package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By desktopsClick = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
    By positionLink = By.xpath("//select[@id='products-orderby']");
    By addToCartLink = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    By buildYourOwnText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorLink = By.id("product_attribute_1");
    By ramLink = By.xpath("//select[@id='product_attribute_2']");
    By hddRadioLink = By.id("product_attribute_3_7");
    By osRadioLink = By.id("product_attribute_4_9");
    By softwareLink1 = By.id("product_attribute_5_10");
    By softwareLink3 = By.id("product_attribute_5_12");
    By matchPrice = By.id("price-value-1");
    By addToCartLink1 = By.id("add-to-cart-button-1");
    By verifyMessage = By.xpath("//p[@class='content']");
    By closeLink = By.className("close");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By scText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQuantity = By.xpath("//input[@aria-label='Qty.']");
    By updateQuantity = By.xpath("//button[@id='updatecart']");
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By termsOfServiceCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By welcomePageSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");
    By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox = By.id("BillingNewAddress_LastName");
    By emailTextBox = By.id("BillingNewAddress_Email");
    By countryDropdown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalcodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.id("shippingoption_1");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By continueButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton3 = By.xpath("//button[contains(text(),'Continue')]");
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnDesktops() {
        clickOnElement(desktopsClick);
    }

    public void sortByPosition(String position) {
        selectByVisibleTextFromDropDown(positionLink, position);
    }

    public void addToCart() {
        clickOnElement(addToCartLink);
    }

    public String getWelcomeText() {
        return getTextFromElement(buildYourOwnText);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorLink, processor);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramLink, ram);
    }

    public void selectHDDRadio() {
        clickOnElement(hddRadioLink);
    }

    public void selectOsRadio() {
        clickOnElement(osRadioLink);
    }

    public void selectSoftware1() {
        clickOnElement(softwareLink1);
    }

    public void selectSoftware3() {
        clickOnElement(softwareLink3);
    }

    public String verifyPrice() {
        return getTextFromElement(matchPrice);
    }

    public void addToCart1() {
        clickOnElement(addToCartLink1);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyMessage);
    }

    public void clickOnClose() {
        clickOnElement(closeLink);
    }

    public void moveToShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCart);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(scText);
    }

    public void updateShoppingCart() {
        driver.findElement(changeQuantity).clear();
        sendTextToElement(changeQuantity, "2");
        clickOnElement(updateQuantity);
    }

    public String getTotalText() {
        return getTextFromElement(total);
    }

    public void clickOnTermsOfServiceCheckBox() {
        clickOnElement(termsOfServiceCheckBox);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public String getWelcomePageSignInText() {
        return getTextFromElement(welcomePageSignInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void inputFirstname(String firstname) {
        sendTextToElement(firstNameTextBox, firstname);
    }

    public void inputLastname(String lastname) {
        sendTextToElement(lastNameTextBox, lastname);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void selectCountry(String countryname) {
        selectByVisibleTextFromDropDown(countryDropdown, countryname);
    }

    public void inputCity(String cityname) {
        sendTextToElement(cityTextBox, cityname);
    }

    public void inputAddress1(String address) {
        sendTextToElement(address1TextBox, address);
    }

    public void inputPostalCode(String postcode) {
        sendTextToElement(postalcodeTextBox, postcode);
    }

    public void inputPhoneNumber(String phone) {
        sendTextToElement(phoneNumberTextBox, phone);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinueButton() {
        clickOnElement(paymentContinue);
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
        selectByVisibleTextFromDropDown(expireMonthDropdown, expirymonth);
    }

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

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public void clickOnRadioButton2ndDayAir() {
        clickOnElement(radioButton2ndDayAir);
    }

    public String get02ndDayText() {
        return getTextFromElement(secondDayAirText);
    }

    public String getTotalAmountNokiaText() {
        return getTextFromElement(totalAmountNokiaText);
    }

    public String getWelcomeOurStoreText() {
        return getTextFromElement(welcomeOurStoreText);
    }

}

