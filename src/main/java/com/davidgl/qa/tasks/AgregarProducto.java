package com.davidgl.qa.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class AgregarProducto implements Task {

    public static AgregarProducto seleccionado() {
        return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryPage.ADD_TO_CART),
                Click.on(InventoryPage.CART_ICON)
        );
    }
}