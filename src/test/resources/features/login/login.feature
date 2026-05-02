Feature: Login en SauceDemo

  Scenario: Login exitoso
    Given que el usuario abre la aplicacion
    When ingresa credenciales validas
    Then deberia ver la pagina de productos

  Scenario: Login fallido
    Given que el usuario abre la aplicacion
    When ingresa credenciales invalidas
    Then deberia ver un mensaje de error