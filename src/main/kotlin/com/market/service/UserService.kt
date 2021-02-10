package com.market.service

import com.market.data.User
import com.market.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val repo: UserRepository): IUserService {
    override fun saveUser(user: User): User{
        val savedUser = repo.save(user)
        print(savedUser.toString())
        return savedUser
    }
    override fun getUsers(): List<User> = repo.findAll()
    override fun updateUser(user: User): User = saveUser(user)
    override fun getUser(id: Int): User = repo.findById(id).get();
    override fun findByEmail(email: String): User = repo.findByEmail(email).get()
}