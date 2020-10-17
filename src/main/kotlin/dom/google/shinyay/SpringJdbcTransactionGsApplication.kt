package dom.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringJdbcTransactionGsApplication

fun main(args: Array<String>) {
	runApplication<SpringJdbcTransactionGsApplication>(*args)
}
