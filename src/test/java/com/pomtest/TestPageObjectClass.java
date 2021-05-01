package com.pomtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageObjectClass {

    @Test
    public void SignupForm()
    {
        WebDriver driver = new ChromeDriver();
        SignupPageObjects SignupPage = new SignupPageObjects(driver);
        SignupPage.SignupPageUrl();
        SignupPage.setEmail("mrgsathyaraj@gmail.com");
        SignupPage.ClickSignupFormButton();
    }








}
