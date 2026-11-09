package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Localizadores de la pantalla del carrito.
 */
public class PaginaCarrito {

    /** Encuentra TODOS los nombres de productos que hay en el carrito. */
    public static final Target NOMBRES_PRODUCTOS =
            Target.the("nombres de productos en el carrito")
                    .locatedBy(".cart_item [data-test='inventory-item-name']");
}
