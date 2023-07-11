package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.Pages.ComputersPage;
import com.nopcommerce.demo.Pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends BaseTest {
    /*
    1.Test name verifyProductArrangeInAlphaBaticalOrder()
1.1 Click on Computer Menu.
1.2 Click on Desktop
1.3 Select Sort By position "Name: Z to A"
1.4 Verify the Product will arrange in Descending order.

     */

    TopMenuPage topMenuPage = new TopMenuPage();
    ComputersPage computersPage = new ComputersPage();

    @Test
    public void verifyProductArrangeInAlphabaticalOrder() {
        // 1.1 Click on Computer Menu.
        topMenuPage.selectMenu("Computers");

        //1.2 Click on Desktop
        computersPage.clickOnDesktops();

        //get list before filter the name
        List<WebElement> beforeFilterNameZtoAList = driver.findElements(By.xpath("item-grid"));
        List<Double> beforeFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : beforeFilterNameZtoAList) {
            beforeFileNameZtoAList.add(Double.valueOf(nameZtoA.getText().replace("$", "")));
        }

        //1.3 Select Sort By position "Name: Z to A"
        computersPage.sortByPosition("Name: Z to A");

        //Get list after filter name
        List<WebElement> afterFilterNameZtoAList = driver.findElements(By.xpath("item-grid"));
        List<Double> afterFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : afterFilterNameZtoAList) {
            afterFileNameZtoAList.add(Double.valueOf(nameZtoA.getText().replace("$", "")));
        }

        //1.4 Verify the Product will arrange in Descending order.
        Collections.sort(beforeFileNameZtoAList);
        Assert.assertEquals(beforeFilterNameZtoAList, afterFilterNameZtoAList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        topMenuPage.selectMenu("Computers");

        //2.2 Click on Desktop
        computersPage.clickOnDesktops();

        //2.3 Select Sort By position "Name: A to Z"
        computersPage.sortByPosition("Name: A to Z");

        //2.4 Click on "Add To Cart"
        Thread.sleep(2000);
        computersPage.addToCart();

        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = computersPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class 2.7.Select "8GB [+$60.00]" using Select class.
        computersPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");

        // 2.7.Select "8GB [+$60.00]" using Select class.
        computersPage.selectRam("8GB [+$60.00]");

        //2.8 Select HDD radio "400 GB [+$100.00]"
        computersPage.selectHDDRadio();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computersPage.selectOsRadio();

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(2000);
        computersPage.selectSoftware1();
        Thread.sleep(2000);
        computersPage.selectSoftware3();

        //2.11 Verify the price "$1,475.00"
        // String expectedPrice = "$1,420.00";
        // String actualPrice = computersPage.verifyPrice();
        // Assert.assertEquals(actualPrice,expectedPrice,"price not match");

        //2.12 Click on "ADD TO CARD" Button.
        computersPage.addToCart1();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = computersPage.verifyTheMessage();
        Assert.assertEquals(actualText2, expectedText2);

        //After that close the bar clicking on the cross button.
        computersPage.clickOnClose();


        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(3000);
        computersPage.moveToShoppingCart();
        computersPage.clickOnGoToCart();

        //2.15 Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = computersPage.verifyShoppingCartText();
        Assert.assertEquals(expectedText3, actualText3);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computersPage.updateShoppingCart();

        //2.17 Verify the Total"$2,850.00
        //String actualTotalMessage = computersPage.getTotalText();
        //  Assert.assertEquals(actualTotalMessage, "$2,850.00", "error");

        // 2.18 click on checkbox “I agree with the terms of service”
        computersPage.clickOnTermsOfServiceCheckBox();

        // 2.19 Click on “CHECKOUT”
        computersPage.clickOnCheckOutButton();

        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSignInText = computersPage.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeSignInText, "Welcome, Please Sign In!", "error");

        //2.21 Click on “CHECKOUT AS GUEST” Tab
        computersPage.clickOnCheckoutAsGuestButton();
        //2.22 Fill the all mandatoryfield
        computersPage.inputFirstname("Prime");
        computersPage.inputLastname("Patel");
        computersPage.inputEmail("Prime234Patel@gmail.com");
        computersPage.selectCountry("United Kingdom");
        computersPage.inputCity("London");
        computersPage.inputAddress1("12 Downing street");
        computersPage.inputPostalCode("NW5 6JH");
        computersPage.inputPhoneNumber("12345678");

        //2.23 Click on “CONTINUE”
        computersPage.clickOnContinueButton();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        computersPage.clickOnNextDayAirRadioButton();

        // 2.25 Click on “CONTINUE”
        computersPage.clickOnContinueButton1();

        // 2.26 Select Radio Button “Credit Card”
        computersPage.clickOnCreditCard();
        computersPage.clickOnPaymentContinueButton();

        //2.27 Select “Master card” From Select credit card dropdown
        computersPage.selectCreditCard("Master card");

        //2.28 Fill all the details
        computersPage.inputCardHolderName("Mr Prime Patel");
        computersPage.inputCardNumber("5356 6548 1418 5420");
        computersPage.selectExpireMonth("12");
        computersPage.selectExpireYear("2028");
        computersPage.inputCardCode("598");

        // 2.29 Click on “CONTINUE”
        computersPage.clickOnContinueButton2();

        //2.30 Verify “Payment Method” is “Credit Card”
        String actualCardMessage = computersPage.getCreditCardText();
        Assert.assertEquals(actualCardMessage, "Credit Card", "error");

        // 2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShippingMessage = computersPage.getNextDayAirText();
        Assert.assertEquals(actualShippingMessage, "Next Day Air", "error");

        //2.33 Verify Total is “$2,950.00”
        // String actualTotalAmountMessage = computersPage.getTotalAmountText();
        // Assert.assertEquals(actualTotalMessage, "$2,950.00", "error");

        //2.34 Click on “CONFIRM”
        computersPage.clickOnConfirmButton();

        //2.35 Verify the Text “Thank You”
        String actualThankYouText = computersPage.getThankYouText();
        Assert.assertEquals(actualThankYouText, "Thank you", "error");

        // 2.36 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessText = computersPage.getOrderSuccessProcessText();
        Assert.assertEquals(actualOrderSuccessText, "Your order has been successfully processed!", "error");

        // 2.37 Click on “CONTINUE”
        computersPage.clickOnContinueButton3();

        // 2.38 Verify the text “Welcome to our store”
        String actualWelcomeStoreText = computersPage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeStoreText, "Welcome to our store", "error");

    }


}
