package org.example;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> {
            ctx.html("<h1>Esta es la app 2.</h1>");
        });
    }
}