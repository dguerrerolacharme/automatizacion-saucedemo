package com.davidgl.qa.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import com.davidgl.qa.userinterfaces.InventoryPage;

public class Filtrar implements Task {

    private String opcion;

    public Filtrar(String opcion) {
        this.opcion = opcion;
    }

    public static Filtrar por(String opcion) {
        return Tasks.instrumented(Filtrar.class, opcion);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(opcion)
                        .from(InventoryPage.FILTER)
        );
    }
}
