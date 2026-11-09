# language: es
@carrito
Característica: Carrito de compras en SauceDemo
  Como cliente de la tienda
  Quiero agregar productos al carrito
  Para comprarlos después

  Antecedentes:
    Dado que Andrey abre la página de SauceDemo
    Y inicia sesión con el usuario "standard_user" y la clave "secret_sauce"

  Escenario: Agregar un producto al carrito
    Cuando agrega al carrito el producto "Sauce Labs Backpack"
    Entonces el ícono del carrito debería mostrar "1"
    Y en el carrito debería estar el producto "Sauce Labs Backpack"

  Escenario: Agregar varios productos al carrito
    Cuando agrega al carrito los productos:
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
    Entonces el ícono del carrito debería mostrar "3"
