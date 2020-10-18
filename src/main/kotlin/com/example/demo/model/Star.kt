package com.example.demo.model

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Star {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0

    private var name: String = ""
    private var country: String = ""
     private var description: String = ""
   private var comments: String = ""
    private lateinit var createdAt: OffsetDateTime
    private lateinit var updatedAt: OffsetDateTime

    @ManyToMany(mappedBy = "stars", cascade = [CascadeType.ALL])
    @Builder.Default
    private var events: List<Event> = ArrayList()

}