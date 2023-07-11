package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ElectronicsPage extends Utility {
    By electronicsCategory = By.xpath("//a[text()='Electronics ']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumiaText = By.xpath("//h1");
    By nokiaPriceText = By.id("price-value-20");
    By cartQuantity = By.id("product_enteredQuantity_20");
    By addToCartButton = By.id("add-to-cart-button-20");
    By productAddedToCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeTheBarMsg = By.xpath("//span[@title='Close']");
    By shoppingCartElement = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartElement = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By termsOfServiceCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By welcomePageSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameTextBox = By.id("FirstName");
    By lastNameTextBox = By.id("LastName");
    By emailTextBox = By.id("Email");
    By passwordTextBox = By.id("Password");
    By confirmPasswordTextBox = By.id("ConfirmPassword");
    By registerButton1 = By.id("register-button");
    By registerSuccessText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    By shoppingCartText1 = By.xpath("//h1[normalize-space()='Shopping cart']");
    By loginLink = By.xpath("//a[text()='Log in']");
    By emailTextBox1 = By.xpath("//input[@id='Email']");
    By passwordTextBox1 = By.xpath("//input[@id='Password']");
    By loginLink1 = By.xpath("//button[@class='button-1 login-button']");
    By firstNameTextBox1 = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox1 = By.id("BillingNewAddress_LastName");
    By emailTextBox2 = By.id("BillingNewAddress_Email");
    By countryDropdown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalCodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton1 = By.xpath("//button[@onclick='Billing.save()']");
    By radioButton2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By continueButton2 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropdown = By.id("ExpireMonth");
    By expireYearDropdown = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton3 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[normalize-space()='Credit Card']");
    By secondDayAirText = By.xpath("//span[normalize-space()='2nd Day Air']");
    By totalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessProcessText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton4 = By.xpath("//button[contains(text(),'Continue')]");
    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");


    public void hoverOnElectronics() {
        mouseHoverToElement(electronicsCategory);
    }

    public void hoverOnCellPhoneAndClick() {
        mouseHoverToElementAndClick(cellPhone);
    }

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

    public String getNokiaLumiaText() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String getNokiaPriceText() {
        return getTextFromElement(nokiaPriceText);
    }

    public void changeQuantity() {
        sendTextToElement(cartQuantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getTextFromProductAddedToCart() {
        return getTextFromElement(productAddedToCartText);
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        clickOnElement(closeTheBarMsg);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCartElement);
    }

    public void clickOnShoppingCart() {
        clickOnElement(goToCartElement);
    }

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String getVerifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnTermsOfServiceCheckBox() {
        clickOnElement(termsOfServiceCheckBox);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public String getWelcomePageSignInText() {
        return getTextFromElement(welcomePageSignInText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegisterText() {
        return getTextFromElement(registerText);
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

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void inputConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordTextBox, confirmpassword);
    }

    public void clickOnRegisterButton1() {
        clickOnElement(registerButton1);
    }

    public String getRegisterSuccessText() {
        return getTextFromElement(registerSuccessText);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String getShoppingCartText1() {
        return getTextFromElement(shoppingCartText1);
    }

    public void clickOnLogin() {
        clickOnElement(loginLink);
    }

    public void inputEmail1(String email1) {
        sendTextToElement(emailTextBox1, email1);
    }

    public void inputPassword1(String password1) {
        sendTextToElement(passwordTextBox1, password1);
    }

    public void clickOnLogin1() {
        clickOnElement(loginLink1);
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

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnRadioButton2ndDayAir() {
        clickOnElement(radioButton2ndDayAir);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
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

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
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

    public String getWelcomeOurStoreText() {
        return getTextFromElement(welcomeOurStoreText);
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
    }
}


