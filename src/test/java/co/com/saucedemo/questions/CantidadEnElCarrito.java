package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.saucedemo.userinterfaces.PaginaProductos.CONTADOR_CARRITO;

/**
 * Question escrita en una sola línea: no siempre hace falta una clase completa.
 */
public class CantidadEnElCarrito {

    public static Question<String> mostrada() {
        return Text.of(CONTADOR_CARRITO);
    }
}
