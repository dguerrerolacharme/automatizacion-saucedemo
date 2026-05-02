package com.davidgl.qa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

import java.util.List;
import java.util.stream.Collectors;

public class ValidarOrdenPrecios implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        List<Double> precios = InventoryPage.PRODUCT_PRICES
                .resolveAllFor(actor)
                .stream()
                .map(e -> e.getText().replace("$", ""))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < precios.size() - 1; i++) {
            if (precios.get(i) > precios.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static ValidarOrdenPrecios correcto() {
        return new ValidarOrdenPrecios();
    }
}
