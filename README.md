# Spring Data JDBC with Transaction Management

Without JDBC Code, Spring Data JDBC makes it to manage Transactional operation

## Description
### Dependencies
- **Spring Data JDBC**
  - `org.springframework.boot:spring-boot-starter-data-jdbc`
- H2 Database (for Testing)
  - `com.h2database:h2`

### JDBC Template
```kotlin
for (person in persons) {
    jdbcTemplate.update("insert into BOOKINGS(FIRST_NAME) values (?)", person)
}
```

### @Transactional
Transactional annotation enables the operation to roll back.

### Schema SQL
- `src/main/resources/schema.sql`

```sql
drop table BOOKINGS if exists;
create table BOOKINGS(ID serial, FIRST_NAME varchar(5) NOT NULL);
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
