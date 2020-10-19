package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import java.util.*
import javax.persistence.*
import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
class Participant: User() {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//     var id: Long = 0

    private var surname: String = ""
    private var gender: String = ""

    @ManyToMany(mappedBy = "participants", cascade = [CascadeType.ALL])
    @Builder.Default
    private var events: List<Event> = ArrayList()
}