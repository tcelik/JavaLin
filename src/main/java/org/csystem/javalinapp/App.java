package org.csystem.javalinapp;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args)
    {
        Javalin app =  Javalin.create().start(7000);

        app.get("/", ctx -> ctx.result("index"));

        app.get("/hello", ctx -> ctx.result("hello get request"));

    }
}
