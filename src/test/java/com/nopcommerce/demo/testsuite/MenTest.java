package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.PantsPage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPants();
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.clickOnSize32();
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.clickOnBlackColour();
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.addToCart();
        Assert.assertEquals(pantsPage.getActualText(), "You added Cronus Yoga Pant to your shopping cart.", "Error");
        pantsPage.clickOnShoppingCartInMessage();
        Assert.assertEquals(shoppingCartPage.getActualText(), "Shopping Cart", "Error");
        Assert.assertEquals(shoppingCartPage.getActualTextCronusYogaPant(), "Cronus Yoga Pant", "Error");
        Assert.assertEquals(shoppingCartPage.getActualSize32(), "32", "Error");
        Assert.assertEquals(shoppingCartPage.getColourBlack(), "Black", "Error");
    }
}
