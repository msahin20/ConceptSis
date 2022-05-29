package com.conceptsis.pages;

import com.conceptsis.utilitites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy (xpath = "//input[@id='tbxUserName']")
    public WebElement inputBox;


    @FindBy (xpath = "//input[@id='tbxPassword']")
    public WebElement passwordBox;

    @FindBy (xpath = "//input[@name='btnSubmit']")
    public WebElement submit;

}
