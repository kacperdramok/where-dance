package com.example.demo.service.dto

import lombok.*
import lombok.experimental.SuperBuilder
import java.util.*

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
class OrganizerDto: UserDto() {

    @Builder.Default
    var events: List<EventDto> = ArrayList()
}