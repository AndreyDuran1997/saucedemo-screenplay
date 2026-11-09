# language: es
@login
Característica: Inicio de sesión en SauceDemo
  Como cliente de la tienda
  Quiero iniciar sesión con mi usuario
  Para poder comprar productos

  Antecedentes:
    Dado que Andrey abre la página de SauceDemo

  Escenario: Inicio de sesión exitoso
    Cuando inicia sesión con el usuario "standard_user" y la clave "secret_sauce"
    Entonces debería ver el título "Products"

  Esquema del escenario: Inicio de sesión fallido
    Cuando inicia sesión con el usuario "<usuario>" y la clave "<clave>"
    Entonces debería ver un mensaje de error que contiene "<mensaje>"

    Ejemplos:
      | usuario         | clave        | mensaje                                |
      | locked_out_user | secret_sauce | this user has been locked out          |
      | standard_user   | incorrecta   | Username and password do not match     |
      |                 | secret_sauce | Username is required                   |
