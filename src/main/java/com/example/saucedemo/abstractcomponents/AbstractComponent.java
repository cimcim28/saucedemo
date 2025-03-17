package com.example.saucedemo.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
    protected WebDriver driver;

    // Konstruktor untuk menerima driver
    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
    }

    // Method untuk menunggu visibility element (menggunakan WebElement)
    protected void waitForElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}