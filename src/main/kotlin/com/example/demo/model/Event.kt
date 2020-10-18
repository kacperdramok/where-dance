package com.example.demo.model

import lombok.*
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*



@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0

    private var name: String = ""
    private var startDate: String = ""
    private var endDate: String = ""
    private var description: String = ""
    private var comments: String = ""
    private lateinit var createdAt: OffsetDateTime
    private lateinit var updatedAt: OffsetDateTime

    @Embedded
    private lateinit var address: Address

    @Embedded
    private lateinit var numberOfSeats: NumberOfSeats

    @ManyToMany
    @Builder.Default
    private var danceTypes: List<DanceType> = ArrayList()

    @ManyToMany
    @Builder.Default
    private var stars: List<Star> = ArrayList<Star>()

    @ManyToMany
    @Builder.Default
    private var participants: List<Participant> = ArrayList()

    @ManyToOne(cascade = arrayOf(CascadeType.PERSIST))
    private lateinit var organizer: Organizer
}
