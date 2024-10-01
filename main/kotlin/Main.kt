package cxx

import cxx.ContactandAdress.ContactandAdress
import cxx.Mainheading.Mainheading
import cxx.Separatingline.Separatingline
import cxx.Socialicons.Socialicons
import cxx.infowraper.infowraper
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main() {
    embeddedServer(CIO, 8080) {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        StyleSheets()
        static("/static") {
            resources("static")
        }
        get("/") {
            call.respondHtml {
                head {
                    meta { name = "viewport"; content = "width=device-width, initial-scale=1.0" }
                    title { +"ContactInfo" }
                    link(ContactInfoStyles)
                    style {
                        unsafe {
                            raw(
                                """
                @font-face {
                    font-family: "Markpro";
                    font-weight: normal;
                    src:url("/static/font/MARKPRO.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: bold;
                    src:url("/static/font/MARKPROBOLD.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: 900;
                    src:url("/static/font/MARKPROHEAVY.OTF");
                }
                @font-face {
                    font-family: "Markpro";
                    font-weight: 500;
                    src:url("/static/font/MARKPROMEDIUM.OTF");
                }

            """
                            )
                        }
                    }
                }
                body(classes = ContactInfoStyles.bbody) {
                    infowraper()
                }
            }
        }
    }
}