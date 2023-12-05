package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By actualTextShoppingCart = By.xpath("//span[@class='base']");
    By actualTextCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By colour = By.xpath("//dd[contains(text(),'Black')]");
    public String getActualText(){ return getTextFromElement(actualTextShoppingCart);}
    public String getActualTextCronusYogaPant(){ return getTextFromElement(actualTextCronusYogaPant);}
    public String getActualSize32(){return getTextFromElement(size);}
    public String getColourBlack(){ return getTextFromElement(colour);}


}
