package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import java.time.OffsetDateTime
import javax.persistence.*

@Data
@Getter
@Entity
@SuperBuilder
@NoArgsConstructor
 abstract class User(  ) {


     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     protected var id:Long = 0
     protected var name:String=""
     protected var login:String=""
     protected var password:String=""
     protected var email:String=""
     protected var phoneNumber:String=""
     protected var role:String=""
     protected lateinit var createdAt:OffsetDateTime
     protected lateinit var updatedAt: OffsetDateTime

     @Embedded
     protected lateinit var address:Address



 }