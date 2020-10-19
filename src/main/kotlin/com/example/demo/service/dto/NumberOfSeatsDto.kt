package com.example.demo.service.dto

import lombok.*
import javax.persistence.Embeddable

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor

class NumberOfSeatsDto {

     var allSeats: Int? = null
     var freeSeats: Int? = null
     var unconfirmedSeats: Int? = null
    var confirmedSeats: Int? = null
}