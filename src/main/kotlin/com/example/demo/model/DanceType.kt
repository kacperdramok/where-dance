package com.example.demo.model

import lombok.*
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "dance_type")
class DanceType private constructor(builder: DanceTypeBuilder) {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long

    var name: String?
    var description: String?
    var comments: String?
    var createdAt: OffsetDateTime?
    var updatedAt: OffsetDateTime?

    @ManyToMany(mappedBy = "danceTypes", cascade = [CascadeType.ALL])
    @Builder.Default
    var events: List<Event> = ArrayList()

    init {
        this.id = builder.id
        this.name = builder.name
        this.description = builder.description
        this.comments = builder.comments
        this.createdAt = builder.createdAt
        this.updatedAt = builder.updatedAt
        this.events = builder.events
    }


    class DanceTypeBuilder {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
            private set
        var name: String? = null
            private set
        var description: String? = null
            private set
        var comments: String? = null
            private set
        var createdAt: OffsetDateTime? = null
            private set
        var updatedAt: OffsetDateTime? = null
            private set

        @ManyToMany(mappedBy = "danceTypes", cascade = [CascadeType.ALL])
        var events: List<Event> = ArrayList()
            private set


        fun id(id: Long) = apply { this.id = id }
        fun name(name: String) = apply { this.name = name }
        fun description(description: String) = apply { this.description = description }
        fun comments(comments: String) = apply { this.comments = comments }
        fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }
        fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }
        fun events(events: List<Event>) = apply { this.events = events }
        fun build() = DanceType(this)


    }


}