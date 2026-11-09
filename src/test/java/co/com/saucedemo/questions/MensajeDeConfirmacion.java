package co.com.saucedemo.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.saucedemo.userinterfaces.PaginaCheckout.MENSAJE_CONFIRMACION;

public class MensajeDeConfirmacion {

    public static Question<String> mostrado() {
        return Text.of(MENSAJE_CONFIRMACION);
    }
}
