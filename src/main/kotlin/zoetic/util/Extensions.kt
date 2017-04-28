package zoetic.util

import org.springframework.boot.SpringApplication
import org.springframework.http.MediaType.*
import org.springframework.web.reactive.function.server.ServerResponse
import kotlin.reflect.KClass

fun run(type: KClass<*>, vararg args: String) = SpringApplication.run(type.java, *args)

fun ServerResponse.BodyBuilder.json() = contentType(APPLICATION_JSON_UTF8)

fun ServerResponse.BodyBuilder.xml() = contentType(APPLICATION_XML)

fun ServerResponse.BodyBuilder.html() = contentType(TEXT_HTML)
