package com.globant.api.tests;

import com.globant.api.pages.HomePage;
import com.globant.api.pages.LoginPage;
import com.globant.api.pages.MenuBar;
import com.globant.api.utils.basePage.BasePage;
import com.globant.api.utils.baseTest.BaseHomeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Logout extends BaseHomeTest {
    //I need to log out from the page
    @Test
    public void logoutTest(){
        HomePage home =loadFirstPage();
        MenuBar menuBar = home.pressBurgerMenu();
        menuBar.waitElementVisibility(menuBar.getLogoutButton());
        LoginPage loginPage = menuBar.pressLogoutButton();
        loginPage.waitElementVisibility(loginPage.getUsernameField());
        assertTrue(loginPage.isElementDisplayed(loginPage.getUsernameField()), "The username of the login page should be displayed");
    }
}
