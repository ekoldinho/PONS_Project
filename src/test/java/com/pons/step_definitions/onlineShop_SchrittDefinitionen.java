package com.pons.step_definitions;

import com.pons.pages.Hauptseite;
import com.pons.pages.ShopSeite;
import com.pons.utilities.ConfigurationReader;
import com.pons.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
    @And("Der Benutzer überprüft die Grammatikressourcen auf Deutsch")
    public void derBenutzerÜberprüftDieGrammatikressourcenAufDeutsch() {
        String sprache = "Deutsch";
        String kategorie = "Grammatik";
        Assert.assertTrue(shopSeite.seitentitel.getText().contains(sprache));
        Assert.assertTrue(shopSeite.seitentitel.getText().contains(kategorie));
    }

    @And("Der Benutzer wendet Filter in Themenwelten an")
    public void derBenutzerWendetFilterInThemenweltenAn() {
        shopSeite.themenwelten.click();
    }

    @And("Der Benutzer wählt Ressourcen im Schulthema aus")
    public void derBenutzerWähltRessourcenImSchulthemaAus() {
        shopSeite.schulThema.click();

    }

    @And("Der Benutzer überprüft Schultema")
    public void derBenutzerÜberprüftSchultema() {
        String erwartetesThema= "Schule";
        String tatsächlichesThema= shopSeite.schulThema.getText();
        Assert.assertEquals(erwartetesThema,tatsächlichesThema);
    }

    @And("Der Benutzer klickt auf die 'Produkte Anzeigen' Schaltfläche")
    public void derBenutzerKlicktAufDieProdukteAnzeigenSchaltfläche(
    ) {
        shopSeite.produkteAnzeigenSchaltfläche.click();
    }
    @And("Der Benutzer fügt das erste aufgeführte Produkt dem Warenkorb hinzu")
    public void derBenutzerFügtDasErsteAufgeführteProduktDemWarenkorbHinzu() {
        shopSeite.warenkorbIkon.click();
    }

    @And("Der Benutzer überprüft, ob das hinzugefügte Produkt mit dem Produkt im Warenkorb übereinstimmt.")
    public void derBenutzerÜberprüftObDasHinzugefügteProduktMitDemProduktImWarenkorbÜbereinstimmt() {
        String hinzugefügteProdukt = shopSeite.produktHinzugefügt.getText();
        String produktImWarenkorb = shopSeite.produktImWarenkorb.getText();
        Assert.assertEquals(hinzugefügteProdukt,produktImWarenkorb);
    }

    @Then("Der Benutzer kauft weiter ein")
    public void derBenutzerKauftWeiterEin() {
        shopSeite.weiterEinkaufenSchaltfläche.click();
    }



}
