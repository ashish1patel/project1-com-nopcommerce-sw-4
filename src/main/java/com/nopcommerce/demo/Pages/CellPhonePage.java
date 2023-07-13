package com.nopcommerce.demo.Pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }
}
