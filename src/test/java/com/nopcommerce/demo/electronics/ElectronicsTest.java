package com.nopcommerce.demo.electronics;

import com.nopcommerce.demo.Pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    ElectronicsPage electronics = new ElectronicsPage();
    ElectronicsPage cellPhones = new ElectronicsPage();
    ElectronicsPage nokiaLumia1020 = new ElectronicsPage();
    ElectronicsPage shoppingCart = new ElectronicsPage();
    ElectronicsPage login = new ElectronicsPage();
    ElectronicsPage register = new ElectronicsPage();
    ElectronicsPage checkout = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics”Tab
        electronics.hoverOnElectronics();

        //1.2 Mouse Hover on “Cell phones” and click
        electronics.hoverOnCellPhoneAndClick();

        //1.3 Verify the text “Cell phones”
        String actualText = cellPhones.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        electronics.hoverOnElectronics();

        //2.2 Mouse Hover on “Cell phones” and click
        electronics.hoverOnCellPhoneAndClick();

        //2.3 Verify the text “Cell phones”
        String actualText = cellPhones.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");

        //2.4 Click on List View Tab
        cellPhones.clickOnListViewTab();

        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        cellPhones.clickOnNokiaLumia1020();

        //2.6 Verify the text “Nokia Lumia 1020”
        String actualNokiaLumiaText = nokiaLumia1020.getNokiaLumiaText();
        Assert.assertEquals(actualNokiaLumiaText, "Nokia Lumia 1020", "Text not Displayed");

        //2.7 Verify the price “$349.00”
        String actualNokiaPriceText = nokiaLumia1020.getNokiaPriceText();
        Assert.assertEquals(actualNokiaPriceText, "$349.00", "Text not Displayed");

        //2.8 Change quantity to 2
        nokiaLumia1020.changeQuantity();

        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020.clickOnAddToCartButton();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
        String actualTextShoppingCart = nokiaLumia1020.getTextFromProductAddedToCart();
        Assert.assertEquals(actualTextShoppingCart, "The product has been added to your shopping cart", "Text not Displayed");
        nokiaLumia1020.closeTheBarByClickingOnTheCrossButton();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020.mouseHoverOnShoppingCart();
        nokiaLumia1020.clickOnShoppingCart();

        //2.12 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCart.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage, "Shopping cart", "error");
        Thread.sleep(2000);

        //2.13 Verify the quantity is 2
        Thread.sleep(2000);
        String actualQuantity = shoppingCart.getVerifyQuantity();
        Assert.assertEquals(actualQuantity, "(2)", "Error");

        //2.14 Verify the Total $698.00
        String actualTotal = shoppingCart.getVerifyTotal();
        Assert.assertEquals(actualTotal, "$698.00", "Error");

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCart.clickOnTermsOfServiceCheckBox();

        //2.16 Click on “CHECKOUT”
        shoppingCart.clickOnCheckOutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeText = login.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeText, "Welcome, Please Sign In!", "Error");

        //2.18 Click on “REGISTER” tab
        login.clickOnRegisterButton();

        //2.19 Verify the text “Register”
        String actualRegisterText = register.getRegisterText();
        Assert.assertEquals(actualRegisterText, "Register", "Error");

        //2.20 Fill the mandatory fields
        register.inputFirstname("Prime");
        register.inputLastname("testing");
        register.inputEmail("prime1230@gmail.com");
        register.inputPassword("prime123");
        register.inputConfirmPassword("prime123");

        //2.21 Click on “REGISTER” Button
        register.clickOnRegisterButton1();

        //2.22 Verify the message “Your registration completed”
        String actualRegisterSuccessMessage = register.getRegisterSuccessText();
        Assert.assertEquals(actualRegisterSuccessMessage, "Your registration completed", "error");

        //2.23 Click on “CONTINUE” tab
        register.clickOnContinueButton();

        //2.24 Verify the text “Shopping cart”
        String actualShoppingCartText = shoppingCart.getShoppingCartText1();
        Assert.assertEquals(actualShoppingCartText, "Shopping cart", "error");
        Thread.sleep(2000);

        //after this step cart become empty, so we need to login for next step
        login.clickOnLogin();
        login.inputEmail1("prime1230@gmail.com");
        login.inputPassword1("prime123");
        login.clickOnLogin1();

        //2.25 click on checkbox “I agree with the terms of service”#
        checkout.clickOnTermsOfServiceCheckBox();

//        //2.26 Click on “CHECKOUT”
        checkout.clickOnCheckOutButton();
//
        //2.27 Fill the Mandatory fields
        //checkout.inputFirstname1("prime123");
        // checkout.inputLastname1("testing");
        // checkout.inputEmail2("prime1235@gmail.com");
        checkout.selectCountry("United Kingdom");
        checkout.inputCity("London");
        checkout.inputAddress("12 Kings Road");
        checkout.inputPostalCode("HA2 9SG");
        checkout.inputPhoneNumber("01234567890");

        //2.28 Click on “CONTINUE”
        checkout.clickOnContinueButton1();


        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkout.clickOnRadioButton2ndDayAir();

        // 2.30 Click on “CONTINUE”
        checkout.clickOnContinueButton2();

        // 2.31 Select Radio Button “Credit Card”
        checkout.clickOnCreditCard();

        // Click on payment continue
        checkout.clickOnPaymentContinueButton();

        // 2.32 Select “Visa” From Select credit card dropdown
        checkout.selectCreditCard("Visa");

        //2.33 Fill all the details
        checkout.inputCardHolderName("primetesting");
        checkout.inputCardNumber("5521573041475125");
        checkout.selectExpireMonth("05");
        checkout.selectExpireYear("2024");
        checkout.inputCardCode("123");

        //2.34 Click on “CONTINUE” CHECKOUT.
        checkout.clickOnContinueButton3();

        // 2.35 Verify “Payment Method” is “Credit Card”
        String actualCreditCardText = checkout.getCreditCardText();
        Assert.assertEquals(actualCreditCardText, "Credit Card", "Wrong payment method");
        Thread.sleep(2000);

        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        String actualShippingMethodText = checkout.get2DayAirText();
        Assert.assertEquals(actualShippingMethodText, "2nd Day Air", "Wrong shipping method");
        Thread.sleep(2000);


        // 2.37 Verify Total is “$698.00”
        String actualTotalText = checkout.getTotalAmountText();
        Assert.assertEquals(actualTotalText, "$698.00", "Total amount is not match");
        Thread.sleep(2000);

        // 2.38 Click on “CONFIRM”
        checkout.clickOnConfirmButton();

        //2.39 Verify the Text “Thank You”
        String actualThankYouText = checkout.getThankYouText();
        Assert.assertEquals(actualThankYouText, "Thank you", "Something wrong");
        Thread.sleep(2000);


        //2.40 Verify the message “Your order has been successfully processed!”
        String actualSuccessfullyProcessedText = checkout.getOrderSuccessProcessText();
        Assert.assertEquals(actualSuccessfullyProcessedText, "Your order has been successfully processed!", "Something wrong");
        Thread.sleep(2000);

        // 2.41 Click on “CONTINUE”
        checkout.clickOnContinueButton4();


        // 2.42 Verify the text “Welcome to our store”
        String actualWelcomeOurStoreText = checkout.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeOurStoreText, "Welcome to our store", "Incorrect Message");
        Thread.sleep(2000);

        // 2.43 Click on “Logout” link
        checkout.clickOnLogOutButton();

        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualURL = driver.getCurrentUrl();
        // org.junit.Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/" );
        Assert.assertEquals(actualURL, "https://demo.nopcommerce.com/", "error");
    }

}


