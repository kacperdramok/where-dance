package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Getter
@Setter
@Entity
@NoArgsConstructor
@SuperBuilder
 class Admin : User(){
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
//  var id: Long = 0
}