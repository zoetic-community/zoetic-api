package zoetic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import zoetic.util.run

@SpringBootApplication
@EnableConfigurationProperties(ZoeticProperties::class)
class ZoeticApplication {

}

fun main(args: Array<String>) {
    run(ZoeticApplication::class, *args)
}
