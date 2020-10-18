package com.example.demo.model

import lombok.*
import lombok.experimental.SuperBuilder
import javax.persistence.Entity

@Getter
@Setter
@Entity
@NoArgsConstructor
@SuperBuilder
 class Admin() : User(){
}