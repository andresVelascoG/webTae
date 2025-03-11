package com.globant.api.tests;

import com.globant.api.pages.CartPage;
import com.globant.api.pages.HomePage;
import com.globant.api.utils.baseTest.BaseHomeTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class DeleteProductsFromCart extends BaseHomeTest {

    @Test
    public void deleteProductsTest(){
        HomePage home = loadFirstPage();
        home.waitElementVisibility(home.getProductsListDiv());
        List<WebElement> productsList = home.getProductsList();
        home.slectEspecificElement(productsList,3);
        home.slectEspecificElement(productsList,2);
        home.slectEspecificElement(productsList,0);
        CartPage cartPage = home.pressCartButton();
        cartPage.waitElementVisibility(cartPage.getCartList());
        List<WebElement> cartProducts = cartPage.getCurrentProducts(cartPage.getCartList());
        assertTrue(cartProducts.size()==3, "The list of products should contain 3 products");
        cartPage.eliminateAllProducts(cartProducts);
        List<WebElement> emptycartProducts = cartPage.getCurrentProducts(cartPage.getCartList());
        assertTrue(emptycartProducts.size()==0, "The list shouldn't have products, it contains: "+emptycartProducts.size());

    }
    //I need to add 3 products that I can select and then eliminate them from the shopping cart
    //I need to validate that the cart is empty
}
