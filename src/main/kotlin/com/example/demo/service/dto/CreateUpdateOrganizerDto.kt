package com.example.demo.service.dto

import lombok.*
import lombok.experimental.SuperBuilder

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
class CreateUpdateOrganizerDto: CreateUpdateUserDto() {
}