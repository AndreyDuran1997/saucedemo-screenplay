package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.saucedemo.userinterfaces.PaginaLogin.MENSAJE_ERROR;

/**
 * Devuelve el texto del mensaje de error que aparece en el login.
 */
public class MensajeDeError implements Question<String> {

    public static MensajeDeError enPantalla() {
        return new MensajeDeError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_ERROR).answeredBy(actor);
    }
}
