package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {
    By actualTextOverNightDuffle = By.xpath("//span[@class='base']");
    By changeQuantity = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By actualText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
   // By viewAndEditCart = By.linkText("View and Edit Cart");

    public String getActualTextOvernightDuffle(){ return getTextFromElement(actualTextOverNightDuffle);}
    public void changeQuantityTo3(String quantity) {
        clearTextToElement(changeQuantity);
        sendTextToElement(changeQuantity,quantity);}
    public void clickOnAddToCartButton(){clickOnElement(addToCart);}
    public String getActualText(){ return getTextFromElement(actualText);}
    public void clickOnShoppingCartLink(){ clickOnElement(shoppingCart);}

}
