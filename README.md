# Automatización SauceDemo — Serenity BDD + Screenplay

Pruebas automatizadas de [SauceDemo](https://www.saucedemo.com) con Serenity BDD, Cucumber y el patrón Screenplay.

## Requisitos

- JDK 25 (LTS)
- Maven 3.9 o superior
- Google Chrome

## Ejecutar las pruebas

```bash
mvn clean verify
```

Solo los escenarios con una etiqueta:

```bash
mvn clean verify -Dtags="@login"
```

## Reporte

Al terminar, abrir en el navegador:

```
target/site/serenity/index.html
```

## Estructura

```
src/test/java/co/com/saucedemo
├── runners          Runner que ejecuta los .feature
├── stepdefinitions  Conecta los pasos Gherkin con el código
├── userinterfaces   Localizadores de cada pantalla (Targets)
├── tasks            Acciones de negocio (iniciar sesión, agregar al carrito)
├── interactions     Acciones técnicas reutilizables
└── questions        Lo que el actor consulta para validar

src/test/resources
├── features         Escenarios en Gherkin
└── serenity.conf    Configuración del navegador y de Serenity
```

## Escenarios cubiertos

- Inicio de sesión exitoso
- Inicio de sesión fallido (usuario bloqueado, clave incorrecta, usuario vacío)
