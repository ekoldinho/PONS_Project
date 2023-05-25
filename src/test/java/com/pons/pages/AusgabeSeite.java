package com.pons.pages;

import com.pons.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AusgabeSeite {

    public AusgabeSeite () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@itemprop='name'])[3]")
    public WebElement ausgabeWort;

}
