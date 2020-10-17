package dom.google.shinyay.service

import dom.google.shinyay.logger
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BookingService(val jdbcTemplate: JdbcTemplate) {

    fun book(vararg persons: String) {
        for (person in persons) {
            logger.info("Booking $person in a seat...")
            jdbcTemplate.update("insert into BOOKINGS(FIRST_NAME) values (?)", person)
        }
    }
}