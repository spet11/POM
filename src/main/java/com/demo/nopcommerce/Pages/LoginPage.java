package com.demo.nopcommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By emailID = By.id("Email");
    By password = By.id("Password");
    By LoginButton = By.className("button-1 login-button");

// create Constructor of page class

    public LoginPage(WebDriver driver) {
        this.driver=driver;

    }

    // Page Action /Verification
    public  String getPageTitle() {
        String lpTitle=driver.getTitle();
        System.out.println("Login page Title is:" +lpTitle);
        return lpTitle;
    }
    public void doLogin(String userName, String pwd){
        driver.findElement(emailID).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(LoginButton).click();
    }
}

