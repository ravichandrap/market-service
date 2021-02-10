package com.market.service

import com.market.data.User

interface IUserService {
    fun saveUser(user: User): User
    fun getUsers(): List<User>
    fun updateUser(user: User): User
    fun print(message: String) = println("Message: $message")
    fun getUser(id: Int): User
    fun findByEmail(email: String): User
}