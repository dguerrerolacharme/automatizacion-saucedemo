package com.davidgl.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target.the("campo usuario")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("campo password")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("botón login")
            .located(By.id("login-button"));

    public static final Target ERROR = Target.the("mensaje error")
            .located(By.cssSelector("[data-test='error']"));
}
