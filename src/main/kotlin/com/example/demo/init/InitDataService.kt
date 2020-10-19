package com.example.demo.init

import com.example.demo.exception.NotFound
import com.example.demo.model.Admin
import com.example.demo.repository.AdminRepository
import org.springframework.stereotype.Service
import java.time.OffsetDateTime
import javax.annotation.PostConstruct


@Service
class InitDataService(
        private val adminRepository: AdminRepository
) {


    @PostConstruct
    @Throws(NotFound::class)
    fun init() {
        adminRepository.save(Admin().apply {
                name="Kajetan"
                login="admin_kajetan"
                password="kajetan_password"
                email="kajetan.kapela@gmail.com"
                phoneNumber="668165940"
                role="ADMIN"
                createdAt=OffsetDateTime.now()
                })
    }

}