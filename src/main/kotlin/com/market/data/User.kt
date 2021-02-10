package com.market.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class User(
    val name: String = "",
    val email: String = "",
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    val id: Int = -1,
    var password: String? = "")
