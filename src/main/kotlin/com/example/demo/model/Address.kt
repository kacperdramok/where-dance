package com.example.demo.model

import lombok.*
import javax.persistence.Embeddable

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Address() {
    var country: String?=null
    var postalCode: String?=null
    var city: String?=null
    var street: String?=null
    var number: String?=null

}