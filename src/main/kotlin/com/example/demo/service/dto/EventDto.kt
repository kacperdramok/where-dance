package com.example.demo.service.dto

import com.example.demo.model.*
import lombok.*
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*

@Data
class EventDto private constructor(builder: EventDtoBuilder) {

         var id: Long = 0
        var name: String?
        var startDate: String?
        var endDate: String?
        var description: String?
        var comments: String?
        var createdAt: OffsetDateTime?
        var updatedAt: OffsetDateTime?

        @Embedded
        var address: AddressDto?

        @Embedded
        var numberOfSeats: NumberOfSeatsDto?

    var danceTypes: List<DanceTypeDto> = ArrayList()
        var stars: List<StarDto> = ArrayList<StarDto>()
        var participants: List<ParticipantDto> = ArrayList()
        var organizer: OrganizerDto?


        init {
            this.id = builder.id
            this.name = builder.name
            this.startDate = builder.startDate
            this.endDate = builder.endDate
            this.description = builder.description
            this.comments = builder.comments
            this.createdAt = builder.createdAt
            this.updatedAt = builder.updatedAt
            this.address = builder.address
            this.numberOfSeats = builder.numberOfSeats
            this.danceTypes = builder.danceTypes
            this.stars = builder.stars
            this.participants = builder.participants
            this.organizer = builder.organizer


        }

        class EventDtoBuilder {
            var id: Long = 0
                private set
            var name: String? = null
                private set
            var startDate: String? = null
                private set
            var endDate: String? = null
                private set
            var description: String? = null
                private set
            var comments: String? = null
                private set
            var createdAt: OffsetDateTime? = null
                private set
            var updatedAt: OffsetDateTime? = null
                private set
            var address: AddressDto? = null
                private set
            var numberOfSeats: NumberOfSeatsDto? = null
                private set
            var danceTypes: List<DanceTypeDto> = ArrayList()
                private set
            var stars: List<StarDto> = ArrayList<StarDto>()
                private set
            var participants: List<ParticipantDto> = ArrayList()
                private set
            var organizer: OrganizerDto? = null
                private set


            fun id(id: Long) = apply { this.id = id }
            fun name(name: String?) = apply { this.name = name }
            fun startDate(startDate: String?) = apply { this.startDate = startDate }
            fun endDate(endDate: String?) = apply { this.endDate = endDate }
            fun description(description: String?) = apply { this.description = description }
            fun comments(comments: String?) = apply { this.comments = comments }
            fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }
            fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }
            fun address(address: AddressDto) = apply { this.address = address }
            fun numberOfSeats(numberOfSeats: NumberOfSeatsDto) = apply { this.numberOfSeats = numberOfSeats }
            fun danceTypes(danceTypes: List<DanceTypeDto>) = apply { this.danceTypes = danceTypes }
            fun stars(stars: List<StarDto>) = apply { this.stars = stars }
            fun participants(participants: List<ParticipantDto>) = apply { this.participants = participants }
            fun organizer(organizer: OrganizerDto?) = apply { this.organizer = organizer }
            fun build() = EventDto(this)


        }


    }

