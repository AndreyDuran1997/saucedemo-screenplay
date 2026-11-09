package co.com.saucedemo.models;

/**
 * Modelo: agrupa los datos de envío en un solo objeto.
 * Es un "record" de Java 17: crea solo el constructor y los métodos
 * nombre(), apellido(), codigoPostal() y toString().
 */
public record DatosDeEnvio(String nombre, String apellido, String codigoPostal) {
}
