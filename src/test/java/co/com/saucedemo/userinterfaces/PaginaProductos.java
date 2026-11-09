package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Localizadores de la pantalla de productos (la que aparece después del login).
 */
public class PaginaProductos {

    public static final Target TITULO =
            Target.the("título de la página").locatedBy(".title");

    /**
     * Target DINÁMICO: el {0} se reemplaza por el nombre del producto.
     * Uso: BOTON_AGREGAR.of("Sauce Labs Backpack")
     * Busca la tarjeta que tiene ese nombre y, dentro de ella, su botón.
     */
    public static final Target BOTON_AGREGAR =
            Target.the("botón agregar de '{0}'")
                    .locatedBy("//div[@data-test='inventory-item-name' and normalize-space()='{0}']"
                            + "/ancestor::div[@data-test='inventory-item']//button");

    public static final Target CONTADOR_CARRITO =
            Target.the("contador del carrito").locatedBy("[data-test='shopping-cart-badge']");

    public static final Target ICONO_CARRITO =
            Target.the("ícono del carrito").locatedBy("[data-test='shopping-cart-link']");
}
