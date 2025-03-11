package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends BasePage {
    public CheckoutInformationPage(WebDriver diver) {
        super(diver);
    }
    @FindBy(id = "name")
    private WebElement nameInput;

}
