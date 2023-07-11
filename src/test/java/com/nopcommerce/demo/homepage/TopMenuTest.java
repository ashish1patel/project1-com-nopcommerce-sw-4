package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.Pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    /*
  create class "TopMenuTest"
  1.1 create method with name "selectMenu" it has one parameter name "menu" of type
  string
  1.2 This method should click on the menu whatever name is passed as parameter.
   */


    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        topMenuPage.selectMenu("Gift Cards");
    }


}
