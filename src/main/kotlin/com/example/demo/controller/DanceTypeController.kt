package com.example.demo.controller

import com.example.demo.service.DanceTypeService
import com.example.demo.service.dto.CreateUpdateDanceTypeDto
import com.example.demo.service.dto.DanceTypeDto
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dance-types")
class DanceTypeController(
        private val danceTypeService: DanceTypeService
) {


    @GetMapping()
    fun getAllDanceTypes(): List<DanceTypeDto> {
        return danceTypeService.getAllDanceTypes()
    }


    @GetMapping("/{id}")
    fun getDanceTypeById(@PathVariable id: Long): DanceTypeDto {
        return danceTypeService.getDanceTypeById(id)
    }


    @PostMapping()
    fun newDanceTypeDto(@RequestBody createUpdateDanceTypeDto: CreateUpdateDanceTypeDto): DanceTypeDto {
        return danceTypeService.createDanceType(createUpdateDanceTypeDto)
    }


    @PutMapping("/{id}")
    fun updateDanceTypeById(@PathVariable id: Long, @RequestBody createUpdateDanceTypeDto: CreateUpdateDanceTypeDto): DanceTypeDto {
        return danceTypeService.updateDanceTypeById(id, createUpdateDanceTypeDto)
    }

    @DeleteMapping("/{id}")
    fun deleteDanceTypeById(@PathVariable id: Long): DanceTypeDto {
        return danceTypeService.deleteDanceTypeById(id)
    }


}