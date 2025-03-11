package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver diver) {
        super(diver);
    }
    @FindBy(className = "title")
    private WebElement MainTitle;
}
