package com.example.demo.model

import javax.persistence.Embeddable


@Embeddable
data class Address private constructor(
        var country: String?,
        var postalCode: String?,
        var city: String?,
        var street: String?,
        var number: String?) {

data class AddressBuilder(
        var country: String?=null,
        var postalCode: String?=null,
        var city: String?=null,
        var street: String?=null,
        var number: String?=null
)

fun country(country : String) = apply { this.country =country }
fun postalCode(postalCode : String) = apply { this.postalCode =postalCode }
fun city( city: String) = apply { this.city = city}
fun street( street: String) = apply { this.street = street}
fun number( number: String) = apply { this.number =number }
fun build() = Address(country, postalCode, city, street, number)




}