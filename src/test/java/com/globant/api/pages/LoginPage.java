package com.globant.api.pages;

import com.globant.api.utils.basePage.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public HomePage performLogin(String username, String password){
        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
        return new HomePage(super.getDriver());
    }
}
