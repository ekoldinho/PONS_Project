@wip
Feature: Der Benutzer übersetzt deutsche Wörter ins Englische

  Background:
    Given Benutzer befindet sich auf der Hauptseite


  Scenario Outline: Der Benutzer kann die englische Übersetzung des deutschen Wortes lernen
    When Der Benutzer gibt "<searchValue>" in das Suchfeld ein
    And Der Benutzer klickt auf die Suchschaltfläche
    Then Der Benutzer sieht das "<expectedValue>" auf der geöffneten Webseite


  @DeutscheWörter
    Examples: In diesem Szenario werden folgende Suchwerte verwendet

      | searchValue      |  | expectedValue    |
      | bauen            |  | bauen            |
      | Arbeit           |  | Arbeit           |
      | Ergebnis         |  | Ergebnis         |
      | Kampf            |  | Kampf            |
      | Blick            |  | Blick            |
      | Geschicklichkeit |  | Geschicklichkeit |
      | gesamt           |  | gesamt           |
      | Lager            |  | Lager            |
      | Kontinent        |  | Kontinent        |