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
@Table(name = "star")
class Star {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   var id: Long = 0

   var name: String = ""
   var country: String = ""
   var description: String = ""
   var comments: String = ""
   lateinit var createdAt: OffsetDateTime
   lateinit var updatedAt: OffsetDateTime

    @ManyToMany(mappedBy = "stars", cascade = [CascadeType.ALL])
    @Builder.Default
   var events: List<Event> = ArrayList()

}