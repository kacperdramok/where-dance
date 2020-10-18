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
    private val id: Long = 0

     private var name: String =""
     private var description: String=""
     private var comments: String=""
     private lateinit var createdAt: OffsetDateTime
     private lateinit var updatedAt: OffsetDateTime

    @ManyToMany(mappedBy = "danceTypes", cascade = [CascadeType.ALL])
    @Builder.Default
    private var events: List<Event> = ArrayList()






}