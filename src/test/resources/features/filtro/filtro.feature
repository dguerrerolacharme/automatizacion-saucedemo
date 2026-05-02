Feature: Filtro de productos

  Scenario: Ordenar productos por precio menor a mayor
    Given que el usuario inicia sesion correctamente
    When ordena productos por precio ascendente
    Then los productos deben estar ordenados de menor a mayor