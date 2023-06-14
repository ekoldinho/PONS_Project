package com.pons.step_definitions;

import com.pons.pages.Hauptseite;
import com.pons.pages.ShopSeite;
import com.pons.utilities.ConfigurationReader;
import com.pons.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class onlineShop_SchrittDefinitionen {

    Hauptseite hauptseite = new Hauptseite();

    ShopSeite shopSeite = new ShopSeite();

    @Given("Der Benutzer klickt auf die Schaltfläche „Shop“")
    public void derBenutzerKlicktAufDieSchaltflächeShop() {
        hauptseite.shopSchaltfläche.click();
    }

    @When("Der Benutzer klickt auf die Schaltfläche „Deutsch“, um nach deutschen Ressourcen zu suchen")
    public void derBenutzerKlicktAufDieSchaltflächeDeutschUmNachDeutschenRessourcenZuSuchen() {
        shopSeite.ressourcenAufDeutsch.click();
    }

    @And("Der Benutzer sucht nach Ressourcen in der Kategorie „Grammatik“")
    public void derBenutzerSuchtNachRessourcenInDerKategorieGrammatik() {
        shopSeite.kategorieGrammatik.click();
    }

    @And("Der Benutzer wendet Filter in Themenwelten an")
    public void derBenutzerWendetFilterInThemenweltenAn() {
        shopSeite.themenwelten.click();
    }

    @And("Der Benutzer wählt Ressourcen im Schulthema aus")
    public void derBenutzerWähltRessourcenImSchulthemaAus() {
        shopSeite.schulThema.click();
        shopSeite.produkteAnzeigenSchaltfläche.click();
    }

    @And("Der Benutzer fügt das erste aufgeführte Produkt dem Warenkorb hinzu")
    public void derBenutzerFügtDasErsteAufgeführteProduktDemWarenkorbHinzu() {
        shopSeite.warenkorbIkon.click();
    }

    @Then("Der Benutzer kauft weiter ein")
    public void derBenutzerKauftWeiterEin() {
        shopSeite.weiterEinkaufenSchaltfläche.click();
    }
}
