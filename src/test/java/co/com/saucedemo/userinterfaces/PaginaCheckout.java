package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Localizadores del proceso de pago (checkout).
 */
public class PaginaCheckout {

    // Está en la pantalla del carrito: inicia el proceso de pago
    public static final Target BOTON_CHECKOUT =
            Target.the("botón checkout").locatedBy("[data-test='checkout']");

    // Paso 1: datos de envío
    public static final Target CAMPO_NOMBRE =
            Target.the("campo nombre").locatedBy("[data-test='firstName']");

    public static final Target CAMPO_APELLIDO =
            Target.the("campo apellido").locatedBy("[data-test='lastName']");

    public static final Target CAMPO_CODIGO_POSTAL =
            Target.the("campo código postal").locatedBy("[data-test='postalCode']");

    public static final Target BOTON_CONTINUAR =
            Target.the("botón continuar").locatedBy("[data-test='continue']");

    // Paso 2: resumen de la compra
    public static final Target BOTON_FINALIZAR =
            Target.the("botón finalizar").locatedBy("[data-test='finish']");

    // Paso 3: confirmación
    public static final Target MENSAJE_CONFIRMACION =
            Target.the("mensaje de confirmación").locatedBy("[data-test='complete-header']");
}
