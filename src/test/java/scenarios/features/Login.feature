@Login @eCommerce
Feature: Login visual tests for E-commerce Store

  Background:
    Given User navigates to e-commerce site

  Scenario: Check Standard User for successful login
    Given user standardUsername enters password secret_sauce
    And user clicks login button
    Assert user is navigated to the ecommerce page