package com.example.demo.model

import lombok.*
import javax.persistence.Embeddable

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
class NumberOfSeats {

    private var allSeats: Int = 0
    private var freeSeats: Int = 0
    private var unconfirmedSeats: Int = 0
    private var confirmedSeats: Int = 0
}