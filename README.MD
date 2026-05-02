#  Automatización QA - SauceDemo

## Descripción

Este proyecto contiene la automatización de pruebas para la aplicación web SauceDemo.


El objetivo es validar funcionalidades principales del sistema mediante escenarios automatizados, cubriendo tanto flujos positivos como negativos.

---

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

| Herramienta | Versión mínima | 
|-------------|----------------|
| Java JDK | 11 o superior |
| Gradle | 9.3.0 |
| Conexión a Internet | — |

## Configuración

La URL base de la API se define en `https://www.saucedemo.com/`:

## Compilación

El proyecto compila automáticamente al ejecutar las pruebas. Si se desea compilar de forma explícita:

```bash
./gradlew clean build
```

Esto descargará dependencias y preparará el entorno.

---

## Ejecución de pruebas

Para ejecutar todas las pruebas automatizadas:

```bash
./gradlew clean test
```

Durante la ejecución se abrirá el navegador y se simularán los flujos definidos en los escenarios.

---

## Generación de reportes

Serenity genera automáticamente los reportes al finalizar la ejecución.

Puedes encontrarlos en:

```bash
target/site/serenity/index.html
```

Abre ese archivo en tu navegador para visualizar:

* Resultados de los escenarios
* Evidencias de ejecución
* Detalle de pasos
* Estado de las pruebas

---


# Respuestas

## a. ¿Cuáles fueron los principales desafíos?

El principal desafío fue la configuración inicial del entorno, especialmente la integración entre Serenity, Cucumber y el manejo del WebDriver. También se presentaron dificultades con comportamientos del navegador, como ventanas emergentes de seguridad al momento del login, lo cual bloqueaba el test, que afectaban la estabilidad de las pruebas.

---

## b. ¿Qué técnicas de pruebas se usaron y qué enfoque se le dio?

Se aplicaron pruebas funcionales automatizadas basadas en escenarios (BDD), utilizando Gherkin para describir el comportamiento esperado del sistema.

El enfoque fue orientado a comportamiento, dando prioridad a la claridad de los escenarios y buscando una simulación de acciones reales de usuarios. Además, se incluyeron tanto casos positivos como negativos para validar el manejo de errores.

---

## c. ¿Cómo validaste la experiencia del usuario?

La validación se basó en verifiar que:

* La navegación entre ventanas fuera correcta
* La información mostrada fuera coherente con a las acciones realizadas
* Los elementos claves estuvierán visibles y consistentes
* Los mensajes de error aparecierán cuando correspondía

---

## d. ¿Qué fue lo más interesante del ejercicio?

Lo más interesante fue implementar el patrón Screenplay y validar cómo mejora la organización del código. 

La parte más relevante fue lograr validar comportamientos reales del sistema, ya que esto refleja mejor el trabajo que se realiza en un entorno QA real.

---
