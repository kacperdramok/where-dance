package com.example.demo.service

import lombok.*
import lombok.experimental.SuperBuilder
import javax.transaction.Transactional

@Data
@SuperBuilder
@NoArgsConstructor
abstract class StartDtoMapper {

    @Transactional

}