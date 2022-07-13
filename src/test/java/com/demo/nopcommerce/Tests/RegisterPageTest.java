package com.demo.nopcommerce.Tests;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Date;
import java.util.Properties;

public class RegisterPageTest {
    RegisterPage registerPage;
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    @BeforeMethod
    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("Browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);


    }
    public void RegisterTest() throws InterruptedException {
        registerPage.doRegister(prop.getProperty("FName"), prop.getProperty("LName"), prop.getProperty("Date"), prop.getProperty("Month"), prop.getProperty("year"), prop.getProperty("email"), prop.getProperty("RPassword"), prop.getProperty("ConfPassword"));
        Thread.sleep(1000);
    }
    @AfterMethod
            public void Teardown(){driver.quit();}



    }





