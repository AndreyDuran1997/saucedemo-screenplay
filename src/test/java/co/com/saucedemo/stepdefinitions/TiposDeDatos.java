package co.com.saucedemo.stepdefinitions;

import co.com.saucedemo.models.DatosDeEnvio;
import io.cucumber.java.DataTableType;

import java.util.Map;

/**
 * Le enseña a Cucumber a convertir una tabla del .feature en un objeto.
 *
 *   | nombre | apellido | codigoPostal |
 *   | Andrey | Durán    | 050001       |
 *
 * Cada fila llega como un Map (encabezado -> valor) y se convierte en DatosDeEnvio.
 * Si una celda está vacía, llega como null y Enter simplemente no escribe nada.
 */
public class TiposDeDatos {

    @DataTableType
    public DatosDeEnvio datosDeEnvio(Map<String, String> fila) {
        return new DatosDeEnvio(
                fila.get("nombre"),
                fila.get("apellido"),
                fila.get("codigoPostal")
        );
    }
}
