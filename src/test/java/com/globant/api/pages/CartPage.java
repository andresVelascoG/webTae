package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver diver) {
        super(diver);
    }

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CheckoutInformationPage pressCheckoutButton(){
        this.checkoutButton.click();
        return new CheckoutInformationPage(super.getDriver());
    }
}
