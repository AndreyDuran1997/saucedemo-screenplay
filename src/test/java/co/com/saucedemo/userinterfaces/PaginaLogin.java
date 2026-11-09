package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Localizadores de la pantalla de login.
 * Un Target es un elemento de la página con un nombre legible para el reporte.
 */
public class PaginaLogin {

    public static final Target CAMPO_USUARIO =
            Target.the("campo de usuario").locatedBy("#user-name");

    public static final Target CAMPO_CLAVE =
            Target.the("campo de clave").locatedBy("#password");

    public static final Target BOTON_LOGIN =
            Target.the("botón de login").locatedBy("#login-button");

    public static final Target MENSAJE_ERROR =
            Target.the("mensaje de error").locatedBy("[data-test='error']");
}
