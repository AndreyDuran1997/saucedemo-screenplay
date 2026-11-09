package co.com.saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Task sencilla: se arma con Task.where(descripción, interacciones...).
 */
public class AbrirLaPagina {

    public static Performable deSauceDemo() {
        return Task.where("{0} abre la página de SauceDemo",
                Open.url("https://www.saucedemo.com"));
    }
}
