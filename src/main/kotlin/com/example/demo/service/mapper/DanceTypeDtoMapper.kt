package com.example.demo.service.mapper

import com.example.demo.model.DanceType
import com.example.demo.service.dto.DanceTypeDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional

@Component
class DanceTypeDtoMapper(){

    @Transactional
fun toDto(danceType: DanceType): DanceTypeDto{
        return DanceTypeDto().apply {
         id=danceType.id
         name=danceType.name
         description=danceType.description
         comments=danceType.comments
         createdAt=danceType.createdAt
         updatedAt=danceType.updatedAt

        }
    }

}
