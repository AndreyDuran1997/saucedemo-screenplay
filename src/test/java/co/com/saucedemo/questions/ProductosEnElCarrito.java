package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

import static co.com.saucedemo.userinterfaces.PaginaCarrito.NOMBRES_PRODUCTOS;

/**
 * Question que devuelve una LISTA: el texto de cada producto del carrito.
 * Text.of(...)     -> texto de un elemento
 * Text.ofEach(...) -> texto de todos los elementos que coinciden
 */
public class ProductosEnElCarrito {

    public static Question<Collection<String>> nombres() {
        return Text.ofEach(NOMBRES_PRODUCTOS);
    }
}
