package com.globant.api.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

@Data
public class MainDriver {

    private WebDriver driver;

    public MainDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

}
