package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    protected Actor actor;

    @Before
    public void configurar() {
        WebDriver driver = new ChromeDriver();
        actor = Actor.named("Usuario");
        actor.can(BrowseTheWeb.with(driver));
    }
}