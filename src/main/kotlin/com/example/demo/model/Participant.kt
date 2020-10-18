package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import java.util.*
import javax.persistence.*



@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
class Participant: User() {

    private var surname: String = ""
    private var gender: String = ""

    @ManyToMany(mappedBy = "participants", cascade = [CascadeType.ALL])
    @Builder.Default
    private var events: List<Event> = ArrayList()
}