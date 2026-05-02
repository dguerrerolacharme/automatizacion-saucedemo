package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.davidgl.qa.tasks.AbrirPagina;
import com.davidgl.qa.tasks.Login;
import com.davidgl.qa.questions.ValidarLoginExitoso;
import com.davidgl.qa.questions.ValidarErrorLogin;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinition {

    @Given("que el usuario abre la aplicacion")
    public void abrirApp() {
        Hooks.actor.attemptsTo(
                AbrirPagina.enSauceDemo()
        );
    }

    @When("ingresa credenciales validas")
    public void loginValido() {
        Hooks.actor.attemptsTo(
                Login.conCredenciales("standard_user", "secret_sauce")
        );
    }

    @When("ingresa credenciales invalidas")
    public void loginInvalido() {
        Hooks.actor.attemptsTo(
                Login.conCredenciales("locked_out_user", "wrong_password")
        );
    }

    @Then("deberia ver la pagina de productos")
    public void validarLogin() {
        assertTrue(
                Hooks.actor.asksFor(ValidarLoginExitoso.esCorrecto())
        );
    }

    @Then("deberia ver un mensaje de error")
    public void validarError() {
        assertTrue(
                Hooks.actor.asksFor(ValidarErrorLogin.esVisible())
        );
    }

}