package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.JacketsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();
    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.mouseHoverAndClickOnJackets();
        jacketsPage.selectProductNameFilter(" Product Name ");
        jacketsPage.verifyProductsNameInAlphabeticalOrder();
    }
    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.mouseHoverAndClickOnJackets();
        jacketsPage.selectPriceFiler("Price");
        Assert.assertEquals(jacketsPage.verifyProductsPricedInAlphabeticalOrder1(), jacketsPage.verifyProductsPricedInAlphabeticalOrder2());
    }
}

