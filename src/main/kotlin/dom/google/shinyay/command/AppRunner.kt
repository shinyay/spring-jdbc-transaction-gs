package dom.google.shinyay.command

import dom.google.shinyay.logger
import dom.google.shinyay.service.BookingService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import org.springframework.util.Assert

@Component
class AppRunner(val bookingService: BookingService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        bookMultiplePerson()

        bookButException()

        queryBookedPerson()
    }

    private fun bookMultiplePerson() {
        bookingService.book("Alice", "Bob", "Carol")
        Assert.isTrue(bookingService.showAllBookings()!!.size == 3,
                "First booking should work with no problem")
        logger.info("Alice, Bob and Carol have been booked")
    }
    private fun bookButException() {
        try {
            bookingService.book("Chris", "Charlie")
        } catch (e: RuntimeException) {
            logger.info("[The following exception is expect the person is too big for the DB]")
            logger.error(e.message)
        }
    }

    private fun queryBookedPerson() {
        for (person in bookingService.showAllBookings()!!) {
            logger.info("So far, $person is booked.")
        }
        if(bookingService.showAllBookings()!!.size == 3) {
            logger.info("2nd booking has been rolled back")
        }
    }


}