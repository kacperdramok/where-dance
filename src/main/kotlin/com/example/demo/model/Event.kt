package com.example.demo.model

import lombok.*
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*



@Entity
@Table(name = "event")
class Event private constructor(builder: EventBuilder) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    var name: String?
    var startDate: String?
    var endDate: String?
    var description: String?
    var comments: String?
    var createdAt: OffsetDateTime?
    var updatedAt: OffsetDateTime?

    @Embedded
    var address: Address?

    @Embedded
    var numberOfSeats: NumberOfSeats?

    @ManyToMany
    var danceTypes: List<DanceType> = ArrayList()

    @ManyToMany
    var stars: List<Star> = ArrayList<Star>()

    @ManyToMany
    var participants: List<Participant> = ArrayList()

    @ManyToOne(cascade = arrayOf(CascadeType.PERSIST))
    var organizer: Organizer?


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

    class EventBuilder {
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
        var address: Address? = null
            private set
        var numberOfSeats: NumberOfSeats? = null
            private set
        var danceTypes: List<DanceType> = ArrayList()
            private set
        var stars: List<Star> = ArrayList<Star>()
            private set
        var participants: List<Participant> = ArrayList()
            private set
        var organizer: Organizer? = null
            private set


        fun id(id: Long) = apply { this.id = id }
        fun name(name: String) = apply { this.name = name }
        fun startDate(startDate: String) = apply { this.startDate = startDate }
        fun endDate(endDate: String) = apply { this.endDate = endDate }
        fun description(description: String) = apply { this.description = description }
        fun comments(comments: String) = apply { this.comments = comments }
        fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }
        fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }
        fun address(address: Address) = apply { this.address = address }
        fun numberOfSeats(numberOfSeats: NumberOfSeats) = apply { this.numberOfSeats = numberOfSeats }
        fun danceTypes(danceTypes: List<DanceType>) = apply { this.danceTypes = danceTypes }
        fun stars(stars: List<Star>) = apply { this.stars = stars }
        fun participants(participants: List<Participant>) = apply { this.participants = participants }
        fun organizer(organizer: Organizer) = apply { this.organizer = organizer }
        fun build() = Event(this)


    }


}
