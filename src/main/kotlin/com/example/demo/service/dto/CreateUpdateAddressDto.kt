package com.example.demo.service.dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.experimental.SuperBuilder
import javax.persistence.Embeddable
import javax.validation.constraints.Size

@Data
@Embeddable
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
class CreateUpdateAddressDto {

    @Size(min = 3)
    protected var country: String? = null
    protected var postalCode: String? = null
    protected var city: String? = null
    protected var street: String? = null
    protected var number: String? = null
}