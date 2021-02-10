package com.market.query.user

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.market.data.User
import com.market.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
@Component
class UserQuery(@Autowired val service: UserService): GraphQLQueryResolver {
    fun getUsers(): List<User> {
       val users = service.getUsers()
        users.forEach{ println(it.toString())}
        return users
    }
    fun getUser(id: Int): User = service.getUser(id)
    fun login(email: String,
              password: String): User?  {
        val user = service.findByEmail(email)
        if (user.password.equals(password))
            return user
        return User()
    }
}