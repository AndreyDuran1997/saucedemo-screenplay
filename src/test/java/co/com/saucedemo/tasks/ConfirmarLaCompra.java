package co.com.saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterfaces.PaginaCheckout.BOTON_FINALIZAR;

public class ConfirmarLaCompra {

    public static Performable enElResumen() {
        return Task.where("{0} confirma la compra",
                Click.on(BOTON_FINALIZAR));
    }
}
