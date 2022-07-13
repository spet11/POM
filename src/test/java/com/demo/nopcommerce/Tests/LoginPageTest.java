package com.demo.nopcommerce.Tests;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPage;
    BasePage basePage;
    Properties prop;

    @BeforeMethod
    public void OpenBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("URL"));
        loginPage = new LoginPage(driver);
    }

    @Test (priority = 1)
    public void verifyLoginPageTitleTest() {
        Assert.assertEquals(loginPage.getPageTitle(), "nopcommerce demo store.Login",
                "Login Page Title not matched");

    }@Test(priority = 2)
    public void LoginTest() throws InterruptedException {
        loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
        Thread.sleep(1000);
    }
       @AfterMethod
        public void teardown()
        {
            driver.quit();
        }
    }




