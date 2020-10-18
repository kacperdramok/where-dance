package com.example.demo.repository


import com.example.demo.model.DanceType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DanceTypeRepository: JpaRepository<DanceType, Long> {
}