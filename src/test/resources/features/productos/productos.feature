Feature: Gestion de productos

  Scenario: Visualizar lista de productos
    Given que el usuario inicia sesion correctamente
    Then deberia ver la lista de productos

  Scenario: Validar que los productos tienen nombre y precio
   Given que el usuario inicia sesion correctamente
   Then cada producto debe tener nombre y precio