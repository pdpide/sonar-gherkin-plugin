Feature: Feature duplicated scenario names
  Blabla...

  Background: Background name blabla
    Given Blabla given b1...

  Scenario: Scenario name blabla
    Given Blabla given...
    When Blabla when...
    Then Blabla then...

  Scenario: Scenario name blabla
    Given Blabla given...
    When Blabla when...
    Then Blabla then...

  Scenario:
    Given Blabla given...
    When Blabla when...
    Then Blabla then...

  Scenario Outline: Scenario outline name blabla
    Given Blabla given...<number>
    When Blabla when...
    Then Blabla then...

    Examples: Examples name blabla
      | number |
      | 1      |
      | 2      |
