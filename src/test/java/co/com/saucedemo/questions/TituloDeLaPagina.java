package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.saucedemo.userinterfaces.PaginaProductos.TITULO;

/**
 * Question: lo que el actor "pregunta" a la pantalla para validar.
 * Devuelve el texto del título de la página de productos.
 */
public class TituloDeLaPagina implements Question<String> {

    public static TituloDeLaPagina deProductos() {
        return new TituloDeLaPagina();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TITULO).answeredBy(actor);
    }
}
