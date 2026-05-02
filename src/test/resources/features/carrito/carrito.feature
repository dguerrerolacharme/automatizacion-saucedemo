Feature: Carrito de compras

  Scenario: Agregar producto al carrito
    Given que el usuario inicia sesion correctamente
    When agrega un producto al carrito
    Then el carrito debe tener productos

  Scenario: Eliminar producto del carrito
    Given que el usuario inicia sesion correctamente
    When agrega un producto al carrito
    And elimina el producto del carrito
    Then el carrito debe estar vacio