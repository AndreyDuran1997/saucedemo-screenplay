package co.com.saucedemo.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.saucedemo.userinterfaces.PaginaProductos.BOTON_AGREGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Agrega uno o varios productos al carrito.
 * Una sola Task sirve para los dos casos: siempre recibe una lista.
 */
public class AgregarAlCarrito implements Task {

    private final List<String> productos;

    public AgregarAlCarrito(List<String> productos) {
        this.productos = productos;
    }

    /** AgregarAlCarrito.elProducto("Sauce Labs Backpack") */
    public static AgregarAlCarrito elProducto(String producto) {
        return instrumented(AgregarAlCarrito.class, List.of(producto));
    }

    /** AgregarAlCarrito.losProductos(lista) */
    public static AgregarAlCarrito losProductos(List<String> productos) {
        return instrumented(AgregarAlCarrito.class, productos);
    }

    @Override
    @Step("{0} agrega al carrito: #productos")
    public <T extends Actor> void performAs(T actor) {
        for (String producto : productos) {
            actor.attemptsTo(
                    Click.on(BOTON_AGREGAR.of(producto))
            );
        }
    }
}
