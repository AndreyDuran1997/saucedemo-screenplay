package co.com.saucedemo.stepdefinitions;

import co.com.saucedemo.questions.MensajeDeError;
import co.com.saucedemo.questions.TituloDeLaPagina;
import co.com.saucedemo.tasks.AbrirLaPagina;
import co.com.saucedemo.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

/**
 * Conecta cada frase del login.feature con el código Screenplay.
 * Aquí no hay clics ni localizadores: solo actores, tareas y preguntas.
 */
public class LoginStepDefinitions {

    @Dado("que {actor} abre la página de SauceDemo")
    public void abreLaPagina(Actor actor) {
        actor.wasAbleTo(AbrirLaPagina.deSauceDemo());
    }

    @Cuando("inicia sesión con el usuario {string} y la clave {string}")
    public void iniciaSesion(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(usuario, clave)
        );
    }

    @Entonces("debería ver el título {string}")
    public void deberiaVerElTitulo(String tituloEsperado) {
        theActorInTheSpotlight().should(
                seeThat(TituloDeLaPagina.deProductos(), equalTo(tituloEsperado))
        );
    }

    @Entonces("debería ver un mensaje de error que contiene {string}")
    public void deberiaVerMensajeDeError(String mensajeEsperado) {
        theActorInTheSpotlight().should(
                seeThat(MensajeDeError.enPantalla(), containsString(mensajeEsperado))
        );
    }
}
