package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;




public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;

    public WebDriver initialiseDriver(String BrowserName) {
        switch (BrowserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

                break;
            default:
                System.out.println("Browser not Invalid Use");
                break;
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public Properties initialiseProperties(){

        prop = new Properties();

        try {

            file = new FileInputStream("C:\\Users\\sanju\\IdeaProjects\\POM\\src\\test\\resources\\TestData\\Config.Properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            System.out.println("config file is not found,Please Check");
        } catch (IOException e) {
            System.out.println("Properties could not be loaded......");
            e.printStackTrace();
        }
        return prop;
    }
}
