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
class Organizer: User() {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//     var id: Long = 0


    @OneToMany(mappedBy = "organizer", cascade = arrayOf(CascadeType.ALL))
    @Builder.Default
    private var events: List<Event> = ArrayList()


}