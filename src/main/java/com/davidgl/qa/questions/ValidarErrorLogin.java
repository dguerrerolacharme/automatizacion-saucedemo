package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.LoginPage;

public class ValidarErrorLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.ERROR.resolveFor(actor).isVisible();
    }

    public static ValidarErrorLogin esVisible() {
        return new ValidarErrorLogin();
    }
}
