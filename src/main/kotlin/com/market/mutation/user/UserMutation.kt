package com.market.mutation.user

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.market.data.User
import com.market.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserMutation(@Autowired val service: UserService) : GraphQLMutationResolver{

    fun saveUser(name: String, email: String): User
            = service.saveUser(User(name, email, 1 ))

    fun updateUser(id: Int, name: String, email: String, password: String): User
            = service.updateUser(User(name, email, id, password))
}