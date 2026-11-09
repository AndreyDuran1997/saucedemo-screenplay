package co.com.saucedemo.stepdefinitions;

import co.com.saucedemo.questions.CantidadEnElCarrito;
import co.com.saucedemo.questions.ProductosEnElCarrito;
import co.com.saucedemo.tasks.AgregarAlCarrito;
import co.com.saucedemo.tasks.IrAlCarrito;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

/**
 * Pasos del carrito. Los pasos del Antecedentes (abrir la página e iniciar sesión)
 * NO se repiten aquí: Cucumber reutiliza los de LoginStepDefinitions.
 */
public class CarritoStepDefinitions {

    @Cuando("agrega al carrito el producto {string}")
    public void agregaUnProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.elProducto(producto)
        );
    }

    /** La tabla de una columna del .feature llega como List<String>. */
    @Cuando("agrega al carrito los productos:")
    public void agregaVariosProductos(List<String> productos) {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.losProductos(productos)
        );
    }

    @Entonces("el ícono del carrito debería mostrar {string}")
    public void elIconoDeberiaMostrar(String cantidadEsperada) {
        theActorInTheSpotlight().should(
                seeThat(CantidadEnElCarrito.mostrada(), equalTo(cantidadEsperada))
        );
    }

    @Entonces("en el carrito debería estar el producto {string}")
    public void enElCarritoDeberiaEstar(String producto) {
        theActorInTheSpotlight().attemptsTo(IrAlCarrito.deCompras());
        theActorInTheSpotlight().should(
                seeThat(ProductosEnElCarrito.nombres(), hasItem(producto))
        );
    }
}
