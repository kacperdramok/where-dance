package com.example.demo.service.dto

import javax.validation.constraints.Size;
import lombok.*


@Data
@Builder
class CreateUpdateDanceTypeDto() {

    @Size(min = 3)
    var name: String = ""
    var description: String = ""
    var comments: String = ""


}