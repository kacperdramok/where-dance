package com.example.demo.service.dto

import lombok.*
import lombok.experimental.SuperBuilder
import java.util.*


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
class ParticipantDto: UserDto() {

    var surname: String? = null
    var gender: String? = null

    @Builder.Default
    var events: List<EventDto> = ArrayList()

}