package com.example.demo.service.mapper

import com.example.demo.model.Star
import com.example.demo.service.dto.StarDto
import org.springframework.stereotype.Component
import javax.transaction.Transactional


@Component
abstract class StartDtoMapper {

    @Transactional
    open fun toDto(star: Star): StarDto {
        return StarDto().apply {
            id=star.id
                name=star.name
                country=star.country
                description=star.description
                comments=star.comments
                createdAt=star.createdAt
                updatedAt=star.updatedAt
        }
    }
}