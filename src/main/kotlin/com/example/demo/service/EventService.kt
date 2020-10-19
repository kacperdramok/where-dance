package com.example.demo.service

import com.example.demo.exception.BadRequest
import com.example.demo.exception.NotFound
import com.example.demo.model.Event
import com.example.demo.repository.EventRepository
import com.example.demo.repository.OrganizerRepository
import com.example.demo.repository.ParticipantRepository
import com.example.demo.service.dto.CreateUpdateEventDto
import com.example.demo.service.dto.EventDto
import com.example.demo.service.mapper.EventDtoMapper
import com.example.demo.service.mapper.ParticipantDtoMapper
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class EventService(
        private val eventRepository: EventRepository,
        private val eventDtoMapper: EventDtoMapper,
        private val organizerRepository: OrganizerRepository,
        private val participantRepository: ParticipantRepository,
        private val participantDtoMapper: ParticipantDtoMapper
) {

    @Transactional
    fun getAllEvents(): MutableList<EventDto> {
//return eventRepository.findAll()
//        .stream()
//        .map { event ->eventDtoMapper.toDto(event) }
//        .collect(Collectors.toList())
        var list: MutableList<EventDto> = ArrayList()
        for (event: Event in eventRepository.findAll()) {
            var eventDto: EventDto = eventDtoMapper.toDto(event)
            list.add(eventDto)
        }
        return list
    }

    @Throws(NotFound::class)
    @Transactional
    fun getEventById(id: Long): EventDto {
return eventRepository.findById(id)
        .map{ event: Event ->eventDtoMapper.toDto(event) }
        .orElseThrow{NotFound()}
   }

    @Throws(NotFound::class, BadRequest::class)
    @Transactional
    fun createEvent(createUpdateEventDto: CreateUpdateEventDto): EventService {
TODO()
    }

    @Transactional
    fun updateEventById(id: Long, createUpdateEventDto: CreateUpdateEventDto): EventService {
        TODO()
    }

    @Transactional
    fun deleteEventById(id: Long): EventService {
        TODO()
    }


}