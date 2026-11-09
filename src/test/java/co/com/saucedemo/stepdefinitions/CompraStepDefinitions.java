package co.com.saucedemo.stepdefinitions;

import co.com.saucedemo.models.DatosDeEnvio;
import co.com.saucedemo.questions.MensajeDeConfirmacion;
import co.com.saucedemo.tasks.ConfirmarLaCompra;
import co.com.saucedemo.tasks.DiligenciarDatosDeEnvio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

/**
 * Pasos de la compra. Se reutilizan los de login (Antecedentes),
 * los del carrito (agregar productos) y el del mensaje de error del login.
 */
public class CompraStepDefinitions {

    /** La tabla llega convertida en DatosDeEnvio gracias a TiposDeDatos. */
    @Cuando("diligencia los datos de envío:")
    public void diligenciaLosDatosDeEnvio(DatosDeEnvio datos) {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarDatosDeEnvio.con(datos)
        );
    }

    @Cuando("confirma la compra")
    public void confirmaLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                ConfirmarLaCompra.enElResumen()
        );
    }

    @Entonces("debería ver el mensaje {string}")
    public void deberiaVerElMensaje(String mensajeEsperado) {
        theActorInTheSpotlight().should(
                seeThat(MensajeDeConfirmacion.mostrado(), equalTo(mensajeEsperado))
        );
    }
}
