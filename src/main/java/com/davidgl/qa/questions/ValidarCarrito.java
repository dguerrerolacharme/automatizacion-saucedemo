package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class ValidarCarrito implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return InventoryPage.CART_BADGE.resolveFor(actor).isVisible();
    }

    public static ValidarCarrito tieneProductos() {
        return new ValidarCarrito();
    }
}