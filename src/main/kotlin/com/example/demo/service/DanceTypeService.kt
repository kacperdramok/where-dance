package com.example.demo.service

import com.example.demo.exception.AlreadyExists
import com.example.demo.exception.BadRequest
import com.example.demo.exception.NotFound
import com.example.demo.model.DanceType
import com.example.demo.repository.DanceTypeRepository
import com.example.demo.service.dto.CreateUpdateDanceTypeDto
import com.example.demo.service.dto.DanceTypeDto
import com.example.demo.service.mapper.DanceTypeDtoMapper
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import java.util.*
import javax.transaction.Transactional


@Service
class DanceTypeService(
        private val repository: DanceTypeRepository,
        private val mapper: DanceTypeDtoMapper
) {


    @Transactional
    fun getAllDanceTypes(): List<DanceTypeDto> {

//return repository.findAll()
//        .stream()
//        .map{danceType  -> mapper.toDto(danceType)}
//        .collect(Collectors.toList())

        var list: MutableList<DanceTypeDto> = ArrayList<DanceTypeDto>()
        for (danceType: DanceType in repository.findAll()) {
            var danceTypeDto: DanceTypeDto = mapper.toDto(danceType)
            list.add(danceTypeDto)
        }
        return list

    }

    @Throws(NotFound::class)
    @Transactional
    fun getDanceTypeById(id: Long): DanceTypeDto {
        return repository.findById(id)
                .map { danceType: DanceType -> mapper.toDto(danceType) }
                .orElseThrow { NotFound() }
    }

    @Throws(BadRequest::class, AlreadyExists::class)
    @Transactional
    fun createDanceType(createUpdateDanceTypeDto: CreateUpdateDanceTypeDto): DanceTypeDto {

        var danceType: DanceType = DanceType().apply {
            name = createUpdateDanceTypeDto.name
            description = createUpdateDanceTypeDto.description
            comments = createUpdateDanceTypeDto.comments
            createdAt = OffsetDateTime.now()
        }
        var savedDanceType: DanceType = repository.save(danceType)
        return mapper.toDto(savedDanceType)
    }


    @Throws(NotFound::class, BadRequest::class, AlreadyExists::class)
    @Transactional
    fun updateDanceTypeById(id: Long, createUpdateDanceTypeDto: CreateUpdateDanceTypeDto): DanceTypeDto {
        var existingDanceType: DanceType = repository.findById(id).orElseThrow { NotFound() }

        existingDanceType.name = createUpdateDanceTypeDto.name
        existingDanceType.description = createUpdateDanceTypeDto.description
        existingDanceType.comments = createUpdateDanceTypeDto.comments
        existingDanceType.updatedAt = OffsetDateTime.now()

        var savedDanceType: DanceType = repository.save(existingDanceType)
        return mapper.toDto(savedDanceType)
    }


    @Throws(NotFound::class)
    @Transactional
    fun deleteDanceTypeById(id: Long): DanceTypeDto {
        var existingDanceType: DanceType = repository.findById(id).orElseThrow { NotFound() }
        repository.delete(existingDanceType)
        return mapper.toDto(existingDanceType)
    }


}


