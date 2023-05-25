package com.pons.pages;

import com.pons.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hauptseite {

    public Hauptseite () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAkzeptieren;


    @FindBy (xpath = "//input[@class='input-large pons-search-input']")
    public WebElement suchfeld;

    @FindBy (xpath = "//a[@id='search_button']")
    public WebElement suchschaltfläche;

}
