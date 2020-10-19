package com.example.demo.model

import lombok.*
import javax.persistence.Embeddable

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
class NumberOfSeats {

    var allSeats: Int = 0
    var freeSeats: Int = 0
    var unconfirmedSeats: Int = 0
    var confirmedSeats: Int = 0
}