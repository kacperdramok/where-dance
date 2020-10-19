package com.example.demo.service.mapper

import com.example.demo.model.Organizer
import com.example.demo.service.dto.AddressDto
import com.example.demo.service.dto.OrganizerDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional


@Component
class OrganizerDtoMapper(
        private val addressDtoMapper: AddressDtoMapper
) {

    @Transactional
    fun toDto(organizer: Organizer?): OrganizerDto? {
        var addressDto: AddressDto? = organizer.address?.let { addressDtoMapper.toDto(it) }

        return OrganizerDto().apply {
            id=organizer.id
                name=organizer.name
                login=organizer.login
                email=organizer.email
                phoneNumber=organizer.phoneNumber
                createdAt=organizer.createdAt
                updatedAt=organizer.updatedAt
                addressDto=addressDto
        }            }

}