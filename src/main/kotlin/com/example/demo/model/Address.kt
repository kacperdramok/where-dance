package com.example.demo.model

import lombok.*
import javax.persistence.Embeddable

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
data class Address( var country: String,
        var postalCode: String,
        var city: String,
        var street: String,
        var number: String) {

}