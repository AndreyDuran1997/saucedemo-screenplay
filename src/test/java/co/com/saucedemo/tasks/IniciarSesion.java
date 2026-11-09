package co.com.saucedemo.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.saucedemo.userinterfaces.PaginaLogin.BOTON_LOGIN;
import static co.com.saucedemo.userinterfaces.PaginaLogin.CAMPO_CLAVE;
import static co.com.saucedemo.userinterfaces.PaginaLogin.CAMPO_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Task de negocio "iniciar sesión", escrita como clase.
 * Por dentro usa Interactions: Enter (escribir) y Click.
 */
public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    /** Así se lee en el step: IniciarSesion.con("standard_user", "secret_sauce") */
    public static IniciarSesion con(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }

    @Override
    @Step("{0} inicia sesión con el usuario '#usuario'")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(clave).into(CAMPO_CLAVE),
                Click.on(BOTON_LOGIN)
        );
    }
}
