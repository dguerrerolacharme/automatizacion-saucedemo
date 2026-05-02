package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    public static Actor actor;
    private WebDriver driver;

    @Before
    public void configurar() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        actor = Actor.named("Usuario");
        actor.can(BrowseTheWeb.with(driver));
    }
}