package com.pons.pages;

import com.pons.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopSeite {

    public ShopSeite () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"sticky-wrapper\"]/nav/div/div[1]/ul/li[5]/a/span")
    public WebElement ressourcenAufDeutsch;

    @FindBy (xpath = "(//a[@href=\"https://de.pons.com/shop/deutsch/grammatik/\"])[2]")
    public WebElement kategorieGrammatik;

    @FindBy (xpath = "//label[@title='Themenwelten']")
    public WebElement themenwelten;

    @FindBy (xpath = "//label[@for='__f__72']")
    public WebElement schulThema;

    @FindBy (xpath = "//span[@data-filter-param='__f__72']")
    public WebElement ausgewähltesThema;

    @FindBy (xpath = "(//button[@class='btn is--primary filter--btn-apply is--large is--icon-right'])[2]")
    public WebElement produkteAnzeigenSchaltfläche;

    @FindBy (xpath = "(//button[@aria-label='In den Warenkorb'])[1]")
    public WebElement warenkorbIkon;

    @FindBy (xpath = "//a[@class=' close--off-canvas btn is--gradient-grey is--secondary']")
    public WebElement weiterEinkaufenSchaltfläche;

    @FindBy (xpath = "/html/body/div/div[3]/div/h1")
    public WebElement seitentitel;

    @FindBy (xpath = "//*[@id=\"filter\"]/div[3]/span/span")
    public WebElement filterHinzugefügt;

    @FindBy (xpath = "(//a[@class='product--title'])[1]")
    public WebElement produktHinzugefügt;

    @FindBy (xpath = "//span[@class='item--name']")
    public WebElement produktImWarenkorb;




}
