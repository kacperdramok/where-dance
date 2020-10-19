package com.example.demo.service.dto

import com.fasterxml.jackson.annotation.JsonUnwrapped
import lombok.Builder
import lombok.Data
import javax.validation.constraints.NotBlank


@Data
@Builder
class CreateUpdateEventDto {

    @NotBlank
     var name:  String? = null
     var startDay: Int? = null
     var startMonth: Int? = null
     var startYear: Int? = null
     var endDay: Int? = null
     var endMonth: Int? = null
     var endYear: Int? = null

    @NotBlank
     var description:  String? = null
     var comments: String? = null
     var organizerLogin: String? = null

    @JsonUnwrapped
    @Builder.Default
    var createUpdateAddressDto = CreateUpdateAddressDto()

    @JsonUnwrapped
    @Builder.Default
     var createUpdateNumberOfSeatsDto: CreateUpdateNumberOfSeatsDto = CreateUpdateNumberOfSeatsDto()

}