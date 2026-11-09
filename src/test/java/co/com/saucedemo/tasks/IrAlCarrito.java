package co.com.saucedemo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.saucedemo.userinterfaces.PaginaProductos.ICONO_CARRITO;

public class IrAlCarrito {

    public static Performable deCompras() {
        return Task.where("{0} abre el carrito de compras",
                Click.on(ICONO_CARRITO));
    }
}
