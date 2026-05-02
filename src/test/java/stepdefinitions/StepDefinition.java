package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.davidgl.qa.tasks.AbrirPagina;
import com.davidgl.qa.tasks.Login;
import com.davidgl.qa.questions.ValidarLoginExitoso;
import com.davidgl.qa.questions.ValidarErrorLogin;
import com.davidgl.qa.questions.ValidarListaProductos;
import com.davidgl.qa.questions.ValidarInfoProductos;
import com.davidgl.qa.tasks.Filtrar;
import com.davidgl.qa.questions.ValidarOrdenPrecios;
import com.davidgl.qa.tasks.AgregarProducto;
import com.davidgl.qa.tasks.EliminarProducto;
import com.davidgl.qa.questions.ValidarCarrito;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.junit.Assert.assertTrue;

public class StepDefinition {

    @Given("que el usuario abre la aplicacion")
    public void abrirApp() {
        OnStage.theActorCalled("usuario").attemptsTo(
                AbrirPagina.enSauceDemo()
        );
    }

    @Given("que el usuario inicia sesion correctamente")
    public void usuarioIniciaSesionCorrectamente() {
        OnStage.theActorCalled("usuario").attemptsTo(
                AbrirPagina.enSauceDemo(),
                Login.conCredenciales("standard_user", "secret_sauce")
        );
    }

    @When("ingresa credenciales validas")
    public void loginValido() {
        OnStage.theActorCalled("usuario").attemptsTo(
                Login.conCredenciales("standard_user", "secret_sauce")
        );
    }

    @When("ingresa credenciales invalidas")
    public void loginInvalido() {
        OnStage.theActorCalled("usuario").attemptsTo(
                Login.conCredenciales("locked_out_user", "wrong_password")
        );
    }

    @Then("deberia ver la pagina de productos")
    public void validarLogin() {
        assertTrue(
                OnStage.theActorCalled("usuario").asksFor(ValidarLoginExitoso.esCorrecto())
        );
    }

    @Then("deberia ver un mensaje de error")
    public void validarError() {
        assertTrue(
                OnStage.theActorCalled("usuario").asksFor(ValidarErrorLogin.esVisible())
        );
    }

    @Then("el usuario deberia ver la lista de productos")
    public void verListaProductos() {
        assertTrue(
                OnStage.theActor("usuario").asksFor(ValidarListaProductos.visible())
        );
    }

    @Then("cada producto debe tener nombre y precio")
    public void validarNombreYPrecio() {
        assertTrue(
                OnStage.theActorCalled("usuario").asksFor(ValidarInfoProductos.correcta())
        );
    }

    @When("ordena productos por precio ascendente")
    public void ordenarProductos() {
        OnStage.theActorCalled("usuario").attemptsTo(
                Filtrar.por("lohi")
        );
    }

    @Then("los productos deben estar ordenados de menor a mayor")
    public void validarOrden() {
        assertTrue(
                OnStage.theActorCalled("usuario").asksFor(ValidarOrdenPrecios.correcto())
        );
    }

    @When("agrega un producto al carrito")
    public void agregarProducto() {
        OnStage.theActorCalled("usuario").attemptsTo(
                AgregarProducto.seleccionado()
        );
    }

    @When("elimina el producto del carrito")
    public void eliminarProducto() {
        OnStage.theActorCalled("usuario").attemptsTo(
                EliminarProducto.delCarrito()
        );
    }

    @Then("el carrito debe tener productos")
    public void validarCarritoConProductos() {
        assertTrue(
                OnStage.theActorCalled("usuario").asksFor(ValidarCarrito.tieneProductos())
        );
    }

    @Then("el carrito debe estar vacio")
    public void validarCarritoVacio() {
        assertTrue(
                !OnStage.theActorCalled("usuario").asksFor(ValidarCarrito.tieneProductos())
        );
    }
}