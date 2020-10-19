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

    protected var id: Long? = null
    protected var name: String? = null
    protected var login: String? = null
    protected var email: String? = null
    protected var phoneNumber: String? = null
    protected var createdAt: OffsetDateTime? = null
    protected var updatedAt: OffsetDateTime? = null

    @Embedded
    protected var addressDto: AddressDto? = null

}