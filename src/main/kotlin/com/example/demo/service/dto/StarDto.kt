package com.example.demo.service.dto

import lombok.*
import java.time.OffsetDateTime
import java.util.*


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class StarDto {

     var id: Long? = null
     var name: String? = null
    var country: String? = null
     var description: String? = null
     var comments: String? = null
     var createdAt: OffsetDateTime? = null
    var updatedAt: OffsetDateTime? = null

    @Builder.Default
     var events: List<EventDto> = ArrayList()
}