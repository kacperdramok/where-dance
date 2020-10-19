package com.example.demo.service.dto

import lombok.Data
import lombok.NoArgsConstructor
import lombok.experimental.SuperBuilder
import javax.persistence.Embedded
import javax.validation.constraints.Email
import javax.validation.constraints.Size


@Data
@SuperBuilder
@NoArgsConstructor
abstract class CreateUpdateUserDto {

    @Size(min = 3)
     var name: String? = null

    @Size(min = 3)
    var login: String? = null

    @Size(min = 3)
    var password: String? = null

    @Email
    var email:  String? = null
    var phoneNumber: String? = null

    @Embedded
    var createUpdateAddressDto: CreateUpdateAddressDto? = null

}