package com.pomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPageObjects {

    WebDriver driver;

    SignupPageObjects(WebDriver Driver)
    {
        this.driver= Driver;
    }

    By email = new By.ById("email");

    By Submit = new By.ById("enterimg");

    public void setEmail(String arg)
    {
        driver.findElement(email).sendKeys(arg);
    }

    public void ClickSignupFormButton()
    {
        driver.findElement(Submit).click();
    }

    public void SignupPageUrl()
    {
        driver.get("http://demo.automationtesting.in/Index.html");
    }
}
