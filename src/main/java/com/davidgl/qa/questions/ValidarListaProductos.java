package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class ValidarListaProductos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return InventoryPage.PRODUCTS.resolveAllFor(actor).size() > 0;
    }

    public static ValidarListaProductos visible() {
        return new ValidarListaProductos();
    }
}