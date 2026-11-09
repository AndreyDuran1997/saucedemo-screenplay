package co.com.saucedemo.tasks;

import co.com.saucedemo.models.DatosDeEnvio;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.saucedemo.userinterfaces.PaginaCheckout.BOTON_CHECKOUT;
import static co.com.saucedemo.userinterfaces.PaginaCheckout.BOTON_CONTINUAR;
import static co.com.saucedemo.userinterfaces.PaginaCheckout.CAMPO_APELLIDO;
import static co.com.saucedemo.userinterfaces.PaginaCheckout.CAMPO_CODIGO_POSTAL;
import static co.com.saucedemo.userinterfaces.PaginaCheckout.CAMPO_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Va al carrito, inicia el checkout y llena el formulario de envío.
 * Fíjate que una Task puede usar OTRAS Tasks (IrAlCarrito) además de Interactions.
 */
public class DiligenciarDatosDeEnvio implements Task {

    private final DatosDeEnvio datos;

    public DiligenciarDatosDeEnvio(DatosDeEnvio datos) {
        this.datos = datos;
    }

    public static DiligenciarDatosDeEnvio con(DatosDeEnvio datos) {
        return instrumented(DiligenciarDatosDeEnvio.class, datos);
    }

    @Override
    @Step("{0} diligencia los datos de envío: #datos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IrAlCarrito.deCompras(),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue(datos.nombre()).into(CAMPO_NOMBRE),
                Enter.theValue(datos.apellido()).into(CAMPO_APELLIDO),
                Enter.theValue(datos.codigoPostal()).into(CAMPO_CODIGO_POSTAL),
                Click.on(BOTON_CONTINUAR)
        );
    }
}
