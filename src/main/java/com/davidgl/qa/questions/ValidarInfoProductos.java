package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class ValidarInfoProductos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        int nombres = InventoryPage.PRODUCT_NAMES.resolveAllFor(actor).size();
        int precios = InventoryPage.PRODUCT_PRICES.resolveAllFor(actor).size();

        return nombres > 0 && precios > 0 && nombres == precios;
    }

    public static ValidarInfoProductos correcta() {
        return new ValidarInfoProductos();
    }
}
