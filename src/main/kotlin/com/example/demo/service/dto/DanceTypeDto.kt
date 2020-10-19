package com.example.demo.service.dto


import com.example.demo.service.EventService
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.time.OffsetDateTime
import java.util.*


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class DanceTypeDto{

    var id: Long? = null
     var name: String? = null
     var description: String? = null
     var comments: String? = null
     var createdAt: OffsetDateTime? = null
     var updatedAt: OffsetDateTime? = null

    @Builder.Default
     val events: List<EventService> = ArrayList<EventService>()


}