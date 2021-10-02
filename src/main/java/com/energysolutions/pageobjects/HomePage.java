package com.energysolutions.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(partialLinkText = "orders")
    public WebElement orderLink;

    @FindBy(xpath = "//button[contains(.,'New Order')]")
    public WebElement newOrderButton;

    public void clickOnOrderLink(){
        $(orderLink).waitUntilClickable().click();
    }

    public void clickOnNewOrder(){
        $(newOrderButton).waitUntilClickable().click();
    }
}
