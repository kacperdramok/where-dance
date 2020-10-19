package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import java.time.OffsetDateTime
import javax.persistence.*

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@Table(name = "users")
open abstract class User() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long = 0
    open var name: String? = null
    open var login: String? = null
    open var password: String? = null
    open var email: String? = null
    open var phoneNumber: String? = null
    open var role: String? = null
    open var createdAt: OffsetDateTime? = null
    open var updatedAt: OffsetDateTime? = null

    @Embedded
    open var address: Address? = null


}