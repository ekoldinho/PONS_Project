@wip
Feature: Der Benutzer kauft online Ressourcen ein

  Background:
    Given Benutzer befindet sich auf der Hauptseite
    Given Der Benutzer klickt auf die Schaltfläche „Shop“

  Scenario: Der Benutzer kann online Ressourcen zum Sprachenlernen auf Deutsch einkaufen
    When Der Benutzer klickt auf die Schaltfläche „Deutsch“, um nach deutschen Ressourcen zu suchen
    And Der Benutzer sucht nach Ressourcen in der Kategorie „Grammatik“
    And Der Benutzer überprüft die Grammatikressourcen auf Deutsch
    And Der Benutzer wendet Filter in Themenwelten an
    And Der Benutzer wählt Ressourcen im Schulthema aus
    And Der Benutzer überprüft Schultema
    And Der Benutzer klickt auf die 'Produkte Anzeigen' Schaltfläche
    And Der Benutzer fügt das erste aufgeführte Produkt dem Warenkorb hinzu
    And Der Benutzer überprüft, ob das hinzugefügte Produkt mit dem Produkt im Warenkorb übereinstimmt.

    Then Der Benutzer kauft weiter ein



