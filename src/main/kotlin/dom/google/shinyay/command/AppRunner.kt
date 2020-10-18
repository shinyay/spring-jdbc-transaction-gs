package dom.google.shinyay.command

import dom.google.shinyay.service.BookingService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class AppRunner(val bookingService: BookingService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        TODO("Not yet implemented")
    }
}