package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

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
}
