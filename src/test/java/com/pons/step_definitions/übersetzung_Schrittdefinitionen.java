package com.pons.step_definitions;

import com.pons.pages.AusgabeSeite;
import com.pons.pages.Hauptseite;
import com.pons.utilities.ConfigurationReader;
import com.pons.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class übersetzung_Schrittdefinitionen {

        Hauptseite hauptseite = new Hauptseite();
        AusgabeSeite ausgabeSeite = new AusgabeSeite();
    @Given("Benutzer befindet sich auf der Hauptseite")
    public void benutzerBefindedSichAufDerHauptseite() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        hauptseite.cookiesAkzeptieren.click();
    }

    @When("Der Benutzer gibt {string} in das Suchfeld ein")
    public void derBenutzerGibtInDasSuchfeldEin(String wort) {
        hauptseite.suchfeld.sendKeys(wort);
    }

    @And("Der Benutzer klickt auf die Suchschaltfläche")
    public void derBenutzerKlicktAufDieSuchschaltfläche() {
        hauptseite.suchschaltfläche.click();
    }

    @Then("Der Benutzer sieht das {string} auf der geöffneten Webseite")
    public void derBenutzerSiehtDasAufDerGeöffnetenWebseite(String wort) {



        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        String erwarteteAusgabe = wort;
        String tatsächlicheAusgabe = ausgabeSeite.ausgabeWort.getText();
        Assert.assertEquals(erwarteteAusgabe,tatsächlicheAusgabe);


    }

}
