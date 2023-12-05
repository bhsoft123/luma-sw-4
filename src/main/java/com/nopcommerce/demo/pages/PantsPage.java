package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By cronusyogapant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.id("option-label-size-143-item-175");
    By colourBlack = By.id("option-label-color-93-item-49");
    By buttonAddToCart = By.xpath("//button[@type='submit']//span[contains(text(),'Add to Cart')]");
    By actualText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnCronusYogaPant(){ mouseHoverToElement(cronusyogapant);  }
    public void clickOnSize32(){ clickOnElement(size32); }
    public void clickOnBlackColour(){ clickOnElement(colourBlack);}
    public void addToCart(){ clickOnElement(buttonAddToCart);}
    public String getActualText(){ return getTextFromElement(actualText);  }
    public void clickOnShoppingCartInMessage(){ clickOnElement(shoppingCartLink); }


}
