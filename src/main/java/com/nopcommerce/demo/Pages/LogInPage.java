package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {

    By welcomePageSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");
    By emailTextBox = By.xpath("//input[@id='Email']");
    By passwordTextBox = By.xpath("//input[@id='Password']");
    By loginLink = By.xpath("//button[@class='button-1 login-button']");

    public String getWelcomePageSignInText() {
        return getTextFromElement(welcomePageSignInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void inputEmail(String email) {
        sendTextToElement(emailTextBox, email);
    }

    public void inputPassword(String password) {
        sendTextToElement(passwordTextBox, password);
    }

    public void clickOnLogin() {
        clickOnElement(loginLink);
    }

}
