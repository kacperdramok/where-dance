package com.example.demo.service.mapper

import com.example.demo.model.NumberOfSeats
import com.example.demo.service.dto.NumberOfSeatsDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional


@Component
class NumberOfSeatsDtoMapper {


    @Transactional
    fun toDto(numberOfSeats: NumberOfSeats): NumberOfSeatsDto {
        return NumberOfSeatsDto().apply {
            allSeats = numberOfSeats.allSeats
            freeSeats = numberOfSeats.freeSeats
            confirmedSeats = numberOfSeats.confirmedSeats
            unconfirmedSeats = numberOfSeats.unconfirmedSeats
        }
    }
}