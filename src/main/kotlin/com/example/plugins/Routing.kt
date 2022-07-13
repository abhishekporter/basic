package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
    routing {
        get(path = "/login"){
            var name: String? =call.request.queryParameters["name"]
            print(name)
            call.respondText("Yes $name Your new account will get created")
        }
    }
}
