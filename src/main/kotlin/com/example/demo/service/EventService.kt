package com.example.demo.service

import com.example.demo.repository.EventRepository
import com.example.demo.repository.OrganizerRepository
import com.example.demo.repository.ParticipantRepository
import com.example.demo.service.dto.CreateUpdateEventDto
import com.example.demo.service.mapper.DanceTypeDtoMapper
import com.example.demo.service.mapper.EventDtoMapper
import com.example.demo.service.mapper.ParticipantDtoMapper
import org.springframework.stereotype.Service

@Service
class EventService(
        private val eventRepository: EventRepository,
        private val eventDtoMapper: EventDtoMapper,
        private val organizerRepository: OrganizerRepository,
        private val participantRepository: ParticipantRepository,
        private val participantDtoMapper: ParticipantDtoMapper
) {

    fun getAllEvents(): List<EventService> {

    }

    fun getEventById(id: Long): EventService {

    }

    fun createEvent(createUpdateEventDto: CreateUpdateEventDto): EventService {

    }

    fun updateEventById(id: Long, createUpdateEventDto: CreateUpdateEventDto): EventService {

    }

    fun deleteEventById(id: Long): EventService {

    }


}