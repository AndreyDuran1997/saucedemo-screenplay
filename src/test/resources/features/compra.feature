# language: es
@compra
Característica: Compra de productos en SauceDemo
  Como cliente de la tienda
  Quiero pagar los productos de mi carrito
  Para recibirlos en mi casa

  Antecedentes:
    Dado que Andrey abre la página de SauceDemo
    Y inicia sesión con el usuario "standard_user" y la clave "secret_sauce"

  Escenario: Compra exitosa de dos productos
    Cuando agrega al carrito los productos:
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
    Y diligencia los datos de envío:
      | nombre | apellido | codigoPostal |
      | Andrey | Durán    | 050001       |
    Y confirma la compra
    Entonces debería ver el mensaje "Thank you for your order!"

  Escenario: No permite continuar sin código postal
    Cuando agrega al carrito el producto "Sauce Labs Backpack"
    Y diligencia los datos de envío:
      | nombre | apellido | codigoPostal |
      | Andrey | Durán    |              |
    Entonces debería ver un mensaje de error que contiene "Postal Code is required"
