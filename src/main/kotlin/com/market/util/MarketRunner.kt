package com.market.util

import com.market.data.User
import com.market.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class MarketRunner(@Autowired private val repo: UserRepository): CommandLineRunner {
    override fun run(vararg args: String?) {
       for (i in 1..3) {
           repo.save(User("Name:$i",
                       "email: $i",
                        i,
           "password$i"));
       }
    }
}