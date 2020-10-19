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
class Organizer(): User() {

    @OneToMany(mappedBy = "organizer", cascade = arrayOf(CascadeType.ALL))
    @Builder.Default
    var events: List<Event> = ArrayList()


}