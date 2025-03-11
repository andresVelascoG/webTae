package com.globant.api.utils.basePage;

import com.globant.api.pages.LoginPage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Data
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver diver) {
        this.driver = diver;
        PageFactory.initElements(diver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    public void waitElementVisibility(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    /*
    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        waitElementVisibility(loginPage.getUsernameField());
        loginPage.getUsernameField().sendKeys(username);
        waitElementVisibility(loginPage.getPasswordField());
        loginPage.getPasswordField().sendKeys(password);
        waitElementVisibility(loginPage.getLoginButton());
        loginPage.getLoginButton().click();
    }
     */
}
