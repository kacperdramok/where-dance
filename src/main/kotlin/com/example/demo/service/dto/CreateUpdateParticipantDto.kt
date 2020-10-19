package com.example.demo.service.dto

import lombok.*
import lombok.experimental.SuperBuilder

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
class CreateUpdateParticipantDto:  CreateUpdateUserDto(){

     var surname: String? = null
     var gender: String? = null
}