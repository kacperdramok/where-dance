package com.example.demo.service.dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.experimental.SuperBuilder
import javax.persistence.Embeddable

@Data
@Embeddable
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
class AddressDto {

    var country: String? = null
    var postalCode: String? = null
    var city: String? = null
    var street: String? = null
    var number: String? = null
}