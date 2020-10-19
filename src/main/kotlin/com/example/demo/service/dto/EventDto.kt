package com.example.demo.service.dto

import lombok.*
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.Embedded

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class EventDto {

    private val id: Long? = null
    private val name: String? = null
    private val startDate: String? = null
    private val endDate: String? = null
    private val description: String? = null
    private val comments: String? = null
    private val createdAt: OffsetDateTime? = null
    private val updatedAt: OffsetDateTime? = null

    @Embedded
    private val address: AddressDto? = null
    private val numberOfSeats: NumberOfSeatsDto? = null

    @Builder.Default
    private val danceTypes: List<DanceTypeDto> = ArrayList()

    @Builder.Default
    private val stars: List<StarDto> = ArrayList<StarDto>()

    @Builder.Default
    private val participants: List<ParticipantDto> = ArrayList<ParticipantDto>()

    @Builder.Default
    private val organizer: OrganizerDto = OrganizerDto()
}