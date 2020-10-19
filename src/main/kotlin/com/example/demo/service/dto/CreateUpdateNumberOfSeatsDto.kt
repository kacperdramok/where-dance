package com.example.demo.service.dto

import lombok.Builder
import lombok.Data
import javax.persistence.Embeddable
import javax.validation.constraints.NotBlank


@Data
@Embeddable
@Builder
class CreateUpdateNumberOfSeatsDto {

    @NotBlank
     var allSeats:  Int? = null
     var freeSeats: Int? = null
     var unconfirmedSeats: Int? = null
     var confirmedSeats: Int? = null
}