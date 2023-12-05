package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BagsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.OverNightDufflePage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
@Test
public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
    homePage.mouseHoverOnGearMenu();
    Thread.sleep(2000);
    homePage.mouseHoverAndClickOnBags();
    bagsPage.clickOnOvernightDuffle();
    Assert.assertEquals(overNightDufflePage.getActualTextOvernightDuffle(), "Overnight Duffle","Error");
    overNightDufflePage.changeQuantityTo3("3");
    overNightDufflePage.clickOnAddToCartButton();
    Assert.assertEquals(overNightDufflePage.getActualText(), "You added Overnight Duffle to your shopping cart.","Error");
    overNightDufflePage.clickOnShoppingCartLink();
    //Assert.assertEquals(shoppingCartPage.getActualTextCornusYogaPant(), "Cronus Yoga Pant","Error");
/*Verify the product name ‘Cronus Yoga Pant’
* Verify the Qty is ‘3’
* Verify the product price ‘$135.00’
* Change Qty to ‘5’
* Click on ‘Update Shopping Cart’ button
* Verify the product price ‘$225.00’*/



}
}
