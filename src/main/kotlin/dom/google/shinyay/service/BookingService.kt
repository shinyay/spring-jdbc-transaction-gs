package dom.google.shinyay.service

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BookingService(val jdbcTemplate: JdbcTemplate) {
}