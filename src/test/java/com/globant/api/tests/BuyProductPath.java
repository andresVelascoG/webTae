package com.globant.api.tests;

import com.globant.api.pages.HomePage;
import com.globant.api.utils.basePage.BasePage;
import com.globant.api.utils.baseTest.BaseHomeTest;
import org.testng.annotations.Test;

public class BuyProductPath extends BaseHomeTest {

    //I need to get the list of products and select one of them randomized by a function
    //Then I need to continue all the shopping process until the end
    //I need to assert the title of "Thank you for your order"

    @Test
    public void buyProductPathTest(){
        HomePage home =loadFirstPage();
    }
}
