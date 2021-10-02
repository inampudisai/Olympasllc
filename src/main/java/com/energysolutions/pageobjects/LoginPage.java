package com.energysolutions.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:home.page")
public class LoginPage extends PageObject {

    @FindBy(id = "LoginId")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    public void waitUntilLoginButtonClickable(){
        $(loginButton).waitUntilClickable();
    }

}
