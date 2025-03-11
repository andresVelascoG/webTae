package com.globant.api.utils;

import com.globant.api.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }
}
