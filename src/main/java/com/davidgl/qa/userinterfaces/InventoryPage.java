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

    public static final Target ADD_TO_CART = Target.the("boton agregar al carrito")
            .located(By.xpath("(//button[contains(text(),'Add to cart')])[1]"));

    public static final Target REMOVE_BUTTON = Target.the("boton remover")
            .located(By.xpath("(//button[contains(text(),'Remove')])[1]"));

    public static final Target CART_ICON = Target.the("icono carrito")
            .located(By.className("shopping_cart_link"));

    public static final Target CART_ITEMS = Target.the("productos en carrito")
            .located(By.className("cart_item"));

    public static final Target CART_BADGE = Target.the("contador carrito")
            .located(By.className("shopping_cart_badge"));
}