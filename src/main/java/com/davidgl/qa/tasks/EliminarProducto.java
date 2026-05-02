package com.davidgl.qa.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class EliminarProducto implements Task {

    public static EliminarProducto delCarrito() {
        return Tasks.instrumented(EliminarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryPage.REMOVE_BUTTON)
        );
    }
}
