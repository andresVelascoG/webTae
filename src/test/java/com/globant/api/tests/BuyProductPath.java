package com.globant.api.tests;

import com.globant.api.pages.*;
import com.globant.api.utils.basePage.BasePage;
import com.globant.api.utils.baseTest.BaseHomeTest;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

@Slf4j
public class BuyProductPath extends BaseHomeTest {

    //I need to get the list of products and select one of them randomized by a function
    //Then I need to continue all the shopping process until the end
    //I need to assert the title of "Thank you for your order"

    @Test
    public void buyProductPathTest(){
        HomePage home =loadFirstPage();
        home.waitElementVisibility(home.getProductsListDiv());
        List<WebElement> productsList = home.getProductsList();
        home.selectRandomElementsAndClickButton(productsList);
        CartPage cartPage = home.pressCartButton();
        CheckoutInformationPage checkoutInformationPage = cartPage.pressCheckoutButton();
        checkoutInformationPage.waitElementVisibility(checkoutInformationPage.getContinueButton());
        CheckoutOverviewPage checkoutOverviewPage = checkoutInformationPage.performCheckoutInformation("Andres", "Velasco", "0055044");
        checkoutOverviewPage.waitElementVisibility(checkoutOverviewPage.getFinishButton());
        CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.pressFinishButton();
        checkoutCompletePage.waitElementVisibility(checkoutCompletePage.getMainTitle());
        assertEquals(checkoutCompletePage.getMainTitle().getText().toLowerCase(), "thank you for your order!", "The title doesn't match");

    }
}
