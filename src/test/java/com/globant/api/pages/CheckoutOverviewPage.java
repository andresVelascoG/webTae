package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {
    public CheckoutOverviewPage(WebDriver diver) {
        super(diver);
    }

    @FindBy(id = "finish")
    private WebElement finishButton;

    public WebElement getFinishButton(){
        return this.finishButton;
    }

    public CheckoutCompletePage pressFinishButton(){
        finishButton.click();
        return new CheckoutCompletePage(super.getDriver());
    }
}
