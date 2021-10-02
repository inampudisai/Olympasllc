package com.energysolutions.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SelectGenerator extends PageObject {

    @FindBy(id = "CUST_SEQ_ID")
    public WebElement selectGeneratorDropDown;

    @FindBy(css = "input.btn")
    public WebElement clickOnSelectButton;

    public void selectGenerator(String name){
        $(selectGeneratorDropDown).waitUntilVisible();
        if(name.length()==0) {
            $(selectGeneratorDropDown).selectByVisibleText("Exelon Corporation/Quad Cities Nuclear Station");
        }else{
            $(selectGeneratorDropDown).selectByVisibleText(name);
        }

        clickOnSelectButton.click();
    }
}
