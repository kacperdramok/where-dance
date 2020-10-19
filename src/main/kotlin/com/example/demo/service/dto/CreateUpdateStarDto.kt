package com.example.demo.service.dto

import javax.validation.constraints.Size

class CreateUpdateStarDto {

    @Size(min = 3)
    private val name: String? = null
    private val country: String? = null
    private val description: String? = null
    private val comments: String? = null
}