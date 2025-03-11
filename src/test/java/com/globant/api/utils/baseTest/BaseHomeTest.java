package com.globant.api.utils.baseTest;

import com.globant.api.pages.HomePage;
import com.globant.api.utils.MainDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseHomeTest {
    MainDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        driver = new MainDriver();
        driver.getDriver().manage().window().maximize();
        navigateTo("https://www.saucedemo.com/");
    }

    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    public HomePage loadFirstPage(){
        return new HomePage(driver.getDriver());
    }

    @AfterMethod()
    public void afterMethod() {
        driver.getDriver().close();
    }
}
