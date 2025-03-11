package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver diver) {
        super(diver);
    }

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(className = "cart_list")
    private WebElement cartList;

    public WebElement getCartList(){
        return cartList;
    }

    public List<WebElement> getCurrentProducts(WebElement cartList){
        List<WebElement> items = cartList.findElements(By.className("cart_item"));
        return items;
    }

    public void eliminateAllProducts(List<WebElement> productList){
        for (WebElement product : productList) {
            WebElement cartButton = product.findElement(By.className("cart_button"));
            cartButton.click();
        }
    }

    public CheckoutInformationPage pressCheckoutButton(){
        this.checkoutButton.click();
        return new CheckoutInformationPage(super.getDriver());
    }

    //cart_list
}
