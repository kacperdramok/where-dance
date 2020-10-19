package com.example.demo.service.dto

import lombok.Data
import lombok.NoArgsConstructor
import lombok.experimental.SuperBuilder
import java.time.OffsetDateTime
import javax.persistence.Embedded


@Data
@SuperBuilder
@NoArgsConstructor
abstract class UserDto {

    var id: Long? = null
    var name: String? = null
    var login: String? = null
    var email: String? = null
    var phoneNumber: String? = null
    var createdAt: OffsetDateTime? = null
    var updatedAt: OffsetDateTime? = null

    @Embedded
    var addressDto: AddressDto? = null

}