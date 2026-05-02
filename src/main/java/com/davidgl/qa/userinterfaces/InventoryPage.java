package com.davidgl.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target TITLE = Target.the("título de productos")
            .located(By.className("title"));
}