package zoetic.web.handler

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import zoetic.util.json


@Component
class ItemHandler() {

    fun findAll(req: ServerRequest) = ok().json().syncBody("[]")

}

