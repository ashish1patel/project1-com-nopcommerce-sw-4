package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By scText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQuantity = By.xpath("//input[@aria-label='Qty.']");
    By updateQuantity = By.xpath("//button[@id='updatecart']");
    By total = By.xpath("//span[@class='product-subtotal']");
    By termsOfServiceCheckBox = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By loginLink = By.xpath("//a[text()='Log in']");


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

    public String getVerifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    public void clickOnLogin() {
        clickOnElement(loginLink);
    }
}

