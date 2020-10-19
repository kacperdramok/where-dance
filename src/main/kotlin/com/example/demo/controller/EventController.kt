package com.example.demo.controller

import com.example.demo.exception.*
import com.example.demo.service.EventService
import com.example.demo.service.dto.CreateUpdateEventDto
import com.example.demo.service.dto.EventDto
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/events")
class EventController(
        private val eventService: EventService
) {


    @GetMapping
    fun getAllEvents(): List<EventDto> {
        return eventService.getAllEvents()
    }

    @GetMapping("/{id}")
    @Throws(NotFound::class)
    fun getEventById(@PathVariable id: Long): EventDto {
        return eventService.getEventById(id)
    }

    @PostMapping
    @Throws(BadRequest::class, NotFound::class)
    fun newEvent(@RequestBody createUpdateEventDto: CreateUpdateEventDto): EventService {
        return eventService.createEvent(createUpdateEventDto)
    }

    @PutMapping("/{id}")
    @Throws(NotFound::class, BadRequest::class)
    fun updateEventById(@PathVariable id: Long, createUpdateEventDto: CreateUpdateEventDto): EventService {
        return eventService.updateEventById(id, createUpdateEventDto)
    }

    @DeleteMapping("/{id}")
    @Throws(NotFound::class)
    fun deleteEventById(@PathVariable id: Long): EventService {
        return eventService.deleteEventById(id)
    }




}
