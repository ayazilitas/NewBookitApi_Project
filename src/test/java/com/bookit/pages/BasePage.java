package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public  BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy (xpath ="//input[@name='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//button[.='sign in']")
    public  WebElement signInButton;
}
