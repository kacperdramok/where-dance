package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Data
@Entity
@NoArgsConstructor
@SuperBuilder
 class Admin : User(){

}