package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBar extends BasePage {
    public MenuBar(WebDriver diver) {
        super(diver);
    }

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public WebElement getLogoutButton(){
        return this.logoutButton;
    }

    public LoginPage pressLogoutButton(){
        this.logoutButton.click();
        return new LoginPage(super.getDriver());
    }
}
