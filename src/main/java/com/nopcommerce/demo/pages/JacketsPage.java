package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsPage extends Utility {

    By sortby = By.id("sorter");
    By productname1 = By.xpath("//strong[@class='product name product-item-name']");
    By price = By.xpath("//div[@class='price-box price-final_price']");

    public void clickOnSortByDropDown() {
        clickOnElement(sortby);
    }
    public void selectProductNameFilter(String filtername){
        selectByVisibleTextFromDropDown(sortby, filtername);    }

    public void verifyProductsNameInAlphabeticalOrder(){
        List< WebElement> originalproducts = driver.findElements(productname1);
        int totalProductsPerPage = originalproducts.size();
        ArrayList<String> originalList = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        for(WebElement e : originalproducts){
            originalList.add(e.getText());
            tempList.add(e.getText());
        }
        Collections.sort(tempList);
        System.out.println("Original list:" +originalList);
        System.out.println("Sorted list:" +tempList);

        if(originalList == tempList){
            System.out.println("products are sorted");
        } else {
            System.out.println("products are not sorted");
        }
    }
public void selectPriceFiler(String price){
        selectByVisibleTextFromDropDown(sortby,price);
}
public ArrayList<String> verifyProductsPricedInAlphabeticalOrder1(){
        List <WebElement> originalProductsPrice = driver.findElements(price);
        ArrayList<String> originalPrice = new ArrayList<>();
        for(WebElement e : originalProductsPrice){
            originalPrice.add(String.valueOf(e.getText()));
        }
    System.out.println("Original Price" + originalPrice);
        return originalPrice;
}
    public ArrayList<String> verifyProductsPricedInAlphabeticalOrder2() {
        List<WebElement> originalProductsPrice = driver.findElements(price);
        ArrayList<String> tempPrice = new ArrayList<>();
        for (WebElement e : originalProductsPrice) {
            tempPrice.add(String.valueOf(e.getText()));
        }
        Collections.sort(tempPrice);
        System.out.println("Sorted Price: "+tempPrice);
        return tempPrice;
    }
}