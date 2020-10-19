package com.example.demo.service.mapper

import com.example.demo.model.Event
import com.example.demo.service.dto.EventDto
import com.example.demo.service.dto.OrganizerDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional


@Component
class EventDtoMapper(
        private val addressDtoMapper: AddressDtoMapper,
        private val numberOfSeatsDtoMapper: NumberOfSeatsDtoMapper,
        private val organizerDtoMapper: OrganizerDtoMapper
) {

    @Transactional
    fun toDto(event: Event): EventDto? {
        var organizerDto: OrganizerDto = organizerDtoMapper.toDto(event.organizer)

        return EventDto.EventDtoBuilder()
                .id(event.id)
                .name(event.name)
                .startDate(event.startDate)
                .endDate(event.endDate)
                .organizer(organizerDto)
                .description(event.description)
                .comments(event.comments)
                .createdAt(event.createdAt)
                .updatedAt(event.updatedAt)
                .address(addressDtoMapper.toDto(event.address))
                .numberOfSeats(numberOfSeatsDtoMapper.toDto(event.numberOfSeats))
                .build()



    }




}