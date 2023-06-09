package com.pons.pages;

import com.pons.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AusgabeSeite {

    public AusgabeSeite () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"de\"]/div[2]/h1/em")
    public WebElement ausgabeWort;

    @FindBy (xpath = "(//span[@class='wordclass']/acronym[@title])[1]")
    public WebElement wertTyp;


}
