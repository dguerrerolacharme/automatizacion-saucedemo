package com.davidgl.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target TITLE = Target.the("título de productos")
            .located(By.className("title"));

    public static final Target PRODUCTS = Target.the("lista productos")
            .located(By.className("inventory_item"));

    public static final Target PRODUCT_NAMES = Target.the("nombres productos")
            .located(By.className("inventory_item_name"));

    public static final Target PRODUCT_PRICES = Target.the("precios productos")
            .located(By.className("inventory_item_price"));

    public static final Target FILTER = Target.the("filtro de productos")
            .located(By.className("product_sort_container"));
}