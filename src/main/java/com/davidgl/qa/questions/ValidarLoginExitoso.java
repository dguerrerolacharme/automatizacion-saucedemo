package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class ValidarLoginExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return InventoryPage.TITLE.resolveFor(actor).isVisible();
    }

    public static ValidarLoginExitoso esCorrecto() {
        return new ValidarLoginExitoso();
    }
}
