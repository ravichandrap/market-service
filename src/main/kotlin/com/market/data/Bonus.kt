package com.market.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
 data class Bonus(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1,
    val name: String = "",
    val ratio: String = "",
    val announcement: String = "",
    val record: String = "",
    val exBonus: String = "")
