package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By desktopsClick = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");


    By welcomeOurStoreText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By electronicsCategory = By.xpath("//a[text()='Electronics ']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");


    //create method with name "selectMenu" it has one parameter name "menu" of type string
    static String menu;

    public String selectMenu(String menu) {
        this.menu = menu;
        List<WebElement> topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
        }
        return getTextFromElement(By.xpath("//h1[contains(text()," + "'" + menu + "')]"));
    }

    public void clickOnDesktops() {
        clickOnElement(desktopsClick);
    }

    public String getWelcomeOurStoreText() {
        return getTextFromElement(welcomeOurStoreText);
    }

    public void hoverOnElectronics() {
        mouseHoverToElement(electronicsCategory);
    }

    public void hoverOnCellPhoneAndClick() {
        mouseHoverToElementAndClick(cellPhone);
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
    }

}
