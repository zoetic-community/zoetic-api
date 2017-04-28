package zoetic.web.routes

import zoetic.web.handler.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.*
import org.springframework.web.reactive.function.server.router


@Configuration
class ApiRoutes(val itemHandler: ItemHandler) {

    @Bean
    fun apiRouter() = router {
        (accept(APPLICATION_JSON) and "/api/v1").nest {
            "/items".nest {
                GET("/", itemHandler::findAll)
            }
        }
    }
}
