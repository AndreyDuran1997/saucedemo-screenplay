package co.com.saucedemo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * Prepara el "escenario" (Stage) de Screenplay antes de cada prueba.
 */
public class ConfiguracionActores {

    /**
     * Antes de cada escenario se arma el elenco (Cast).
     * OnlineCast le da a cada actor la habilidad de navegar en la web
     * (BrowseTheWeb) con el navegador configurado en serenity.conf.
     */
    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    /**
     * Convierte el texto {actor} del .feature (por ejemplo "Andrey")
     * en un objeto Actor con ese nombre.
     */
    @ParameterType(".*")
    public Actor actor(String nombreDelActor) {
        return OnStage.theActorCalled(nombreDelActor);
    }
}
