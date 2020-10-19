package com.example.demo.service.mapper

import com.example.demo.model.Address
import com.example.demo.service.dto.AddressDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional

@Component
class AddressDtoMapper {

    @Transactional
fun toDto( address: Address): AddressDto {
        return AddressDto().apply {
            country=address.country
            postalCode=address.postalCode
            city=address.city
            street=address.street
            number=address.number
        }

    }

}