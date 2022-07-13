package com.demo.nopcommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.xml.dom.XDom;

public class RegisterPage {
    WebDriver driver;

    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By Dob= By.id("DateOfBirthDay");
    By Dom = By.id("DateOfBirthMonth");
    By Doy = By.id("DateOfBirthYear");
    By email = By.id("Email");
    By password = By.id("Password");
    By CPassword = By.id("ConfirmPassword");
    By RButton = By.id("register-button");

    public RegisterPage(WebDriver driver){
        this.driver=driver;

    }

    public void doRegister(String firstname, String lastname, String date, String month, String year, String mail, String pwd, String CPwd) {
  driver.findElement(firstName).sendKeys(firstname);
  driver.findElement(lastName).sendKeys(lastname);
  driver.findElement(Dob).sendKeys(date);
  driver.findElement(Dom).sendKeys(month);
  driver.findElement(Doy).sendKeys(year);
  driver.findElement(email).sendKeys(mail);
  driver.findElement(password).sendKeys(pwd);
  driver.findElement(CPassword).sendKeys(CPwd);
  driver.findElement(RButton).click();
    }


}
