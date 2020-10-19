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
@Table(name = "dance_type")
class DanceType {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

     var name: String =""
     var description: String=""
     var comments: String=""
     lateinit var createdAt: OffsetDateTime
     lateinit var updatedAt: OffsetDateTime

    @ManyToMany(mappedBy = "danceTypes", cascade = [CascadeType.ALL])
    @Builder.Default
     var events: List<Event> = ArrayList()






}