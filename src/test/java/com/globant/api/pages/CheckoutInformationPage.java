package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends BasePage {
    public CheckoutInformationPage(WebDriver diver) {
        super(diver);
    }
    @FindBy(id = "first-name")
    private WebElement nameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public WebElement getContinueButton(){
        return this.continueButton;
    }
    public CheckoutOverviewPage performCheckoutInformation(String firstName, String lastName, String postalCode){
        this.nameInput.sendKeys(firstName);
        this.lastNameInput.sendKeys(lastName);
        this.postalCodeInput.sendKeys(postalCode);
        this.continueButton.click();
        return new CheckoutOverviewPage(super.getDriver());
    }
}
