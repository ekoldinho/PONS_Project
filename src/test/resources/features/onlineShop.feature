@wip
Feature: Der Benutzer kauft online Ressourcen ein

  Background:
    Given Benutzer befindet sich auf der Hauptseite
    Given Der Benutzer klickt auf die Schaltfläche „Shop“

  Scenario: Der Benutzer kann online Ressourcen zum Sprachenlernen auf Deutsch einkaufen
    When Der Benutzer klickt auf die Schaltfläche „Deutsch“, um nach deutschen Ressourcen zu suchen
    And Der Benutzer sucht nach Ressourcen in der Kategorie „Grammatik“
    And Der Benutzer wendet Filter in Themenwelten an
    And Der Benutzer wählt Ressourcen im Schulthema aus
    And Der Benutzer fügt das erste aufgeführte Produkt dem Warenkorb hinzu
    Then Der Benutzer kauft weiter ein



