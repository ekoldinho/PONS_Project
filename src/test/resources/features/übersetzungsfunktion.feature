Feature: Der Benutzer übersetzt deutsche Wörter ins Englische

  Background:
    Given Benutzer befindet sich auf der Hauptseite


  Scenario Outline: Der Benutzer kann die englische Übersetzung des deutschen Wortes lernen
    When Der Benutzer gibt "<searchValue>" in das Suchfeld ein
    And Der Benutzer klickt auf die Suchschaltfläche
    And Der Benutzer sieht das "<expectedValue>" auf der geöffneten Webseite
    Then Der Benutzer überprüft "<valueType>", ob das Wort ein Verb, ein Substantiv, ein Adverb oder ein Adjektiv ist.

    @DeutscheWörter
    Examples: In diesem Szenario werden folgende Suchwerte verwendet

      | searchValue      |  | expectedValue    |  | valueType  |
      | bauen            |  | bauen            |  | Verb       |
      | Arbeit           |  | Arbeit           |  | Substantiv |
      | Ergebnis         |  | Ergebnis         |  | Substantiv |
      | Kampf            |  | Kampf            |  | Substantiv |
      | Blick            |  | Blick            |  | Substantiv |
      | Geschicklichkeit |  | Geschicklichkeit |  | Substantiv |
      | gesamt           |  | gesamt           |  | Adjektiv   |
      | gestern          |  | gestern          |  | Adverb     |
      | wissen           |  | wissen           |  | Verb       |